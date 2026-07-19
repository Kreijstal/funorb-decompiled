/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

class ms {
    static String field_c;
    static cc field_e;
    ms field_b;
    static ri field_d;
    ms field_g;
    static String field_i;
    static String[] field_j;
    static boolean field_a;
    static String[] field_f;
    long field_h;

    public static void b(byte param0) {
        field_i = null;
        field_c = null;
        field_d = null;
        field_j = null;
        field_f = null;
        field_e = null;
        if (param0 < 71) {
            field_j = (String[]) null;
        }
    }

    final void b(boolean param0) {
        if (null != this.field_g) {
          this.field_g.field_b = this.field_b;
          this.field_b.field_g = this.field_g;
          if (param0) {
            this.b(false);
            this.field_g = null;
            this.field_b = null;
            return;
          } else {
            this.field_g = null;
            this.field_b = null;
            return;
          }
        } else {
          return;
        }
    }

    final static void a(String param0, Throwable param1, int param2) {
        try {
            int discarded$1 = 0;
            Exception var3 = null;
            String var3_ref = null;
            jr var4 = null;
            DataInputStream var5 = null;
            int var6 = 0;
            String var7 = null;
            String var8 = null;
            String var9 = null;
            String var10 = null;
            wi stackIn_13_0 = null;
            int stackIn_13_1 = 0;
            java.net.URL stackIn_13_2 = null;
            java.net.URL stackIn_13_3 = null;
            java.net.URL stackIn_13_4 = null;
            StringBuilder stackIn_13_5 = null;
            wi stackIn_14_0 = null;
            int stackIn_14_1 = 0;
            java.net.URL stackIn_14_2 = null;
            java.net.URL stackIn_14_3 = null;
            java.net.URL stackIn_14_4 = null;
            StringBuilder stackIn_14_5 = null;
            wi stackIn_15_0 = null;
            int stackIn_15_1 = 0;
            java.net.URL stackIn_15_2 = null;
            java.net.URL stackIn_15_3 = null;
            java.net.URL stackIn_15_4 = null;
            StringBuilder stackIn_15_5 = null;
            String stackIn_15_6 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            wi stackOut_12_0 = null;
            int stackOut_12_1 = 0;
            java.net.URL stackOut_12_2 = null;
            java.net.URL stackOut_12_3 = null;
            java.net.URL stackOut_12_4 = null;
            StringBuilder stackOut_12_5 = null;
            wi stackOut_14_0 = null;
            int stackOut_14_1 = 0;
            java.net.URL stackOut_14_2 = null;
            java.net.URL stackOut_14_3 = null;
            java.net.URL stackOut_14_4 = null;
            StringBuilder stackOut_14_5 = null;
            String stackOut_14_6 = null;
            wi stackOut_13_0 = null;
            int stackOut_13_1 = 0;
            java.net.URL stackOut_13_2 = null;
            java.net.URL stackOut_13_3 = null;
            java.net.URL stackOut_13_4 = null;
            StringBuilder stackOut_13_5 = null;
            String stackOut_13_6 = null;
            var6 = Sumoblitz.field_L ? 1 : 0;
            try {
              L0: {
                L1: {
                  var3_ref = "";
                  if (param1 == null) {
                    break L1;
                  } else {
                    var3_ref = ws.a((byte) 71, param1);
                    break L1;
                  }
                }
                L2: {
                  if (param0 != null) {
                    L3: {
                      if (param1 == null) {
                        break L3;
                      } else {
                        var3_ref = var3_ref + " | ";
                        break L3;
                      }
                    }
                    var3_ref = var3_ref + param0;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                il.a((byte) 96, var3_ref);
                var7 = aw.a(":", var3_ref, "%3a", true);
                var8 = aw.a("@", var7, "%40", true);
                var9 = aw.a("&", var8, "%26", true);
                var10 = aw.a("#", var9, "%23", true);
                if (ct.field_z != null) {
                  L4: {
                    if (param2 == 0) {
                      break L4;
                    } else {
                      field_e = (cc) null;
                      break L4;
                    }
                  }
                  L5: {
                    stackOut_12_0 = gk.field_O;
                    stackOut_12_1 = 116;
                    stackOut_12_2 = null;
                    stackOut_12_3 = null;
                    stackOut_12_4 = ct.field_z.getCodeBase();
                    stackOut_12_5 = new StringBuilder().append("clienterror.ws?c=").append(mu.field_s).append("&u=");
                    stackIn_14_0 = stackOut_12_0;
                    stackIn_14_1 = stackOut_12_1;
                    stackIn_14_2 = stackOut_12_2;
                    stackIn_14_3 = stackOut_12_3;
                    stackIn_14_4 = stackOut_12_4;
                    stackIn_14_5 = stackOut_12_5;
                    stackIn_13_0 = stackOut_12_0;
                    stackIn_13_1 = stackOut_12_1;
                    stackIn_13_2 = stackOut_12_2;
                    stackIn_13_3 = stackOut_12_3;
                    stackIn_13_4 = stackOut_12_4;
                    stackIn_13_5 = stackOut_12_5;
                    if (dv.field_c != null) {
                      stackOut_14_0 = (wi) ((Object) stackIn_14_0);
                      stackOut_14_1 = stackIn_14_1;
                      stackOut_14_2 = null;
                      stackOut_14_3 = null;
                      stackOut_14_4 = (java.net.URL) ((Object) stackIn_14_4);
                      stackOut_14_5 = (StringBuilder) ((Object) stackIn_14_5);
                      stackOut_14_6 = dv.field_c;
                      stackIn_15_0 = stackOut_14_0;
                      stackIn_15_1 = stackOut_14_1;
                      stackIn_15_2 = stackOut_14_2;
                      stackIn_15_3 = stackOut_14_3;
                      stackIn_15_4 = stackOut_14_4;
                      stackIn_15_5 = stackOut_14_5;
                      stackIn_15_6 = stackOut_14_6;
                      break L5;
                    } else {
                      stackOut_13_0 = (wi) ((Object) stackIn_13_0);
                      stackOut_13_1 = stackIn_13_1;
                      stackOut_13_2 = null;
                      stackOut_13_3 = null;
                      stackOut_13_4 = (java.net.URL) ((Object) stackIn_13_4);
                      stackOut_13_5 = (StringBuilder) ((Object) stackIn_13_5);
                      stackOut_13_6 = "" + km.field_k;
                      stackIn_15_0 = stackOut_13_0;
                      stackIn_15_1 = stackOut_13_1;
                      stackIn_15_2 = stackOut_13_2;
                      stackIn_15_3 = stackOut_13_3;
                      stackIn_15_4 = stackOut_13_4;
                      stackIn_15_5 = stackOut_13_5;
                      stackIn_15_6 = stackOut_13_6;
                      break L5;
                    }
                  }
                  var4 = ((wi) (Object) stackIn_15_0).a((byte) stackIn_15_1, new java.net.URL(stackIn_15_4, stackIn_15_6 + "&v1=" + wi.field_u + "&v2=" + wi.field_q + "&e=" + var10));
                  L6: while (true) {
                    L7: {
                      L8: {
                        if (var4.field_c != 0) {
                          break L8;
                        } else {
                          tg.a(1L, (byte) 73);
                          if (var6 != 0) {
                            break L7;
                          } else {
                            if (var6 == 0) {
                              continue L6;
                            } else {
                              break L8;
                            }
                          }
                        }
                      }
                      if (var4.field_c != 1) {
                        break L7;
                      } else {
                        var5 = (DataInputStream) (var4.field_d);
                        discarded$1 = var5.read();
                        var5.close();
                        break L7;
                      }
                    }
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                } else {
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L9: {
                var3 = (Exception) (Object) decompiledCaughtException;
                decompiledRegionSelector0 = 1;
                break L9;
              }
            }
            if (decompiledRegionSelector0 == 0) {
              return;
            } else {
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final boolean a(boolean param0) {
        if (!param0) {
          if (null == this.field_g) {
            return false;
          } else {
            return true;
          }
        } else {
          field_i = (String) null;
          if (null == this.field_g) {
            return false;
          } else {
            return true;
          }
        }
    }

    final static nj[] b(int param0) {
        Throwable var2 = null;
        L0: {
          if (null == uo.field_e) {
            uo.field_e = hg.a(110, new int[]{1, 0});
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 != -16754) {
          var2 = (Throwable) null;
          ms.a((String) null, (Throwable) null, 74);
          return uo.field_e;
        } else {
          return uo.field_e;
        }
    }

    static {
        field_j = new String[]{"Move back to the previous menu level.", "Return to the top level of the menu.", "Auto-respond to the last thing in your chat window.", "Open the Quick Chat menu.", "Repeat the last thing you said.", "Close the Quick Chat menu."};
        field_a = true;
        field_c = "Fullscreen play is an option available to subscribing members only. For more details see the website.";
        field_i = "Create a free Account";
        field_f = new String[]{"Zounds!", "Well, I never!", "My word!", "*monocle*", "I do declare!", "Great Scott!"};
    }
}
