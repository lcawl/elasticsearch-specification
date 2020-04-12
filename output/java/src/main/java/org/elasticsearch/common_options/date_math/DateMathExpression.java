
package org.elasticsearch.common_options.date_math;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;


public class DateMathExpression  implements XContentable<DateMathExpression> {
  

  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    
    return builder;
  }

  @Override
  public DateMathExpression fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return DateMathExpression.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<DateMathExpression, Void> PARSER =
    new ConstructingObjectParser<>(DateMathExpression.class.getName(), false, args -> new DateMathExpression());

  static {
    
  }

}
