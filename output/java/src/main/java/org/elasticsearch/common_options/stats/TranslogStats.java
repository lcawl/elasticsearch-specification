
package org.elasticsearch.common_options.stats;

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
import org.elasticsearch.internal.*;

public class TranslogStats  implements XContentable<TranslogStats> {
  
  static final ParseField EARLIEST_LAST_MODIFIED_AGE = new ParseField("earliest_last_modified_age");
  private Long _earliestLastModifiedAge;
  public Long getEarliestLastModifiedAge() { return this._earliestLastModifiedAge; }
  public TranslogStats setEarliestLastModifiedAge(Long val) { this._earliestLastModifiedAge = val; return this; }


  static final ParseField OPERATIONS = new ParseField("operations");
  private Long _operations;
  public Long getOperations() { return this._operations; }
  public TranslogStats setOperations(Long val) { this._operations = val; return this; }


  static final ParseField SIZE = new ParseField("size");
  private String _size;
  public String getSize() { return this._size; }
  public TranslogStats setSize(String val) { this._size = val; return this; }


  static final ParseField SIZE_IN_BYTES = new ParseField("size_in_bytes");
  private Long _sizeInBytes;
  public Long getSizeInBytes() { return this._sizeInBytes; }
  public TranslogStats setSizeInBytes(Long val) { this._sizeInBytes = val; return this; }


  static final ParseField UNCOMMITTED_OPERATIONS = new ParseField("uncommitted_operations");
  private Integer _uncommittedOperations;
  public Integer getUncommittedOperations() { return this._uncommittedOperations; }
  public TranslogStats setUncommittedOperations(Integer val) { this._uncommittedOperations = val; return this; }


  static final ParseField UNCOMMITTED_SIZE = new ParseField("uncommitted_size");
  private String _uncommittedSize;
  public String getUncommittedSize() { return this._uncommittedSize; }
  public TranslogStats setUncommittedSize(String val) { this._uncommittedSize = val; return this; }


  static final ParseField UNCOMMITTED_SIZE_IN_BYTES = new ParseField("uncommitted_size_in_bytes");
  private Long _uncommittedSizeInBytes;
  public Long getUncommittedSizeInBytes() { return this._uncommittedSizeInBytes; }
  public TranslogStats setUncommittedSizeInBytes(Long val) { this._uncommittedSizeInBytes = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    builder.field(EARLIEST_LAST_MODIFIED_AGE.getPreferredName(), _earliestLastModifiedAge);
    builder.field(OPERATIONS.getPreferredName(), _operations);
    builder.field(SIZE.getPreferredName(), _size);
    builder.field(SIZE_IN_BYTES.getPreferredName(), _sizeInBytes);
    builder.field(UNCOMMITTED_OPERATIONS.getPreferredName(), _uncommittedOperations);
    builder.field(UNCOMMITTED_SIZE.getPreferredName(), _uncommittedSize);
    builder.field(UNCOMMITTED_SIZE_IN_BYTES.getPreferredName(), _uncommittedSizeInBytes);
    return builder;
  }

  @Override
  public TranslogStats fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return TranslogStats.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<TranslogStats, Void> PARSER =
    new ConstructingObjectParser<>(TranslogStats.class.getName(), false, args -> new TranslogStats());

  static {
    PARSER.declareLong(TranslogStats::setEarliestLastModifiedAge, EARLIEST_LAST_MODIFIED_AGE);
    PARSER.declareLong(TranslogStats::setOperations, OPERATIONS);
    PARSER.declareString(TranslogStats::setSize, SIZE);
    PARSER.declareLong(TranslogStats::setSizeInBytes, SIZE_IN_BYTES);
    PARSER.declareInt(TranslogStats::setUncommittedOperations, UNCOMMITTED_OPERATIONS);
    PARSER.declareString(TranslogStats::setUncommittedSize, UNCOMMITTED_SIZE);
    PARSER.declareLong(TranslogStats::setUncommittedSizeInBytes, UNCOMMITTED_SIZE_IN_BYTES);
  }

}
