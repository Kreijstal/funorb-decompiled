/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mg extends al {
    static int[] field_j;
    private String field_m;
    static String field_l;
    private boolean field_o;
    static String field_k;
    static int field_n;

    final static int f(int param0) {
        int var1 = 18 % ((3 - param0) / 57);
        return (int)(1000000000L / hb.field_H);
    }

    final vf b(String param0, byte param1) {
        rg var6 = null;
        rg var7 = null;
        CharSequence var8 = null;
        CharSequence var9 = null;
        vf stackIn_12_0 = null;
        vf stackIn_18_0 = null;
        vf stackIn_32_0 = null;
        vf stackOut_31_0 = null;
        vf stackOut_30_0 = null;
        vf stackOut_11_0 = null;
        vf stackOut_10_0 = null;
        vf stackOut_17_0 = null;
        vf stackOut_16_0 = null;
        if (param1 == 54) {
          var9 = (CharSequence) (Object) param0;
          if (!fh.a((byte) 73, var9)) {
            return a.field_e;
          } else {
            L0: {
              if (!param0.equals((Object) (Object) ((mg) this).field_m)) {
                L1: {
                  var7 = pd.a(1059, param0);
                  if (var7 == null) {
                    break L1;
                  } else {
                    if (var7.field_c != null) {
                      break L1;
                    } else {
                      ((mg) this).field_o = var7.field_f;
                      ((mg) this).field_m = param0;
                      break L0;
                    }
                  }
                }
                return mi.field_c;
              } else {
                break L0;
              }
            }
            L2: {
              if (((mg) this).field_o) {
                stackOut_31_0 = mc.field_a;
                stackIn_32_0 = stackOut_31_0;
                break L2;
              } else {
                stackOut_30_0 = a.field_e;
                stackIn_32_0 = stackOut_30_0;
                break L2;
              }
            }
            return stackIn_32_0;
          }
        } else {
          ((mg) this).field_o = true;
          var8 = (CharSequence) (Object) param0;
          if (!fh.a((byte) 73, var8)) {
            return a.field_e;
          } else {
            if (!param0.equals((Object) (Object) ((mg) this).field_m)) {
              var6 = pd.a(1059, param0);
              if (var6 != null) {
                if (var6.field_c != null) {
                  return mi.field_c;
                } else {
                  L3: {
                    ((mg) this).field_o = var6.field_f;
                    ((mg) this).field_m = param0;
                    if (((mg) this).field_o) {
                      stackOut_11_0 = mc.field_a;
                      stackIn_12_0 = stackOut_11_0;
                      break L3;
                    } else {
                      stackOut_10_0 = a.field_e;
                      stackIn_12_0 = stackOut_10_0;
                      break L3;
                    }
                  }
                  return stackIn_12_0;
                }
              } else {
                return mi.field_c;
              }
            } else {
              L4: {
                if (((mg) this).field_o) {
                  stackOut_17_0 = mc.field_a;
                  stackIn_18_0 = stackOut_17_0;
                  break L4;
                } else {
                  stackOut_16_0 = a.field_e;
                  stackIn_18_0 = stackOut_16_0;
                  break L4;
                }
              }
              return stackIn_18_0;
            }
          }
        }
    }

    final static void h(byte param0) {
        int[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        int[] var6 = null;
        int[] var7 = null;
        var4 = Bounce.field_N;
        var7 = oc.field_a;
        var6 = var7;
        var5 = var6;
        var1 = var5;
        if (param0 != -121) {
          mg.h((byte) -95);
          var2 = 0;
          var3 = var7.length;
          L0: while (true) {
            if (var3 <= var2) {
              return;
            } else {
              var2++;
              var5[var2] = 0;
              var2++;
              var5[var2] = 0;
              var2++;
              var5[var2] = 0;
              var2++;
              var5[var2] = 0;
              var2++;
              var5[var2] = 0;
              var2++;
              var5[var2] = 0;
              var2++;
              var5[var2] = 0;
              var2++;
              var5[var2] = 0;
              continue L0;
            }
          }
        } else {
          var2 = 0;
          var3 = var7.length;
          L1: while (true) {
            if (var3 <= var2) {
              return;
            } else {
              var2++;
              var5[var2] = 0;
              var2++;
              var5[var2] = 0;
              var2++;
              var5[var2] = 0;
              var2++;
              var5[var2] = 0;
              var2++;
              var5[var2] = 0;
              var2++;
              var5[var2] = 0;
              var2++;
              var5[var2] = 0;
              var2++;
              var5[var2] = 0;
              continue L1;
            }
          }
        }
    }

    final static void a(boolean param0, java.applet.Applet param1, String param2, boolean param3) {
        try {
            if (!param0) {
                Object var5 = null;
                byte[] discarded$0 = mg.a((byte) 33, (String) null);
            }
            if (si.field_a.startsWith("win")) {
                if (lc.a(-29935, param2)) {
                    return;
                }
            }
            try {
                param1.getAppletContext().showDocument(new java.net.URL(param2), "_blank");
            } catch (java.net.MalformedURLException malformedURLException) {
                ti.a((Throwable) null, (byte) 100, "MGR1: " + param2);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final String a(String param0, byte param1) {
        String var3 = null;
        rg var4 = null;
        CharSequence var5 = null;
        var5 = (CharSequence) (Object) param0;
        var3 = db.a(var5, 8351);
        if (var3 == null) {
          L0: {
            if (param0.equals((Object) (Object) ((mg) this).field_m)) {
              break L0;
            } else {
              var4 = pd.a(1059, param0);
              if (var4 != null) {
                if (null == var4.field_c) {
                  ((mg) this).field_m = param0;
                  ((mg) this).field_o = var4.field_f;
                  break L0;
                } else {
                  return null;
                }
              } else {
                return null;
              }
            }
          }
          if (!((mg) this).field_o) {
            return ma.field_n;
          } else {
            if (param1 != -114) {
              mg.d(36);
              return ne.field_q;
            } else {
              return ne.field_q;
            }
          }
        } else {
          return var3;
        }
    }

    public static void e(int param0) {
        field_k = null;
        field_l = null;
        field_j = null;
        if (param0 != 0) {
            field_k = null;
        }
    }

    final static byte[] a(byte param0, String param1) {
        if (param0 != 48) {
            field_l = null;
            return ih.field_p.b("", param1, 16);
        }
        return ih.field_p.b("", param1, 16);
    }

    final static void d(int param0) {
        la.a(640, true);
        if (param0 != 30432) {
            mg.h((byte) -25);
        }
    }

    final void i(byte param0) {
        if (param0 >= -106) {
            return;
        }
        ((mg) this).field_m = null;
    }

    mg(ba param0) {
        super(param0);
        ((mg) this).field_o = false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = "Click";
        field_j = new int[4];
        field_k = "Waiting for fonts";
    }
}
