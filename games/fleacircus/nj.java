/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;
import java.net.URL;

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
        int var2 = 0;
        int var3 = 0;
        var3 = fleas.field_A ? 1 : 0;
        var2 = ((nj) this).field_e.length + -1;
        L0: while (true) {
          if (0 > var2) {
            if (param0 >= -24) {
              ((nj) this).field_e = null;
              return;
            } else {
              return;
            }
          } else {
            if (null != ((nj) this).field_e[var2]) {
              ((nj) this).field_e[var2].b(true);
              var2--;
              var2--;
              continue L0;
            } else {
              var2--;
              var2--;
              continue L0;
            }
          }
        }
    }

    final static java.net.URL a(byte param0, int param1, String param2, java.net.URL param3, String param4) {
        try {
            RuntimeException var5 = null;
            String var5_ref = null;
            int var6 = 0;
            int var7_int = 0;
            StringBuilder var7 = null;
            Exception var8 = null;
            int var9 = 0;
            java.net.URL stackIn_42_0 = null;
            java.net.URL stackIn_44_0 = null;
            RuntimeException stackIn_46_0 = null;
            StringBuilder stackIn_46_1 = null;
            RuntimeException stackIn_47_0 = null;
            StringBuilder stackIn_47_1 = null;
            RuntimeException stackIn_48_0 = null;
            StringBuilder stackIn_48_1 = null;
            String stackIn_48_2 = null;
            RuntimeException stackIn_49_0 = null;
            StringBuilder stackIn_49_1 = null;
            RuntimeException stackIn_50_0 = null;
            StringBuilder stackIn_50_1 = null;
            RuntimeException stackIn_51_0 = null;
            StringBuilder stackIn_51_1 = null;
            String stackIn_51_2 = null;
            RuntimeException stackIn_52_0 = null;
            StringBuilder stackIn_52_1 = null;
            RuntimeException stackIn_53_0 = null;
            StringBuilder stackIn_53_1 = null;
            RuntimeException stackIn_54_0 = null;
            StringBuilder stackIn_54_1 = null;
            String stackIn_54_2 = null;
            Throwable decompiledCaughtException = null;
            java.net.URL stackOut_41_0 = null;
            java.net.URL stackOut_43_0 = null;
            RuntimeException stackOut_45_0 = null;
            StringBuilder stackOut_45_1 = null;
            RuntimeException stackOut_47_0 = null;
            StringBuilder stackOut_47_1 = null;
            String stackOut_47_2 = null;
            RuntimeException stackOut_46_0 = null;
            StringBuilder stackOut_46_1 = null;
            String stackOut_46_2 = null;
            RuntimeException stackOut_48_0 = null;
            StringBuilder stackOut_48_1 = null;
            RuntimeException stackOut_50_0 = null;
            StringBuilder stackOut_50_1 = null;
            String stackOut_50_2 = null;
            RuntimeException stackOut_49_0 = null;
            StringBuilder stackOut_49_1 = null;
            String stackOut_49_2 = null;
            RuntimeException stackOut_51_0 = null;
            StringBuilder stackOut_51_1 = null;
            RuntimeException stackOut_53_0 = null;
            StringBuilder stackOut_53_1 = null;
            String stackOut_53_2 = null;
            RuntimeException stackOut_52_0 = null;
            StringBuilder stackOut_52_1 = null;
            String stackOut_52_2 = null;
            var9 = fleas.field_A ? 1 : 0;
            try {
              var5_ref = param3.getFile();
              var6 = 0;
              L0: while (true) {
                L1: {
                  if (var5_ref.regionMatches(var6, "/l=", 0, 3)) {
                    var7_int = var5_ref.indexOf('/', 1 + var6);
                    if (var7_int < 0) {
                      break L1;
                    } else {
                      if (param1 >= 0) {
                        var5_ref = var5_ref.substring(0, var6) + var5_ref.substring(var7_int);
                        continue L0;
                      } else {
                        var6 = var7_int;
                        continue L0;
                      }
                    }
                  } else {
                    break L1;
                  }
                }
                L2: {
                  if (var5_ref.regionMatches(var6, "/a=", 0, 3)) {
                    var7_int = var5_ref.indexOf('/', var6 - -1);
                    if (var7_int < 0) {
                      break L2;
                    } else {
                      var6 = var7_int;
                      continue L0;
                    }
                  } else {
                    break L2;
                  }
                }
                L3: {
                  if (!var5_ref.regionMatches(var6, "/p=", 0, 3)) {
                    break L3;
                  } else {
                    var7_int = var5_ref.indexOf('/', 1 + var6);
                    if (var7_int >= 0) {
                      if (param2 != null) {
                        var5_ref = var5_ref.substring(0, var6) + var5_ref.substring(var7_int);
                        continue L0;
                      } else {
                        var6 = var7_int;
                        continue L0;
                      }
                    } else {
                      break L3;
                    }
                  }
                }
                L4: {
                  L5: {
                    if (var5_ref.regionMatches(var6, "/s=", 0, 3)) {
                      break L5;
                    } else {
                      if (!var5_ref.regionMatches(var6, "/c=", 0, 3)) {
                        break L4;
                      } else {
                        break L5;
                      }
                    }
                  }
                  var7_int = var5_ref.indexOf('/', 1 + var6);
                  if (var7_int >= 0) {
                    if (param4 != null) {
                      var5_ref = var5_ref.substring(0, var6) + var5_ref.substring(var7_int);
                      continue L0;
                    } else {
                      var6 = var7_int;
                      continue L0;
                    }
                  } else {
                    break L4;
                  }
                }
                L6: {
                  if (param0 == 53) {
                    break L6;
                  } else {
                    field_b = null;
                    break L6;
                  }
                }
                L7: {
                  var7 = new StringBuilder(var6);
                  StringBuilder discarded$9 = var7.append(var5_ref.substring(0, var6));
                  if (0 < param1) {
                    StringBuilder discarded$10 = var7.append("/l=");
                    StringBuilder discarded$11 = var7.append(Integer.toString(param1));
                    break L7;
                  } else {
                    break L7;
                  }
                }
                L8: {
                  if (param2 == null) {
                    break L8;
                  } else {
                    if (param2.length() < -1) {
                      StringBuilder discarded$12 = var7.append("/p=");
                      StringBuilder discarded$13 = var7.append(param2);
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                }
                L9: {
                  if (param4 == null) {
                    break L9;
                  } else {
                    if (-1 >= param4.length()) {
                      break L9;
                    } else {
                      StringBuilder discarded$14 = var7.append("/s=");
                      StringBuilder discarded$15 = var7.append(param4);
                      break L9;
                    }
                  }
                }
                L10: {
                  if (var5_ref.length() <= var6) {
                    StringBuilder discarded$16 = var7.append(47);
                    break L10;
                  } else {
                    StringBuilder discarded$17 = var7.append(var5_ref.substring(var6, var5_ref.length()));
                    break L10;
                  }
                }
                try {
                  L11: {
                    stackOut_41_0 = new java.net.URL(param3, var7.toString());
                    stackIn_42_0 = stackOut_41_0;
                    break L11;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var8 = (Exception) (Object) decompiledCaughtException;
                  var8.printStackTrace();
                  stackOut_43_0 = (java.net.URL) param3;
                  stackIn_44_0 = stackOut_43_0;
                  return stackIn_44_0;
                }
                return stackIn_42_0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L12: {
                var5 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_45_0 = (RuntimeException) var5;
                stackOut_45_1 = new StringBuilder().append("nj.D(").append(param0).append(44).append(param1).append(44);
                stackIn_47_0 = stackOut_45_0;
                stackIn_47_1 = stackOut_45_1;
                stackIn_46_0 = stackOut_45_0;
                stackIn_46_1 = stackOut_45_1;
                if (param2 == null) {
                  stackOut_47_0 = (RuntimeException) (Object) stackIn_47_0;
                  stackOut_47_1 = (StringBuilder) (Object) stackIn_47_1;
                  stackOut_47_2 = "null";
                  stackIn_48_0 = stackOut_47_0;
                  stackIn_48_1 = stackOut_47_1;
                  stackIn_48_2 = stackOut_47_2;
                  break L12;
                } else {
                  stackOut_46_0 = (RuntimeException) (Object) stackIn_46_0;
                  stackOut_46_1 = (StringBuilder) (Object) stackIn_46_1;
                  stackOut_46_2 = "{...}";
                  stackIn_48_0 = stackOut_46_0;
                  stackIn_48_1 = stackOut_46_1;
                  stackIn_48_2 = stackOut_46_2;
                  break L12;
                }
              }
              L13: {
                stackOut_48_0 = (RuntimeException) (Object) stackIn_48_0;
                stackOut_48_1 = ((StringBuilder) (Object) stackIn_48_1).append(stackIn_48_2).append(44);
                stackIn_50_0 = stackOut_48_0;
                stackIn_50_1 = stackOut_48_1;
                stackIn_49_0 = stackOut_48_0;
                stackIn_49_1 = stackOut_48_1;
                if (param3 == null) {
                  stackOut_50_0 = (RuntimeException) (Object) stackIn_50_0;
                  stackOut_50_1 = (StringBuilder) (Object) stackIn_50_1;
                  stackOut_50_2 = "null";
                  stackIn_51_0 = stackOut_50_0;
                  stackIn_51_1 = stackOut_50_1;
                  stackIn_51_2 = stackOut_50_2;
                  break L13;
                } else {
                  stackOut_49_0 = (RuntimeException) (Object) stackIn_49_0;
                  stackOut_49_1 = (StringBuilder) (Object) stackIn_49_1;
                  stackOut_49_2 = "{...}";
                  stackIn_51_0 = stackOut_49_0;
                  stackIn_51_1 = stackOut_49_1;
                  stackIn_51_2 = stackOut_49_2;
                  break L13;
                }
              }
              L14: {
                stackOut_51_0 = (RuntimeException) (Object) stackIn_51_0;
                stackOut_51_1 = ((StringBuilder) (Object) stackIn_51_1).append(stackIn_51_2).append(44);
                stackIn_53_0 = stackOut_51_0;
                stackIn_53_1 = stackOut_51_1;
                stackIn_52_0 = stackOut_51_0;
                stackIn_52_1 = stackOut_51_1;
                if (param4 == null) {
                  stackOut_53_0 = (RuntimeException) (Object) stackIn_53_0;
                  stackOut_53_1 = (StringBuilder) (Object) stackIn_53_1;
                  stackOut_53_2 = "null";
                  stackIn_54_0 = stackOut_53_0;
                  stackIn_54_1 = stackOut_53_1;
                  stackIn_54_2 = stackOut_53_2;
                  break L14;
                } else {
                  stackOut_52_0 = (RuntimeException) (Object) stackIn_52_0;
                  stackOut_52_1 = (StringBuilder) (Object) stackIn_52_1;
                  stackOut_52_2 = "{...}";
                  stackIn_54_0 = stackOut_52_0;
                  stackIn_54_1 = stackOut_52_1;
                  stackIn_54_2 = stackOut_52_2;
                  break L14;
                }
              }
              throw pf.a((Throwable) (Object) stackIn_54_0, stackIn_54_2 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        RuntimeException decompiledCaughtException = null;
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
                  var6_int = param0 * gb.field_d + param3;
                  var7 = gb.field_d - param2;
                  param0 = -param4;
                  L6: while (true) {
                    if (0 <= param0) {
                      break L0;
                    } else {
                      param3 = -param2;
                      L7: while (true) {
                        if (0 <= param3) {
                          var6_int = var6_int + var7;
                          param0++;
                          continue L6;
                        } else {
                          L8: {
                            var8 = gb.field_a[var6_int];
                            if (param1 >= (65280 & var8) >> 8) {
                              break L8;
                            } else {
                              if ((var8 >> 8 & 255) >= (16711680 & var8) >> 16) {
                                L9: {
                                  var9 = -60 + (510 & var8 >> 15);
                                  if (var9 <= 255) {
                                    break L9;
                                  } else {
                                    var9 = 255;
                                    break L9;
                                  }
                                }
                                var10 = 65280 & var8;
                                var10 = (var10 >> 1) + -(var10 >> 5) & 65280;
                                var11 = (255 & var8) >> 3;
                                gb.field_a[var6_int] = ne.a(ne.a(var9 << 16, var10), var11);
                                break L8;
                              } else {
                                break L8;
                              }
                            }
                          }
                          var6_int++;
                          param3++;
                          continue L7;
                        }
                      }
                    }
                  }
                } else {
                  break L5;
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw pf.a((Throwable) (Object) var6, "nj.E(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + 1067 + 41);
        }
    }

    nj(int param0, int param1, int param2, int param3, int[] param4) {
        int var6_int = 0;
        try {
            ((nj) this).field_c = param0 + db.a((byte) -115, na.field_c, param2);
            ((nj) this).field_f = param1 - -db.a((byte) -115, na.field_c, param3);
            ((nj) this).field_e = new ji[50 - -db.a((byte) -115, na.field_c, 5)];
            for (var6_int = ((nj) this).field_e.length + -1; var6_int >= 0; var6_int--) {
                ((nj) this).field_e[var6_int] = new ji(((nj) this).field_c, ((nj) this).field_f, db.a((byte) -115, na.field_c, 1024), param4);
            }
            ((nj) this).field_g = db.a((byte) -115, na.field_c, 3) + 2;
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) (Object) runtimeException, "nj.<init>(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + (param4 != null ? "{...}" : "null") + 41);
        }
    }

    final static void a(int param0) {
        int var1 = 0;
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
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = fleas.field_A ? 1 : 0;
        var2 = 1;
        var3 = 122 % ((param0 - 3) / 55);
        var4 = -1 + ((nj) this).field_e.length;
        L0: while (true) {
          if (var4 < 0) {
            return var2 != 0;
          } else {
            if (null != ((nj) this).field_e[var4]) {
              ((nj) this).field_e[var4].a(((nj) this).field_g, (byte) -128);
              var2 = var2 != 0 & ((nj) this).field_e[var4].a(true) ? 1 : 0;
              var4--;
              var4--;
              continue L0;
            } else {
              var4--;
              var4--;
              continue L0;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new dd(540, 140);
        field_d = "Next level";
    }
}
