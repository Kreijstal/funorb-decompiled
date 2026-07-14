/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class no extends se {
    static String field_i;
    static int field_m;
    private boolean field_j;
    static int field_k;
    private String field_l;

    public static void b(boolean param0) {
        if (!param0) {
            no.b(true);
            field_i = null;
            return;
        }
        field_i = null;
    }

    final void d(int param0) {
        if (param0 != -31626) {
            field_m = -99;
            ((no) this).field_l = null;
            return;
        }
        ((no) this).field_l = null;
    }

    final String a(String param0, int param1) {
        int var3 = 0;
        String var4 = null;
        si var5 = null;
        CharSequence var6 = null;
        var3 = 15 % ((41 - param1) / 49);
        var6 = (CharSequence) (Object) param0;
        var4 = rf.a(var6, -63);
        if (var4 == null) {
          L0: {
            if (param0.equals((Object) (Object) ((no) this).field_l)) {
              break L0;
            } else {
              var5 = aj.a(-112, param0);
              if (var5 != null) {
                if (var5.field_h == null) {
                  ((no) this).field_l = param0;
                  ((no) this).field_j = var5.field_b;
                  break L0;
                } else {
                  return null;
                }
              } else {
                return null;
              }
            }
          }
          if (!((no) this).field_j) {
            return db.field_f;
          } else {
            return ao.field_c;
          }
        } else {
          return var4;
        }
    }

    final static void a(int param0, int param1, int param2, f[][] param3) {
        ja.a(param0, param3, param2, false, 1);
        if (param1 != -8383) {
            no.e((byte) -125);
        }
    }

    no(ga param0) {
        super(param0);
        ((no) this).field_j = false;
    }

    final oi a(String param0, byte param1) {
        si var6 = null;
        si var7 = null;
        CharSequence var8 = null;
        CharSequence var9 = null;
        oi stackIn_12_0 = null;
        oi stackIn_18_0 = null;
        oi stackIn_32_0 = null;
        oi stackOut_31_0 = null;
        oi stackOut_30_0 = null;
        oi stackOut_11_0 = null;
        oi stackOut_10_0 = null;
        oi stackOut_17_0 = null;
        oi stackOut_16_0 = null;
        if (param1 == -122) {
          var9 = (CharSequence) (Object) param0;
          if (!a.a(-30, var9)) {
            return rk.field_c;
          } else {
            L0: {
              if (!param0.equals((Object) (Object) ((no) this).field_l)) {
                L1: {
                  var7 = aj.a(-114, param0);
                  if (var7 == null) {
                    break L1;
                  } else {
                    if (null != var7.field_h) {
                      break L1;
                    } else {
                      ((no) this).field_j = var7.field_b;
                      ((no) this).field_l = param0;
                      break L0;
                    }
                  }
                }
                return ec.field_h;
              } else {
                break L0;
              }
            }
            L2: {
              if (!((no) this).field_j) {
                stackOut_31_0 = rk.field_c;
                stackIn_32_0 = stackOut_31_0;
                break L2;
              } else {
                stackOut_30_0 = ih.field_b;
                stackIn_32_0 = stackOut_30_0;
                break L2;
              }
            }
            return stackIn_32_0;
          }
        } else {
          ((no) this).d(70);
          var8 = (CharSequence) (Object) param0;
          if (!a.a(-30, var8)) {
            return rk.field_c;
          } else {
            if (!param0.equals((Object) (Object) ((no) this).field_l)) {
              var6 = aj.a(-114, param0);
              if (var6 != null) {
                if (null != var6.field_h) {
                  return ec.field_h;
                } else {
                  L3: {
                    ((no) this).field_j = var6.field_b;
                    ((no) this).field_l = param0;
                    if (!((no) this).field_j) {
                      stackOut_11_0 = rk.field_c;
                      stackIn_12_0 = stackOut_11_0;
                      break L3;
                    } else {
                      stackOut_10_0 = ih.field_b;
                      stackIn_12_0 = stackOut_10_0;
                      break L3;
                    }
                  }
                  return stackIn_12_0;
                }
              } else {
                return ec.field_h;
              }
            } else {
              L4: {
                if (!((no) this).field_j) {
                  stackOut_17_0 = rk.field_c;
                  stackIn_18_0 = stackOut_17_0;
                  break L4;
                } else {
                  stackOut_16_0 = ih.field_b;
                  stackIn_18_0 = stackOut_16_0;
                  break L4;
                }
              }
              return stackIn_18_0;
            }
          }
        }
    }

    final static void e(byte param0) {
        if (ph.field_E != null) {
          fq.a(-32, (java.awt.Canvas) (Object) ph.field_E);
          ph.field_E.a(te.field_a, (byte) -92);
          ph.field_E = null;
          if (ne.field_f == null) {
            if (param0 != -23) {
              field_i = null;
              jd.field_D.requestFocus();
              return;
            } else {
              jd.field_D.requestFocus();
              return;
            }
          } else {
            ne.field_f.a((byte) 96);
            if (param0 == -23) {
              jd.field_D.requestFocus();
              return;
            } else {
              field_i = null;
              jd.field_D.requestFocus();
              return;
            }
          }
        } else {
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = 2;
        field_i = "Logging in...";
    }
}
