/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class db {
    static boolean field_d;
    static int field_b;
    String field_e;
    static String[] field_g;
    static dk field_h;
    static String field_f;
    static tg field_a;
    int field_c;

    final java.net.Socket a(byte param0) throws IOException {
        int var2 = -128 / ((param0 - 3) / 40);
        return new java.net.Socket(this.field_e, this.field_c);
    }

    final static de a(byte param0, java.applet.Applet param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        de[] var3 = null;
        int var4 = 0;
        de var5 = null;
        int var6 = 0;
        de stackIn_4_0 = null;
        de stackIn_12_0 = null;
        de stackIn_15_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var6 = SteelSentinels.field_G;
        try {
          L0: {
            var2 = ha.a(param1, "jagex-last-login-method", -15645);
            if (var2 == null) {
              stackIn_4_0 = h.field_Y;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (param0 <= -41) {
                  break L1;
                } else {
                  field_a = (tg) null;
                  break L1;
                }
              }
              var3 = sh.b(-26);
              var4 = 0;
              L2: while (true) {
                if (var3.length <= var4) {
                  stackIn_15_0 = h.field_Y;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  var5 = var3[var4];
                  if (var5.a(var2, 8)) {
                    stackIn_12_0 = (de) (var5);
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    var4++;
                    continue L2;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2_ref = decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var2_ref);

            stackIn_18_1 = new StringBuilder().append("db.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L3;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L3;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_12_0;
          } else {
            return stackIn_15_0;
          }
        }
    }

    final static String a(String param0, int param1, String[] param2) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        String stackIn_28_0 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        StringBuilder stackIn_34_1 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        StringBuilder var6 = null;
        int var7 = 0;
        String var7_ref_String = null;
        int var8 = 0;
        String var9 = null;
        int var10 = 0;
        int var11 = 0;
        java.awt.Component var12 = null;
        var11 = SteelSentinels.field_G;
        try {
          L0: {
            var3_int = param0.length();
            var4 = var3_int;
            var5 = 0;
            L1: while (true) {
              var6_int = param0.indexOf("<%", var5);
              if (-1 < (var6_int ^ -1)) {
                var6 = new StringBuilder(var4);
                var7 = 0;
                var5 = 0;
                L2: while (true) {
                  var8 = param0.indexOf("<%", var5);
                  if ((var8 ^ -1) <= -1) {
                    var5 = var8 + 2;
                    L3: while (true) {
                      L4: {
                        if (var3_int <= var5) {
                          break L4;
                        } else {
                          if (!oa.a(-4278, param0.charAt(var5))) {
                            break L4;
                          } else {
                            var5++;
                            continue L3;
                          }
                        }
                      }
                      var9 = param0.substring(2 + var8, var5);
                      if (fg.a((CharSequence) ((Object) var9), -114)) {
                        if (var5 >= var3_int) {
                          continue L2;
                        } else {
                          if (62 != param0.charAt(var5)) {
                            continue L2;
                          } else {
                            var5++;
                            var10 = dj.a((CharSequence) ((Object) var9), -115);
                            discarded$0 = var6.append(param0.substring(var7, var8));
                            discarded$1 = var6.append(param2[var10]);
                            var7 = var5;
                            continue L2;
                          }
                        }
                      } else {
                        continue L2;
                      }
                    }
                  } else {
                    L5: {
                      discarded$2 = var6.append(param0.substring(var7));
                      if (param1 <= -11) {
                        break L5;
                      } else {
                        var12 = (java.awt.Component) null;
                        db.a(-107, (java.awt.Component) null);
                        break L5;
                      }
                    }
                    stackIn_28_0 = var6.toString();
                    break L0;
                  }
                }
              } else {
                var5 = var6_int - -2;
                L6: while (true) {
                  L7: {
                    if (var5 >= var3_int) {
                      break L7;
                    } else {
                      if (!oa.a(-4278, param0.charAt(var5))) {
                        break L7;
                      } else {
                        var5++;
                        continue L6;
                      }
                    }
                  }
                  var7_ref_String = param0.substring(2 + var6_int, var5);
                  if (fg.a((CharSequence) ((Object) var7_ref_String), -110)) {
                    if (var3_int <= var5) {
                      continue L1;
                    } else {
                      if (param0.charAt(var5) == 62) {
                        var5++;
                        var8 = dj.a((CharSequence) ((Object) var7_ref_String), -109);
                        var4 = var4 + (param2[var8].length() + (var6_int + -var5));
                        continue L1;
                      } else {
                        continue L1;
                      }
                    }
                  } else {
                    continue L1;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var3 = decompiledCaughtException;
            stackIn_31_0 = (RuntimeException) (var3);

            stackIn_31_1 = new StringBuilder().append("db.E(");

            if (param0 == null) {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "null";
              break L8;
            } else {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "{...}";
              break L8;
            }
          }
          L9: {


            stackIn_34_1 = ((StringBuilder) (Object) stackIn_32_1).append(stackIn_32_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_35_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackIn_35_2 = "null";
              break L9;
            } else {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_35_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackIn_35_2 = "{...}";
              break L9;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_32_0), stackIn_35_2 + ')');
        }
        return stackIn_28_0;
    }

    public static void a(boolean param0) {
        field_f = null;
        field_a = null;
        field_g = null;
        field_h = null;
        if (!param0) {
            field_d = false;
        }
    }

    final static String b(int param0) {
        if (param0 != 0) {
            field_b = 40;
        }
        return d.field_U;
    }

    final static void c(int param0) {
        int var1_int = 0;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var2 = SteelSentinels.field_G;
        try {
          L0: {
            var1_int = 0;
            L1: while (true) {
              if (var1_int >= 10000) {
                L2: {
                  if (param0 == 10000) {
                    break L2;
                  } else {
                    field_f = (String) null;
                    break L2;
                  }
                }
                break L0;
              } else {
                k.field_Cb[var1_int].i(-15809);
                var1_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var1), "db.H(" + param0 + ')');
        }
    }

    abstract java.net.Socket a(int param0) throws IOException;

    final static void a(int param0, java.awt.Component param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              param1.setFocusTraversalKeysEnabled(false);
              param1.addKeyListener(wc.field_i);
              param1.addFocusListener(wc.field_i);
              if (param0 == -1) {
                break L1;
              } else {
                field_a = (tg) null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("db.G(").append(param0).append(',');

            if (param1 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    static {
        field_g = new String[]{"Anti-rocket weapon. Works with AMARDS.", "Can be targeted. Works with AMARDS.", "", "", "Can be targeted. Works with AMARDS.", "", "Recommended for use with targeter.", "", "", "Anti-rocket weapon.", "", "Anti-rocket weapon. Works with AMARDS.", "Can be targeted. Works with AMARDS.", "", "", "", "", "Can be targeted. Works with AMARDS.", "", "", "", "", "", "", "", "", "Can be targeted. Works with AMARDS.", "", "", "", "Can be targeted.", "", "Can only be fitted onto the Golem chassis.", "", "Recommended for use with targeter.", "Can be targeted."};
        field_f = "Training drone";
    }
}
