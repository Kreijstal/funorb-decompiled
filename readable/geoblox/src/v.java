/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class v {
    private int field_a;
    private int field_h;
    private int field_v;
    private int field_c;
    static String createPasswordConfirmationText;
    private int field_p;
    private int field_b;
    private int field_k;
    private int field_d;
    private int field_j;
    private int field_f;
    private int field_g;
    private float field_i;
    static java.awt.Color field_q;
    private int field_o;
    static String field_e;
    private db field_u;
    private int field_s;
    static String tutorialSkipMessage;
    private boolean field_t;
    static gk field_l;
    static long field_r;

    public static void a(boolean param0) {
        tutorialSkipMessage = null;
        createPasswordConfirmationText = null;
        field_l = null;
        if (param0) {
            field_q = null;
            field_e = null;
            return;
        }
        byte[] var2 = (byte[]) null;
        v.decompressArchive((byte[]) null, -18);
        field_q = null;
        field_e = null;
    }

    final void a(byte param0, int param1, int param2) {
        this.field_d = param2;
        if (param0 < 125) {
            this.a((byte) 31);
            this.field_p = param1;
            return;
        }
        this.field_p = param1;
    }

    final static byte[] decompressArchive(byte[] packedBytes, int uncompressedTypeComplement) {
        byte[] uncompressedBytesBeforeReturn = null;
        byte[] decompressedBytesBeforeReturn = null;
        RuntimeException unpackFailureBeforeContext = null;
        StringBuilder unpackMessagePrefix = null;
        String packedBytesDescription = null;
        Throwable caughtUnpackFailure = null;
        RuntimeException unpackFailureForContext = null;
        int compressionType = 0;
        int packedLength = 0;
        int unpackedLength = 0;
        byte[] uncompressedBytes = null;
        byte[] decompressedBytes = null;
        Object gzipInflaterMonitor = null;
        ByteArrayBuffer buffer = null;
        byte[] uncompressedBytesAlias = null;
        byte[] decompressedBytesAlias = null;
        byte[] allocatedUncompressedBytes = null;
        byte[] allocatedDecompressedBytes = null;
        try {
          L0: {
            buffer = new ByteArrayBuffer(packedBytes);
            compressionType = buffer.readUnsignedByte((byte) 34);
            packedLength = buffer.readIntBE((byte) -97);
            if (packedLength >= 0) {
              if ((uj.maximumArchiveLength != 0) &&
                  (packedLength > uj.maximumArchiveLength)) {
                break L0;
              }
              if (uncompressedTypeComplement == ~compressionType) {
                allocatedUncompressedBytes = new byte[packedLength];
                uncompressedBytesAlias = allocatedUncompressedBytes;
                uncompressedBytes = uncompressedBytesAlias;
                buffer.readBytes(29915, packedLength, allocatedUncompressedBytes, 0);
                uncompressedBytesBeforeReturn = (byte[]) (uncompressedBytes);
                return uncompressedBytesBeforeReturn;
              }
              L2: {
                unpackedLength = buffer.readIntBE((byte) -49);
                if (unpackedLength >= 0) {
                  if ((uj.maximumArchiveLength != 0) &&
                      (uj.maximumArchiveLength < unpackedLength)) {
                    break L2;
                  }
                  allocatedDecompressedBytes = new byte[unpackedLength];
                  decompressedBytesAlias = allocatedDecompressedBytes;
                  decompressedBytes = decompressedBytesAlias;
                  if (compressionType == 1) {
                    Bzip2Decoder.decompressInto(allocatedDecompressedBytes, unpackedLength, packedBytes, packedLength, 9);
                  } else {
                    gzipInflaterMonitor = AwtRasterBuffer.archiveGzipInflater;
                    synchronized (gzipInflaterMonitor) {
                      AwtRasterBuffer.archiveGzipInflater.inflateInto(uncompressedTypeComplement + 0, buffer, allocatedDecompressedBytes);
                    }
                  }
                  decompressedBytesBeforeReturn = (byte[]) (decompressedBytes);
                  return decompressedBytesBeforeReturn;
                }
              }
              throw new RuntimeException();
            }
          }
          throw new RuntimeException();
        } catch (java.lang.RuntimeException unpackFailure) {
          caughtUnpackFailure = unpackFailure;
          unpackFailureForContext = (RuntimeException) (Object) caughtUnpackFailure;
          unpackFailureBeforeContext = (RuntimeException) (unpackFailureForContext);
          unpackMessagePrefix = new StringBuilder().append("v.C(");
          if (packedBytes == null) {
            packedBytesDescription = "null";
          } else {
            packedBytesDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) unpackFailureBeforeContext), ((StringBuilder) (Object) unpackMessagePrefix).append(packedBytesDescription).append(',').append(uncompressedTypeComplement).append(')').toString());
        }
    }

    final void b(byte param0) {
        this.field_u.a(-2964, this.field_g, this.field_b);
        if (param0 > -5) {
            this.b(false);
        }
    }

    final void a(byte param0) {
        int fieldTemp$1 = 0;
        int fieldTemp$0 = 0;
        int fieldTemp$3 = 0;
        int fieldTemp$2 = 0;
        if (null != InstrumentPatch.field_n) {
          return;
        }
        if (param0 < -108) {
          if (og.field_n <= 0) {
            this.field_t = false;
            if (this.field_t) {
              fieldTemp$1 = this.field_c - 1;
              this.field_c = this.field_c - 1;
              if (0 < fieldTemp$1) {
                return;
              }
              this.field_c = this.field_s;
              if (this.field_k > li.field_c) {
                this.field_t = false;
              } else {
                this.b(true);
              }
              return;
            }
            if (this.field_d <= kh.field_d) {
              if (this.field_d > 0) {
                PrefixCodeDecoder.field_b = 0;
              }
            } else {
              PrefixCodeDecoder.field_b = (-kh.field_d + this.field_d) / 2;
            }
          } else {
            if (this.field_t) {
              fieldTemp$0 = this.field_c - 1;
              this.field_c = this.field_c - 1;
              if (0 < fieldTemp$0) {
                return;
              }
              this.field_c = this.field_s;
              if (this.field_k > li.field_c) {
                this.field_t = false;
              } else {
                this.b(true);
              }
              return;
            }
            if (this.field_d > kh.field_d) {
              PrefixCodeDecoder.field_b = (-kh.field_d + this.field_d) / 2;
            } else {
              if (this.field_d > 0) {
                PrefixCodeDecoder.field_b = 0;
              }
            }
          }
          if ((kh.field_d == this.field_a) &&
              (ok.field_c == this.field_h)) {
            return;
          }
          this.field_u.a(-2964, this.field_a, this.field_h);
          return;
        }
        this.field_a = -79;
        if (og.field_n > 0) {
          if (this.field_t) {
            fieldTemp$3 = this.field_c - 1;
            this.field_c = this.field_c - 1;
            if (0 < fieldTemp$3) {
              return;
            }
            this.field_c = this.field_s;
            if (this.field_k > li.field_c) {
              this.field_t = false;
            } else {
              this.b(true);
            }
            return;
          }
          if (this.field_d <= kh.field_d) {
            if (this.field_d > 0) {
              PrefixCodeDecoder.field_b = 0;
            }
          } else {
            PrefixCodeDecoder.field_b = (-kh.field_d + this.field_d) / 2;
          }
        } else {
          this.field_t = false;
          if (this.field_t) {
            fieldTemp$2 = this.field_c - 1;
            this.field_c = this.field_c - 1;
            if (0 < fieldTemp$2) {
              return;
            }
            this.field_c = this.field_s;
            if (this.field_k > li.field_c) {
              this.field_t = false;
            } else {
              this.b(true);
            }
            return;
          }
          if (this.field_d > kh.field_d) {
            PrefixCodeDecoder.field_b = (-kh.field_d + this.field_d) / 2;
          } else {
            if (this.field_d > 0) {
              PrefixCodeDecoder.field_b = 0;
            }
          }
        }
        if (kh.field_d != this.field_a) {
          this.field_u.a(-2964, this.field_a, this.field_h);
        } else {
          if (ok.field_c != this.field_h) {
            this.field_u.a(-2964, this.field_a, this.field_h);
          }
        }
    }

    private final void b(boolean param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        var5 = Geoblox.field_C;
        var2 = this.field_d;
        var3 = this.field_p;
        if (!this.a(-123)) {
          this.field_t = false;
          return;
        }
        if (this.field_j >= var2) {
          if (var2 < this.field_f) {
            var2 = this.field_f;
          }
        } else {
          var2 = this.field_j;
        }
        if (var3 > this.field_v) {
          var3 = this.field_v;
          if (!(0.0f < this.field_i)) {
            if (!param0) {
              return;
            }
            if (kh.field_d != var2) {
              this.field_u.a(-2964, var2, var3);
            } else {
              if (var3 != ok.field_c) {
                this.field_u.a(-2964, var2, var3);
              }
            }
            if (this.field_d > 0) {
              PrefixCodeDecoder.field_b = (-kh.field_d + this.field_d) / 2;
            }
            return;
          }
          var4 = (int)(0.5f + (float)var3 * this.field_i);
          if (var4 > var2) {
            var3 = (int)((float)var2 / this.field_i);
          } else {
            if (var4 >= var2) {
              if (!param0) {
                return;
              }
              if (kh.field_d != var2) {
                this.field_u.a(-2964, var2, var3);
              } else {
                if (var3 != ok.field_c) {
                  this.field_u.a(-2964, var2, var3);
                }
              }
              if (this.field_d > 0) {
                PrefixCodeDecoder.field_b = (-kh.field_d + this.field_d) / 2;
              }
              return;
            }
            var2 = var4;
          }
          if (!param0) {
            return;
          }
          if (kh.field_d != var2) {
            this.field_u.a(-2964, var2, var3);
          } else {
            if (var3 != ok.field_c) {
              this.field_u.a(-2964, var2, var3);
            }
          }
          if (this.field_d <= 0) {
            return;
          }
          PrefixCodeDecoder.field_b = (-kh.field_d + this.field_d) / 2;
          return;
        }
        if (var3 < this.field_o) {
          var3 = this.field_o;
        }
        if (!(0.0f < this.field_i)) {
          if (!param0) {
            return;
          }
          if (kh.field_d != var2) {
            this.field_u.a(-2964, var2, var3);
          } else {
            if (var3 != ok.field_c) {
              this.field_u.a(-2964, var2, var3);
            }
          }
          if (this.field_d <= 0) {
            return;
          }
          PrefixCodeDecoder.field_b = (-kh.field_d + this.field_d) / 2;
          return;
        }
        var4 = (int)(0.5f + (float)var3 * this.field_i);
        if (var4 > var2) {
          var3 = (int)((float)var2 / this.field_i);
          if (!param0) {
            return;
          }
          if (kh.field_d != var2) {
            this.field_u.a(-2964, var2, var3);
          } else {
            if (var3 != ok.field_c) {
              this.field_u.a(-2964, var2, var3);
            }
          }
        } else {
          if (var4 < var2) {
            var2 = var4;
            if (!param0) {
              return;
            }
            if (kh.field_d != var2) {
              this.field_u.a(-2964, var2, var3);
              if (this.field_d > 0) {
                PrefixCodeDecoder.field_b = (-kh.field_d + this.field_d) / 2;
              }
              return;
            }
            if (var3 != ok.field_c) {
              this.field_u.a(-2964, var2, var3);
              if (this.field_d > 0) {
                PrefixCodeDecoder.field_b = (-kh.field_d + this.field_d) / 2;
              }
              return;
            }
          } else {
            if (!param0) {
              return;
            }
            if (kh.field_d != var2) {
              this.field_u.a(-2964, var2, var3);
            } else {
              if (var3 != ok.field_c) {
                this.field_u.a(-2964, var2, var3);
              }
            }
          }
        }
        if (this.field_d <= 0) {
          return;
        }
        PrefixCodeDecoder.field_b = (-kh.field_d + this.field_d) / 2;
        return;
    }

    final boolean a(int param0) {
        if (param0 > -91) {
            createPasswordConfirmationText = (String) null;
            if (li.field_c < this.field_k) {
                return false;
            }
            if (og.field_n > 0) {
                return true;
            }
            return false;
        }
        if (li.field_c < this.field_k) {
            return false;
        }
        if (og.field_n > 0) {
            return true;
        }
        return false;
    }

    private v() throws Throwable {
        throw new Error();
    }

    final static boolean a(String param0, byte param1) {
        RuntimeException var2 = null;
        boolean stackIn_5_0 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 <= 12) {
            field_e = (String) null;
          }
          stackIn_5_0 = !(jg.a((byte) -62, param0) == null);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_8_0 = (RuntimeException) (var2);
          stackIn_8_1 = new StringBuilder().append("v.B(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        createPasswordConfirmationText = "Confirm Password: ";
        field_e = null;
        tutorialSkipMessage = "To skip this tutorial, press <img=3> at any point.";
        field_q = new java.awt.Color(10040319);
        field_l = new gk();
    }
}
