/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ec extends gk {
    private long field_n;
    private long field_g;
    static int field_f;
    static nc field_j;
    static long field_m;
    private int field_k;
    private long[] field_i;
    private int field_l;
    private long field_h;

    public static void d(int param0) {
        field_j = null;
        if (param0 != 10) {
            field_f = 74;
        }
    }

    final void b(int param0) {
        if (param0 >= -65) {
            this.field_n = 22L;
        }
        if ((this.field_n ^ -1L) > (this.field_g ^ -1L)) {
            this.field_n = this.field_n + (-this.field_n + this.field_g);
        }
        this.field_h = 0L;
    }

    private final long a(boolean param0) {
        int var8 = 0;
        int var9 = Main.field_T;
        long var2 = System.nanoTime();
        long var4 = var2 - this.field_h;
        this.field_h = var2;
        if (!param0) {
        }
        if (-5000000000L < var4 && (var4 ^ -1L) > -5000000001L) {
            this.field_i[this.field_k] = var4;
            if (!(-2 >= (this.field_l ^ -1))) {
                this.field_l = this.field_l + 1;
            }
            this.field_k = (this.field_k - -1) % 10;
        }
        long var6 = 0L;
        for (var8 = 1; var8 <= this.field_l; var8++) {
            var6 = var6 + this.field_i[(10 + (this.field_k - var8)) % 10];
        }
        return var6 / (long)this.field_l;
    }

    final int a(long param0, boolean param1) {
        int var4;
        int var5;
        var5 = Main.field_T;
        if (!param1) {
          if (this.field_n < this.field_g) {
            this.field_h = this.field_h + (this.field_g - this.field_n);
            this.field_n = this.field_n + (this.field_g - this.field_n);
            this.field_g = this.field_g + param0;
            return 1;
          } else {
            var4 = 0;
            L0: while (true) {
              L1: {
                this.field_g = this.field_g + param0;
                var4++;
                if ((var4 ^ -1) <= -11) {
                  break L1;
                } else {
                  if ((this.field_g ^ -1L) > (this.field_n ^ -1L)) {
                    continue L0;
                  } else {
                    break L1;
                  }
                }
              }
              L2: {
                if ((this.field_n ^ -1L) >= (this.field_g ^ -1L)) {
                  break L2;
                } else {
                  this.field_g = this.field_n;
                  break L2;
                }
              }
              return var4;
            }
          }
        } else {
          return 92;
        }
    }

    final static ic a(String param0, qk param1, boolean param2, String param3, qk param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        ic stackIn_2_0 = null;
        ic stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!param2) {
              var5_int = param4.a(18659, param0);
              var6 = param4.a(var5_int, param3, (byte) 7);
              stackIn_4_0 = kf.a(param4, 0, var6, var5_int, param1);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (ic) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var5);

            stackIn_7_1 = new StringBuilder().append("ec.B(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_16_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',');

            if (param4 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L4;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L4;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_8_0), stackIn_17_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final static byte a(byte param0, char param1) {
        int var2;
        int var3;
        var3 = Main.field_T;
        if (param0 <= -9) {
          L0: {
            L1: {
              L2: {
                if (0 >= param1) {
                  break L2;
                } else {
                  if (param1 < 128) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                if (param1 < 160) {
                  break L3;
                } else {
                  if (param1 <= 255) {
                    break L1;
                  } else {
                    break L3;
                  }
                }
              }
              if (param1 != 8364) {
                if (param1 != 8218) {
                  if (402 != param1) {
                    if (param1 == 8222) {
                      var2 = -124;
                      break L0;
                    } else {
                      if (param1 != 8230) {
                        if (param1 != 8224) {
                          if (param1 != 8225) {
                            if (710 == param1) {
                              var2 = -120;
                              break L0;
                            } else {
                              if (param1 != 8240) {
                                if (param1 != 352) {
                                  if (param1 == 8249) {
                                    var2 = -117;
                                    break L0;
                                  } else {
                                    if (param1 != 338) {
                                      if (param1 == 381) {
                                        var2 = -114;
                                        break L0;
                                      } else {
                                        if (param1 != 8216) {
                                          if (param1 != 8217) {
                                            if (param1 == 8220) {
                                              var2 = -109;
                                              break L0;
                                            } else {
                                              if (8221 != param1) {
                                                if (param1 == 8226) {
                                                  var2 = -107;
                                                  break L0;
                                                } else {
                                                  if (param1 != 8211) {
                                                    if (param1 == 8212) {
                                                      var2 = -105;
                                                      break L0;
                                                    } else {
                                                      if (param1 == 732) {
                                                        var2 = -104;
                                                        break L0;
                                                      } else {
                                                        if (param1 != 8482) {
                                                          if (param1 != 353) {
                                                            if (param1 != 8250) {
                                                              if (param1 != 339) {
                                                                if (param1 == 382) {
                                                                  var2 = -98;
                                                                  break L0;
                                                                } else {
                                                                  if (param1 != 376) {
                                                                    var2 = 63;
                                                                    break L0;
                                                                  } else {
                                                                    var2 = -97;
                                                                    break L0;
                                                                  }
                                                                }
                                                              } else {
                                                                var2 = -100;
                                                                break L0;
                                                              }
                                                            } else {
                                                              var2 = -101;
                                                              break L0;
                                                            }
                                                          } else {
                                                            var2 = -102;
                                                            break L0;
                                                          }
                                                        } else {
                                                          var2 = -103;
                                                          break L0;
                                                        }
                                                      }
                                                    }
                                                  } else {
                                                    var2 = -106;
                                                    break L0;
                                                  }
                                                }
                                              } else {
                                                var2 = -108;
                                                break L0;
                                              }
                                            }
                                          } else {
                                            var2 = -110;
                                            break L0;
                                          }
                                        } else {
                                          var2 = -111;
                                          break L0;
                                        }
                                      }
                                    } else {
                                      var2 = -116;
                                      break L0;
                                    }
                                  }
                                } else {
                                  var2 = -118;
                                  break L0;
                                }
                              } else {
                                var2 = -119;
                                break L0;
                              }
                            }
                          } else {
                            var2 = -121;
                            break L0;
                          }
                        } else {
                          var2 = -122;
                          break L0;
                        }
                      } else {
                        var2 = -123;
                        break L0;
                      }
                    }
                  } else {
                    var2 = -125;
                    break L0;
                  }
                } else {
                  var2 = -126;
                  break L0;
                }
              } else {
                var2 = -128;
                break L0;
              }
            }
            var2 = (byte)param1;
            break L0;
          }
          return (byte) var2;
        } else {
          return (byte) 87;
        }
    }

    final long a(int param0) {
        if (param0 != 0) {
            this.b(108);
        }
        this.field_n = this.field_n + this.a(true);
        if (this.field_g > this.field_n) {
            return (this.field_g - this.field_n) / 1000000L;
        }
        return 0L;
    }

    ec() {
        this.field_n = 0L;
        this.field_g = 0L;
        this.field_l = 1;
        this.field_k = 0;
        this.field_h = 0L;
        this.field_i = new long[10];
        this.field_n = System.nanoTime();
        this.field_g = System.nanoTime();
    }

    static {
        field_j = new nc();
    }
}
