/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class nj {
    private int field_f;
    private ji[] field_e;
    static dd field_b;
    private int field_c;
    static String field_d;
    private int field_g;
    static od field_a;

    public static void a(byte param0) {
        field_d = null;
        field_b = null;
        int var1 = 29 / ((-60 - param0) / 36);
        field_a = null;
    }

    final void c(int param0) {
        int var2;
        int var3;
        var3 = fleas.field_A ? 1 : 0;
        var2 = this.field_e.length + -1;
        L0: while (true) {
          if (0 > var2) {
            if (param0 >= -24) {
              this.field_e = (ji[]) null;
              return;
            } else {
              return;
            }
          } else {
            if (null != this.field_e[var2]) {
              this.field_e[var2].b(true);
              var2--;
              continue L0;
            } else {
              var2--;
              continue L0;
            }
          }
        }
    }

    final static java.net.URL a(byte param0, int param1, String param2, java.net.URL param3, String param4) {
        try {
            StringBuilder discarded$0 = null;
            StringBuilder discarded$1 = null;
            StringBuilder discarded$2 = null;
            StringBuilder discarded$3 = null;
            StringBuilder discarded$4 = null;
            StringBuilder discarded$5 = null;
            StringBuilder discarded$6 = null;
            StringBuilder discarded$7 = null;
            StringBuilder discarded$8 = null;
            java.net.URL stackIn_42_0 = null;
            java.net.URL stackIn_44_0 = null;
            RuntimeException stackIn_47_0 = null;
            StringBuilder stackIn_47_1 = null;
            RuntimeException stackIn_48_0 = null;
            StringBuilder stackIn_48_1 = null;
            String stackIn_48_2 = null;
            StringBuilder stackIn_50_1 = null;
            StringBuilder stackIn_51_1 = null;
            String stackIn_51_2 = null;
            StringBuilder stackIn_53_1 = null;
            StringBuilder stackIn_54_1 = null;
            String stackIn_54_2 = null;
            Throwable decompiledCaughtException = null;
            String var5 = null;
            RuntimeException var5_ref = null;
            int var6 = 0;
            int var7_int = 0;
            StringBuilder var7 = null;
            Exception var8 = null;
            int var9 = 0;
            var9 = fleas.field_A ? 1 : 0;
            try {
              L0: {
                var5 = param3.getFile();
                var6 = 0;
                L1: while (true) {
                  L2: {
                    if (var5.regionMatches(var6, "/l=", 0, 3)) {
                      var7_int = var5.indexOf('/', 1 + var6);
                      if ((var7_int ^ -1) > -1) {
                        break L2;
                      } else {
                        if ((param1 ^ -1) <= -1) {
                          var5 = var5.substring(0, var6) + var5.substring(var7_int);
                          continue L1;
                        } else {
                          var6 = var7_int;
                          continue L1;
                        }
                      }
                    } else {
                      break L2;
                    }
                  }
                  L3: {
                    if (var5.regionMatches(var6, "/a=", 0, 3)) {
                      var7_int = var5.indexOf('/', var6 - -1);
                      if ((var7_int ^ -1) > -1) {
                        break L3;
                      } else {
                        var6 = var7_int;
                        continue L1;
                      }
                    } else {
                      break L3;
                    }
                  }
                  L4: {
                    if (!var5.regionMatches(var6, "/p=", 0, 3)) {
                      break L4;
                    } else {
                      var7_int = var5.indexOf('/', 1 + var6);
                      if ((var7_int ^ -1) <= -1) {
                        if (param2 != null) {
                          var5 = var5.substring(0, var6) + var5.substring(var7_int);
                          continue L1;
                        } else {
                          var6 = var7_int;
                          continue L1;
                        }
                      } else {
                        break L4;
                      }
                    }
                  }
                  L5: {
                    L6: {
                      if (var5.regionMatches(var6, "/s=", 0, 3)) {
                        break L6;
                      } else {
                        if (!var5.regionMatches(var6, "/c=", 0, 3)) {
                          break L5;
                        } else {
                          break L6;
                        }
                      }
                    }
                    var7_int = var5.indexOf('/', 1 + var6);
                    if ((var7_int ^ -1) <= -1) {
                      if (param4 != null) {
                        var5 = var5.substring(0, var6) + var5.substring(var7_int);
                        continue L1;
                      } else {
                        var6 = var7_int;
                        continue L1;
                      }
                    } else {
                      break L5;
                    }
                  }
                  L7: {
                    if (param0 == 53) {
                      break L7;
                    } else {
                      field_b = (dd) null;
                      break L7;
                    }
                  }
                  L8: {
                    var7 = new StringBuilder(var6);
                    discarded$0 = var7.append(var5.substring(0, var6));
                    if (0 < param1) {
                      discarded$1 = var7.append("/l=");
                      discarded$2 = var7.append(Integer.toString(param1));
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                  L9: {
                    if (param2 == null) {
                      break L9;
                    } else {
                      if ((param2.length() ^ -1) < -1) {
                        discarded$3 = var7.append("/p=");
                        discarded$4 = var7.append(param2);
                        break L9;
                      } else {
                        break L9;
                      }
                    }
                  }
                  L10: {
                    if (param4 == null) {
                      break L10;
                    } else {
                      if (-1 <= (param4.length() ^ -1)) {
                        break L10;
                      } else {
                        discarded$5 = var7.append("/s=");
                        discarded$6 = var7.append(param4);
                        break L10;
                      }
                    }
                  }
                  L11: {
                    if (var5.length() <= var6) {
                      discarded$7 = var7.append('/');
                      break L11;
                    } else {
                      discarded$8 = var7.append(var5.substring(var6, var5.length()));
                      break L11;
                    }
                  }
                  try {
                    L12: {
                      stackIn_42_0 = new java.net.URL(param3, var7.toString());
                      break L12;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    var8 = (Exception) (Object) decompiledCaughtException;
                    var8.printStackTrace();
                    stackIn_44_0 = (java.net.URL) (param3);
                    return stackIn_44_0;
                  }
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L13: {
                var5_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_47_0 = (RuntimeException) (var5_ref);

                stackIn_47_1 = new StringBuilder().append("nj.D(").append(param0).append(',').append(param1).append(',');

                if (param2 == null) {
                  stackIn_48_0 = (RuntimeException) ((Object) stackIn_47_0);
                  stackIn_48_1 = (StringBuilder) ((Object) stackIn_47_1);
                  stackIn_48_2 = "null";
                  break L13;
                } else {
                  stackIn_48_0 = (RuntimeException) ((Object) stackIn_47_0);
                  stackIn_48_1 = (StringBuilder) ((Object) stackIn_47_1);
                  stackIn_48_2 = "{...}";
                  break L13;
                }
              }
              L14: {


                stackIn_50_1 = ((StringBuilder) (Object) stackIn_48_1).append(stackIn_48_2).append(',');

                if (param3 == null) {
                  stackIn_48_0 = (RuntimeException) ((Object) stackIn_48_0);
                  stackIn_51_1 = (StringBuilder) ((Object) stackIn_50_1);
                  stackIn_51_2 = "null";
                  break L14;
                } else {
                  stackIn_48_0 = (RuntimeException) ((Object) stackIn_48_0);
                  stackIn_51_1 = (StringBuilder) ((Object) stackIn_50_1);
                  stackIn_51_2 = "{...}";
                  break L14;
                }
              }
              L15: {


                stackIn_53_1 = ((StringBuilder) (Object) stackIn_51_1).append(stackIn_51_2).append(',');

                if (param4 == null) {
                  stackIn_48_0 = (RuntimeException) ((Object) stackIn_48_0);
                  stackIn_54_1 = (StringBuilder) ((Object) stackIn_53_1);
                  stackIn_54_2 = "null";
                  break L15;
                } else {
                  stackIn_48_0 = (RuntimeException) ((Object) stackIn_48_0);
                  stackIn_54_1 = (StringBuilder) ((Object) stackIn_53_1);
                  stackIn_54_2 = "{...}";
                  break L15;
                }
              }
              throw pf.a((Throwable) ((Object) stackIn_48_0), stackIn_54_2 + ')');
            }
            return stackIn_42_0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        var12 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              if (gb.field_l > param3) {
                param2 = param2 - (gb.field_l - param3);
                param3 = gb.field_l;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param2 + param3 <= gb.field_h) {
                break L2;
              } else {
                param2 = gb.field_h + -param3;
                break L2;
              }
            }
            L3: {
              if (param0 >= gb.field_b) {
                break L3;
              } else {
                param4 = param4 - (-param0 + gb.field_b);
                param0 = gb.field_b;
                break L3;
              }
            }
            L4: {
              if (gb.field_i >= param4 + param0) {
                break L4;
              } else {
                param4 = -param0 + gb.field_i;
                break L4;
              }
            }
            L5: {
              if (0 >= param2) {
                break L5;
              } else {
                if (0 < param4) {
                  L6: {
                    var6_int = param0 * gb.field_d + param3;
                    var7 = gb.field_d - param2;
                    if (param5 == 1067) {
                      break L6;
                    } else {
                      nj.a((byte) 101);
                      break L6;
                    }
                  }
                  param0 = -param4;
                  L7: while (true) {
                    if (0 <= param0) {
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      param3 = -param2;
                      L8: while (true) {
                        if (0 <= param3) {
                          var6_int = var6_int + var7;
                          param0++;
                          continue L7;
                        } else {
                          L9: {
                            var8 = gb.field_a[var6_int];
                            if ((param1 ^ -1) <= ((65280 & var8) >> 1876065320 ^ -1)) {
                              break L9;
                            } else {
                              if ((var8 >> 875236872 & 255) >= (16711680 & var8) >> -275225488) {
                                L10: {
                                  var9 = -60 + (510 & var8 >> 236763183);
                                  if (-256 <= (var9 ^ -1)) {
                                    break L10;
                                  } else {
                                    var9 = 255;
                                    break L10;
                                  }
                                }
                                var10 = 65280 & var8;
                                var10 = (var10 >> 1802518369) + -(var10 >> 937195909) & 65280;
                                var11 = (255 & var8) >> 1748457475;
                                gb.field_a[var6_int] = ne.a(ne.a(var9 << 1760663824, var10), var11);
                                break L9;
                              } else {
                                break L9;
                              }
                            }
                          }
                          var6_int++;
                          param3++;
                          continue L8;
                        }
                      }
                    }
                  }
                } else {
                  break L5;
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw pf.a((Throwable) ((Object) var6), "nj.E(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    nj(int param0, int param1, int param2, int param3, int[] param4) {
        int var6_int = 0;
        try {
            this.field_c = param0 + db.a((byte) -115, na.field_c, param2);
            this.field_f = param1 - -db.a((byte) -115, na.field_c, param3);
            this.field_e = new ji[50 - -db.a((byte) -115, na.field_c, 5)];
            for (var6_int = this.field_e.length + -1; var6_int >= 0; var6_int--) {
                this.field_e[var6_int] = new ji(this.field_c, this.field_f, db.a((byte) -115, na.field_c, 1024), param4);
            }
            this.field_g = db.a((byte) -115, na.field_c, 3) + 2;
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) ((Object) runtimeException), "nj.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0) {
        int var1;
        if (param0 != -9340) {
          L0: {
            nj.a(-16);
            if (gf.field_d > 32) {
              L1: {
                var1 = gf.field_d % 32;
                if (0 == var1) {
                  var1 = 32;
                  break L1;
                } else {
                  break L1;
                }
              }
              ia.a(true, gf.field_d - var1);
              break L0;
            } else {
              ia.a(true, 0);
              break L0;
            }
          }
          return;
        } else {
          L2: {
            if (gf.field_d > 32) {
              L3: {
                var1 = gf.field_d % 32;
                if (0 == var1) {
                  var1 = 32;
                  break L3;
                } else {
                  break L3;
                }
              }
              ia.a(true, gf.field_d - var1);
              break L2;
            } else {
              ia.a(true, 0);
              break L2;
            }
          }
          return;
        }
    }

    final boolean b(int param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        var5 = fleas.field_A ? 1 : 0;
        var2 = 1;
        var3 = 122 % ((param0 - 3) / 55);
        var4 = -1 + this.field_e.length;
        L0: while (true) {
          if ((var4 ^ -1) > -1) {
            return var2 != 0;
          } else {
            if (null != this.field_e[var4]) {
              this.field_e[var4].a(this.field_g, (byte) -128);
              var2 = var2 != 0 & this.field_e[var4].a(true) ? 1 : 0;
              var4--;
              continue L0;
            } else {
              var4--;
              continue L0;
            }
          }
        }
    }

    static {
        field_b = new dd(540, 140);
        field_d = "Next level";
    }
}
