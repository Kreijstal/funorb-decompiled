/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class fs {
    private long field_b;
    private long field_i;
    static long field_a;
    static as field_d;
    private RandomAccessFile field_h;
    static vd field_e;
    static String field_f;
    static int field_c;
    static String field_g;

    public static void a(byte param0) {
        field_f = null;
        field_e = null;
        field_g = null;
        field_d = null;
        if (param0 <= 104) {
            fs.a((byte) -17);
        }
    }

    protected final void finalize() throws Throwable {
        if (!(null == this.field_h)) {
            System.out.println("");
            this.a(19260);
        }
    }

    final int a(int param0, byte param1, int param2, byte[] param3) throws IOException {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var5_int = this.field_h.read(param3, param2, param0);
              if (0 < var5_int) {
                this.field_b = this.field_b + (long)var5_int;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param1 == 53) {
                break L2;
              } else {
                this.field_h = (RandomAccessFile) null;
                break L2;
              }
            }
            stackIn_6_0 = var5_int;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var5);

            stackIn_9_1 = new StringBuilder().append("fs.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
        return stackIn_6_0;
    }

    final void a(byte[] param0, int param1, int param2, int param3) throws IOException {
        try {
            if ((long)param3 - -this.field_b > this.field_i) {
                this.field_h.seek(this.field_i);
                this.field_h.write(1);
                throw new EOFException();
            }
            this.field_h.write(param0, param1, param3);
            if (param2 < 5) {
                byte[] var6 = (byte[]) null;
                fs.a(false, -127, (CharSequence) null, (byte[]) null, -72, -17);
            }
            this.field_b = this.field_b + (long)param3;
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) ((Object) runtimeException), "fs.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void a(long param0, boolean param1) throws IOException {
        this.field_h.seek(param0);
        this.field_b = param0;
        if (!param1) {
            fs.a((byte) 118);
        }
    }

    final void a(int param0) throws IOException {
        if (param0 != 19260) {
            field_d = (as) null;
        }
        if (!(null == this.field_h)) {
            this.field_h.close();
            this.field_h = null;
        }
    }

    final static int a(boolean param0, int param1, CharSequence param2, byte[] param3, int param4, int param5) {
        int stackIn_3_0 = 0;
        int stackIn_70_0 = 0;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        String stackIn_74_2 = null;
        StringBuilder stackIn_76_1 = null;
        StringBuilder stackIn_77_1 = null;
        String stackIn_77_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            if (!param0) {
              var6_int = param1 + -param5;
              var7 = 0;
              L1: while (true) {
                if (var6_int <= var7) {
                  stackIn_70_0 = var6_int;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L2: {
                    L3: {
                      L4: {
                        var8 = param2.charAt(var7 + param5);
                        if (var8 <= 0) {
                          break L4;
                        } else {
                          if (var8 < 128) {
                            break L3;
                          } else {
                            break L4;
                          }
                        }
                      }
                      L5: {
                        if (160 > var8) {
                          break L5;
                        } else {
                          if (var8 <= 255) {
                            break L3;
                          } else {
                            break L5;
                          }
                        }
                      }
                      if (var8 == 8364) {
                        param3[param4 - -var7] = (byte)-128;
                        break L2;
                      } else {
                        if (var8 != 8218) {
                          if (var8 != 402) {
                            if (8222 == var8) {
                              param3[param4 - -var7] = (byte)-124;
                              break L2;
                            } else {
                              if (8230 == var8) {
                                param3[var7 + param4] = (byte)-123;
                                break L2;
                              } else {
                                if (8224 != var8) {
                                  if (var8 == 8225) {
                                    param3[param4 - -var7] = (byte)-121;
                                    break L2;
                                  } else {
                                    if (710 != var8) {
                                      if (8240 == var8) {
                                        param3[param4 + var7] = (byte)-119;
                                        break L2;
                                      } else {
                                        if (352 == var8) {
                                          param3[param4 + var7] = (byte)-118;
                                          break L2;
                                        } else {
                                          if (var8 != 8249) {
                                            if (var8 == 338) {
                                              param3[param4 - -var7] = (byte)-116;
                                              break L2;
                                            } else {
                                              if (381 != var8) {
                                                if (8216 == var8) {
                                                  param3[var7 + param4] = (byte)-111;
                                                  break L2;
                                                } else {
                                                  if (var8 == 8217) {
                                                    param3[var7 + param4] = (byte)-110;
                                                    break L2;
                                                  } else {
                                                    if (var8 != 8220) {
                                                      if (var8 == 8221) {
                                                        param3[var7 + param4] = (byte)-108;
                                                        break L2;
                                                      } else {
                                                        if (var8 == 8226) {
                                                          param3[var7 + param4] = (byte)-107;
                                                          break L2;
                                                        } else {
                                                          if (8211 == var8) {
                                                            param3[param4 - -var7] = (byte)-106;
                                                            break L2;
                                                          } else {
                                                            if (var8 != 8212) {
                                                              if (732 == var8) {
                                                                param3[var7 + param4] = (byte)-104;
                                                                break L2;
                                                              } else {
                                                                if (var8 != 8482) {
                                                                  if (var8 != 353) {
                                                                    if (var8 == 8250) {
                                                                      param3[var7 + param4] = (byte)-101;
                                                                      break L2;
                                                                    } else {
                                                                      if (var8 != 339) {
                                                                        if (var8 == 382) {
                                                                          param3[var7 + param4] = (byte)-98;
                                                                          break L2;
                                                                        } else {
                                                                          if (376 == var8) {
                                                                            param3[var7 + param4] = (byte)-97;
                                                                            break L2;
                                                                          } else {
                                                                            param3[var7 + param4] = (byte)63;
                                                                            break L2;
                                                                          }
                                                                        }
                                                                      } else {
                                                                        param3[var7 + param4] = (byte)-100;
                                                                        break L2;
                                                                      }
                                                                    }
                                                                  } else {
                                                                    param3[var7 + param4] = (byte)-102;
                                                                    break L2;
                                                                  }
                                                                } else {
                                                                  param3[var7 + param4] = (byte)-103;
                                                                  break L2;
                                                                }
                                                              }
                                                            } else {
                                                              param3[param4 + var7] = (byte)-105;
                                                              break L2;
                                                            }
                                                          }
                                                        }
                                                      }
                                                    } else {
                                                      param3[var7 + param4] = (byte)-109;
                                                      break L2;
                                                    }
                                                  }
                                                }
                                              } else {
                                                param3[var7 + param4] = (byte)-114;
                                                break L2;
                                              }
                                            }
                                          } else {
                                            param3[param4 - -var7] = (byte)-117;
                                            break L2;
                                          }
                                        }
                                      }
                                    } else {
                                      param3[var7 + param4] = (byte)-120;
                                      break L2;
                                    }
                                  }
                                } else {
                                  param3[param4 - -var7] = (byte)-122;
                                  break L2;
                                }
                              }
                            }
                          } else {
                            param3[param4 + var7] = (byte)-125;
                            break L2;
                          }
                        } else {
                          param3[var7 + param4] = (byte)-126;
                          break L2;
                        }
                      }
                    }
                    param3[param4 - -var7] = (byte)var8;
                    break L2;
                  }
                  var7++;
                  continue L1;
                }
              }
            } else {
              stackIn_3_0 = 26;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var6 = decompiledCaughtException;
            stackIn_73_0 = (RuntimeException) (var6);

            stackIn_73_1 = new StringBuilder().append("fs.E(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_74_0 = (RuntimeException) ((Object) stackIn_73_0);
              stackIn_74_1 = (StringBuilder) ((Object) stackIn_73_1);
              stackIn_74_2 = "null";
              break L6;
            } else {
              stackIn_74_0 = (RuntimeException) ((Object) stackIn_73_0);
              stackIn_74_1 = (StringBuilder) ((Object) stackIn_73_1);
              stackIn_74_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_76_1 = ((StringBuilder) (Object) stackIn_74_1).append(stackIn_74_2).append(',');

            if (param3 == null) {
              stackIn_74_0 = (RuntimeException) ((Object) stackIn_74_0);
              stackIn_77_1 = (StringBuilder) ((Object) stackIn_76_1);
              stackIn_77_2 = "null";
              break L7;
            } else {
              stackIn_74_0 = (RuntimeException) ((Object) stackIn_74_0);
              stackIn_77_1 = (StringBuilder) ((Object) stackIn_76_1);
              stackIn_77_2 = "{...}";
              break L7;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_74_0), stackIn_77_2 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_70_0;
        }
    }

    fs(File param0, String param1, long param2) throws IOException {
        int var5_int = 0;
        try {
            if (param2 == -1L) {
                param2 = 9223372036854775807L;
            }
            if ((param0.length() ^ -1L) < (param2 ^ -1L)) {
                param0.delete();
            }
            this.field_h = new RandomAccessFile(param0, param1);
            this.field_b = 0L;
            this.field_i = param2;
            var5_int = this.field_h.read();
            if (0 != (var5_int ^ -1) && !param1.equals("r")) {
                this.field_h.seek(0L);
                this.field_h.write(var5_int);
            }
            this.field_h.seek(0L);
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) ((Object) runtimeException), "fs.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final long a(boolean param0) throws IOException {
        if (param0) {
            return 36L;
        }
        return this.field_h.length();
    }

    static {
        field_f = "Friends can be added in multiplayer<nbsp>games";
        field_d = new as();
    }
}
