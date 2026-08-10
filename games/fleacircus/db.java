/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class db extends gj {
    boolean field_G;
    static int field_H;
    static dd field_I;
    static String field_F;
    static la field_J;
    private f field_L;
    private int field_K;

    final void a(int param0, byte param1, int param2) {
        this.a(-param2 + ll.field_m >> -1911694975, param2, -param0 + ca.field_Q >> -425982111, param0, 80);
        if (param1 > -126) {
            field_J = (la) null;
        }
    }

    boolean a(int param0) {
        int var2;
        int var3;
        int var4;
        int stackIn_9_0 = 0;
        L0: {
          var2 = -3 / ((param0 - 38) / 49);
          var3 = this.e((byte) -48);
          var4 = -this.field_K + var3;
          if (var4 <= 0) {
            break L0;
          } else {
            this.field_K = this.field_K + (var4 - -8 - 1) / 8;
            break L0;
          }
        }
        L1: {
          if (-1 >= (var4 ^ -1)) {
            break L1;
          } else {
            this.field_K = this.field_K + (-15 + var4) / 16;
            break L1;
          }
        }
        L2: {
          L3: {
            if (-1 != (this.field_K ^ -1)) {
              break L3;
            } else {
              if (var3 != 0) {
                break L3;
              } else {
                if (this.field_G) {
                  break L3;
                } else {
                  stackIn_9_0 = 1;
                  break L2;
                }
              }
            }
          }
          stackIn_9_0 = 0;
          break L2;
        }
        return stackIn_9_0 != 0;
    }

    db(f param0, int param1, int param2) {
        super(-param1 + ll.field_m >> 1303335553, -param2 + ca.field_Q >> -28928223, param1, param2, (ch) null);
        try {
            this.field_L = param0;
            this.field_G = false;
            this.field_K = 0;
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) ((Object) runtimeException), "db.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void b(int param0, int param1, boolean param2, int param3) {
        if (-1 == (this.field_K ^ -1)) {
          return;
        } else {
          if (-257 >= (this.field_K ^ -1)) {
            if (param3 == 0) {
              this.b(param0 + this.field_z, param1 + this.field_y, 17344);
              super.b(param0, param1, true, param3);
              return;
            } else {
              return;
            }
          } else {
            L0: {
              L1: {
                if (null == ok.field_y) {
                  break L1;
                } else {
                  if (this.field_u > ok.field_y.field_w) {
                    break L1;
                  } else {
                    if (ok.field_y.field_t >= this.field_j) {
                      break L0;
                    } else {
                      break L1;
                    }
                  }
                }
              }
              ok.field_y = new dd(this.field_u, this.field_j);
              break L0;
            }
            r.a(ok.field_y, 45);
            gb.c();
            this.b(0, 0, 17344);
            super.b(-param0 + -this.field_z, -param1 - this.field_y, param2, param3);
            ia.a(-62);
            ok.field_y.c(this.field_y + param1, this.field_z + param0, this.field_K);
            return;
          }
        }
    }

    boolean j(int param0) {
        int stackIn_6_0 = 0;
        L0: {
          this.field_K = this.e((byte) -122);
          if (param0 > 70) {
            break L0;
          } else {
            this.field_L = (f) null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (-1 != (this.field_K ^ -1)) {
              break L2;
            } else {
              if (this.field_G) {
                break L2;
              } else {
                stackIn_6_0 = 1;
                break L1;
              }
            }
          }
          stackIn_6_0 = 0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    abstract void b(int param0, int param1, int param2);

    private final int e(byte param0) {
        if (param0 >= -41) {
            return -17;
        }
        return !this.field_G ? 0 : this.field_L.l(-87) == this ? 256 : 0;
    }

    final static String a(String param0, String[] param1, boolean param2) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        int stackIn_6_0 = 0;
        String stackIn_29_0 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        StringBuilder stackIn_35_1 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        StringBuilder var6 = null;
        String var7_ref_String = null;
        int var7 = 0;
        int var8 = 0;
        String var9 = null;
        int var10 = 0;
        int var11 = 0;
        var11 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            var3_int = param0.length();
            var4 = var3_int;
            var5 = 0;
            L1: while (true) {
              var6_int = param0.indexOf("<%", var5);
              if ((var6_int ^ -1) <= -1) {
                stackIn_6_0 = 2 + var6_int;
                var5 = stackIn_6_0;
                L2: while (true) {
                  L3: {
                    if (var3_int <= var5) {
                      break L3;
                    } else {
                      if (!em.a((byte) -108, param0.charAt(var5))) {
                        break L3;
                      } else {
                        var5++;
                        continue L2;
                      }
                    }
                  }
                  var7_ref_String = param0.substring(var6_int - -2, var5);
                  if (!ii.a(12969, (CharSequence) ((Object) var7_ref_String))) {
                    continue L1;
                  } else {
                    if (var5 >= var3_int) {
                      continue L1;
                    } else {
                      if (62 != param0.charAt(var5)) {
                        continue L1;
                      } else {
                        var5++;
                        var8 = pl.a((CharSequence) ((Object) var7_ref_String), -9816);
                        var4 = var4 + (param1[var8].length() + (var6_int + -var5));
                        continue L1;
                      }
                    }
                  }
                }
              } else {
                var6 = new StringBuilder(var4);
                var7 = 0;
                var5 = 0;
                L4: while (true) {
                  var8 = param0.indexOf("<%", var5);
                  if ((var8 ^ -1) > -1) {
                    L5: {
                      if (param2) {
                        break L5;
                      } else {
                        field_J = (la) null;
                        break L5;
                      }
                    }
                    discarded$0 = var6.append(param0.substring(var7));
                    stackIn_29_0 = var6.toString();
                    break L0;
                  } else {
                    var5 = var8 - -2;
                    L6: while (true) {
                      L7: {
                        if (var5 >= var3_int) {
                          break L7;
                        } else {
                          if (!em.a((byte) -71, param0.charAt(var5))) {
                            break L7;
                          } else {
                            var5++;
                            continue L6;
                          }
                        }
                      }
                      var9 = param0.substring(var8 - -2, var5);
                      if (ii.a(12969, (CharSequence) ((Object) var9))) {
                        if (var5 >= var3_int) {
                          continue L4;
                        } else {
                          if (62 == param0.charAt(var5)) {
                            var5++;
                            var10 = pl.a((CharSequence) ((Object) var9), -9816);
                            discarded$1 = var6.append(param0.substring(var7, var8));
                            var7 = var5;
                            discarded$2 = var6.append(param1[var10]);
                            continue L4;
                          } else {
                            continue L4;
                          }
                        }
                      } else {
                        continue L4;
                      }
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var3 = decompiledCaughtException;
            stackIn_32_0 = (RuntimeException) (var3);

            stackIn_32_1 = new StringBuilder().append("db.QA(");

            if (param0 == null) {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "null";
              break L8;
            } else {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "{...}";
              break L8;
            }
          }
          L9: {


            stackIn_35_1 = ((StringBuilder) (Object) stackIn_33_1).append(stackIn_33_2).append(',');

            if (param1 == null) {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackIn_36_2 = "null";
              break L9;
            } else {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackIn_36_2 = "{...}";
              break L9;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_33_0), stackIn_36_2 + ',' + param2 + ')');
        }
        return stackIn_29_0;
    }

    final qa i(int param0) {
        if (param0 != -257) {
            String[] var3 = (String[]) null;
            db.a((String) null, (String[]) null, false);
        }
        qa var2 = super.i(param0 + 0);
        if (var2 != null) {
            return var2;
        }
        return (qa) (this);
    }

    final static int a(byte param0, Random param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int stackIn_6_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            if ((param2 ^ -1) < -1) {
              if (mc.a(param2, (byte) -124)) {
                stackIn_6_0 = (int)(((long)param1.nextInt() & 4294967295L) * (long)param2 >> 829956704);
                decompiledRegionSelector0 = 0;
                break L0;
              } else {
                L1: {
                  var3_int = -2147483648 + -(int)(4294967296L % (long)param2);
                  if (param0 == -115) {
                    break L1;
                  } else {
                    field_F = (String) null;
                    break L1;
                  }
                }
                L2: while (true) {
                  var4 = param1.nextInt();
                  if (var4 >= var3_int) {
                    continue L2;
                  } else {
                    stackIn_11_0 = gk.a(param2, true, var4);
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
            } else {
              throw new IllegalArgumentException();
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var3);

            stackIn_14_1 = new StringBuilder().append("db.RA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L3;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L3;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0;
        } else {
          return stackIn_11_0;
        }
    }

    public static void k(int param0) {
        field_F = null;
        field_J = null;
        if (param0 != 0) {
            field_I = (dd) null;
        }
        field_I = null;
    }

    static {
        field_H = 0;
        field_F = "Warning: if you quit, you will lose any game you are in the middle of!";
    }
}
