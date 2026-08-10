/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class sc {
    static char[] field_a;
    static int field_e;
    static String field_d;
    static int[] field_h;
    static String field_b;
    static int field_c;
    static int field_g;
    static eb field_f;

    final static void b(int param0) {
        try {
            IOException iOException = null;
            int var1_int = 0;
            int var3 = 0;
            Throwable decompiledCaughtException = null;
            RuntimeException var1 = null;
            IOException var2 = null;
            var3 = MonkeyPuzzle2.field_F ? 1 : 0;
            try {
              L0: {
                L1: {
                  if (lg.field_n == null) {
                    break L1;
                  } else {
                    lg.field_n.b((byte) 7);
                    break L1;
                  }
                }
                L2: {
                  if (null == jc.field_c) {
                    break L2;
                  } else {
                    jc.field_c.a(true);
                    break L2;
                  }
                }
                L3: {
                  if (null == ah.field_f) {
                    break L3;
                  } else {
                    try {
                      L4: {
                        ah.field_f.a(true);
                        break L4;
                      }
                    } catch (java.io.IOException decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L5: {
                        iOException = (IOException) (Object) decompiledCaughtException;
                        break L5;
                      }
                    }
                    break L3;
                  }
                }
                L6: {
                  if (param0 == 0) {
                    break L6;
                  } else {
                    sc.a(40);
                    break L6;
                  }
                }
                L7: {
                  if (null == bl.field_o) {
                    break L7;
                  } else {
                    var1_int = 0;
                    L8: while (true) {
                      if (bl.field_o.length <= var1_int) {
                        break L7;
                      } else {
                        if (bl.field_o[var1_int] != null) {
                          try {
                            L9: {
                              bl.field_o[var1_int].a(true);
                              break L9;
                            }
                          } catch (java.io.IOException decompiledCaughtParameter1) {
                            decompiledCaughtException = decompiledCaughtParameter1;
                            L10: {
                              var2 = (IOException) (Object) decompiledCaughtException;
                              break L10;
                            }
                          }
                          var1_int++;
                          continue L8;
                        } else {
                          var1_int++;
                          continue L8;
                        }
                      }
                    }
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              var1 = (RuntimeException) (Object) decompiledCaughtException;
              throw la.a((Throwable) ((Object) var1), "sc.A(" + param0 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(boolean param0) {
        int var2 = 0;
        uh var3_ref_uh = null;
        int var3 = 0;
        int var4_int = 0;
        mk var4 = null;
        Object var5 = null;
        int var6 = 0;
        hb var9 = null;
        byte[] var13 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var6 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (!param0) {
                break L1;
              } else {
                field_b = (String) null;
                break L1;
              }
            }
            L2: {
              var9 = MonkeyPuzzle2.field_D;
              var2 = var9.a((byte) 114);
              if (var2 != 0) {
                if (1 != var2) {
                  kk.a("A1: " + bh.a((byte) -21), (byte) 126, (Throwable) null);
                  gk.a(-1);
                  break L2;
                } else {
                  var3 = var9.e(126);
                  var4 = (mk) ((Object) eb.field_C.a((byte) -117));
                  L3: while (true) {
                    L4: {
                      if (var4 == null) {
                        break L4;
                      } else {
                        if (var3 == var4.field_e) {
                          break L4;
                        } else {
                          var4 = (mk) ((Object) eb.field_C.d((byte) 63));
                          continue L3;
                        }
                      }
                    }
                    if (var4 != null) {
                      var4.c(-19822);
                      break L2;
                    } else {
                      gk.a(-1);
                      decompiledRegionSelector0 = 3;
                      break L0;
                    }
                  }
                }
              } else {
                var3_ref_uh = (uh) ((Object) t.field_v.a((byte) -117));
                if (var3_ref_uh != null) {
                  L5: {
                    var4_int = var9.a((byte) 114);
                    if (var4_int != 0) {
                      var13 = new byte[var4_int];
                      var9.a(var13, var4_int, -122, 0);
                      break L5;
                    } else {
                      var5 = null;
                      break L5;
                    }
                  }
                  var9.field_h = var9.field_h + 4;
                  if (!var9.l(-24685)) {
                    gk.a(-1);
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    var3_ref_uh.c(-19822);
                    break L2;
                  }
                } else {
                  gk.a(-1);
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
            decompiledRegionSelector0 = 2;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw la.a((Throwable) ((Object) var1), "sc.B(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              return;
            }
          }
        }
    }

    final static int[] a(int param0, int param1, int param2) {
        int var3 = sb.a((byte) 79, param2);
        int var5 = 37 % ((-85 - param0) / 36);
        int var4 = r.a((byte) 71, param2);
        int var6 = sb.a((byte) 79, param1);
        int var7 = r.a((byte) 71, param1);
        int var8 = (int)((long)var3 * (long)var6 >> -237110320);
        int var9 = (int)((long)var7 * (long)var3 >> -1575055664);
        int var10 = (int)((long)var6 * (long)var4 >> -768349552);
        int var11 = (int)((long)var7 * (long)var4 >> -1192020016);
        return new int[]{0, 0, 0, var7, 0, var6, var8, var4, -var9, -var10, var3, var11};
    }

    public static void a(int param0) {
        field_b = null;
        field_f = null;
        field_h = null;
        field_a = null;
        field_d = null;
        if (param0 != -21718) {
            byte[] var2 = (byte[]) null;
            sc.a((byte[]) null, -77, 2, 45);
        }
    }

    final static String a(byte[] param0, int param1, int param2, int param3) {
        int incrementValue$1 = 0;
        char[] var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        char[] var11 = null;
        char[] var12 = null;
        String stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        var10 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            var5 = -95 % ((param2 - 0) / 52);
            var12 = new char[param1];
            var11 = var12;
            var4 = var11;
            var6 = 0;
            var7 = 0;
            L1: while (true) {
              if (var7 >= param1) {
                stackIn_14_0 = new String(var12, 0, var6);
                break L0;
              } else {
                L2: {
                  var8 = param0[param3 - -var7] & 255;
                  if (-1 != (var8 ^ -1)) {
                    L3: {
                      if ((var8 ^ -1) > -129) {
                        break L3;
                      } else {
                        if (var8 >= 160) {
                          break L3;
                        } else {
                          L4: {
                            var9 = sb.field_n[-128 + var8];
                            if (var9 == 0) {
                              var9 = 63;
                              break L4;
                            } else {
                              break L4;
                            }
                          }
                          var8 = var9;
                          break L3;
                        }
                      }
                    }
                    incrementValue$1 = var6;
                    var6++;
                    var4[incrementValue$1] = (char)var8;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                var7++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4_ref = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var4_ref);

            stackIn_17_1 = new StringBuilder().append("sc.D(");

            if (param0 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L5;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L5;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_14_0;
    }

    static {
        field_d = "Level Complete: <%0> pts";
        field_a = new char[]{(char)95, (char)97, (char)98, (char)99, (char)100, (char)101, (char)102, (char)103, (char)104, (char)105, (char)106, (char)107, (char)108, (char)109, (char)110, (char)111, (char)112, (char)113, (char)114, (char)115, (char)116, (char)117, (char)118, (char)119, (char)120, (char)121, (char)122, (char)48, (char)49, (char)50, (char)51, (char)52, (char)53, (char)54, (char)55, (char)56, (char)57};
        field_b = "This game has been updated! Please reload this page.";
        field_e = 0;
        field_h = new int[300];
        field_c = 0;
    }
}
