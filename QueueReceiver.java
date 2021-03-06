/*
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
 *
 * Copyright (c) 1997-2014 Oracle and/or its affiliates. All rights reserved.
 *
 * The contents of this file are subject to the terms of either the GNU
 * General Public License Version 2 only ("GPL") or the Common Development
 * and Distribution License("CDDL") (collectively, the "License").  You
 * may not use this file except in compliance with the License.  You can
 * obtain a copy of the License at
 * https://glassfish.dev.java.net/public/CDDL+GPL_1_1.html
 * or packager/legal/LICENSE.txt.  See the License for the specific
 * language governing permissions and limitations under the License.
 *
 * When distributing the software, include this License Header Notice in each
 * file and include the License file at packager/legal/LICENSE.txt.
 *
 * GPL Classpath Exception:
 * Oracle designates this particular file as subject to the "Classpath"
 * exception as provided by Oracle in the GPL Version 2 section of the License
 * file that accompanied this code.
 *
 * Modifications:
 * If applicable, add the following below the License Header, with the fields
 * enclosed by brackets [] replaced by your own identifying information:
 * "Portions Copyright [year] [name of copyright owner]"
 *
 * Contributor(s):
 * If you wish your version of this file to be governed by only the CDDL or
 * only the GPL Version 2, indicate your decision by adding "[Contributor]
 * elects to include this software in this distribution under the [CDDL or GPL
 * Version 2] license."  If you don't indicate a single choice of license, a
 * recipient has the option to distribute your version of this file under
 * either the CDDL, the GPL Version 2 or to extend the choice of license to
 * its licensees as provided above.  However, if you add GPL Version 2 code
 * and therefore, elected the GPL Version 2 license, then the option applies
 * only if the new code is made subject to such option by the copyright
 * holder.
 */

package javax.jms;


/** A client uses a {@code QueueReceiver} object to receive messages that 
 * have been delivered to a queue.
 *
 * <P>Although it is possible to have multiple {@code QueueReceiver}s
 * for the same queue, the JMS API does not define how messages are
 * distributed between the {@code QueueReceiver}s.
 *
 * <P>If a {@code QueueReceiver} specifies a message selector, the
 * messages that are not selected remain on the queue. By definition, a message
 * selector allows a {@code QueueReceiver} to skip messages. This
 * means that when the skipped messages are eventually read, the total ordering
 * of the reads does not retain the partial order defined by each message
 * producer. Only {@code QueueReceiver}s without a message selector
 * will read messages in message producer order.
 *
 * <P>Creating a {@code MessageConsumer} provides the same features as
 * creating a {@code QueueReceiver}. A {@code MessageConsumer} object is
 * recommended for creating new code. The  {@code QueueReceiver} is
 * provided to support existing code.
 *
 * @see         javax.jms.Session#createConsumer(Destination, String)
 * @see         javax.jms.Session#createConsumer(Destination)
 * @see         javax.jms.QueueSession#createReceiver(Queue, String)
 * @see         javax.jms.QueueSession#createReceiver(Queue)
 * @see         javax.jms.MessageConsumer
 *
 * @version JMS 2.0
 * @since JMS 1.0
 *
 */

public interface QueueReceiver extends MessageConsumer {

    /** Gets the {@code Queue} associated with this queue receiver.
     *
     * @return this receiver's {@code Queue}
     *
     * @exception JMSException if the JMS provider fails to get the queue for
     *                         this queue receiver
     *                         due to some internal error.
     */

    Queue
    getQueue() throws JMSException;
}
