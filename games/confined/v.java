/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class v extends dh implements el {
    static mi field_Bb;
    private boolean field_Fb;
    private ke field_Hb;
    private boolean field_Gb;
    static String field_Cb;
    static int field_Eb;
    static pb field_Db;

    private final void a(byte param0, boolean param1, in param2) {
        RuntimeException var4 = null;
        String var4_ref = null;
        jn var5 = null;
        int var6 = 0;
        Object var7 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        var6 = Confined.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              ((v) this).field_Fb = true;
              if (param2.field_a) {
                var4_ref = gd.field_r;
                break L1;
              } else {
                if (null == param2.field_c) {
                  var4_ref = param2.field_f;
                  if (param2.field_g == 248) {
                    L2: {
                      if (!param1) {
                        om.b(true);
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                    var4_ref = ec.field_a;
                    ((v) this).field_Gb = true;
                    break L1;
                  } else {
                    break L1;
                  }
                } else {
                  var4_ref = fh.field_c;
                  if (((v) this).field_Hb == null) {
                    break L1;
                  } else {
                    ((v) this).field_Hb.a((byte) -120);
                    break L1;
                  }
                }
              }
            }
            L3: {
              var5 = new jn((dh) this, fd.field_k, var4_ref);
              if (!param2.field_a) {
                L4: {
                  if (!((v) this).field_Gb) {
                    if (param2.field_g != 5) {
                      var5.a(0, te.field_i, -1);
                      break L4;
                    } else {
                      var5.a(0, ei.field_nb, 11);
                      var5.a(param0 + 96, al.field_c, 17);
                      break L4;
                    }
                  } else {
                    rg discarded$2 = var5.a(gi.field_fb, (uk) this, false);
                    break L4;
                  }
                }
                if (param2.field_g == 3) {
                  var5.a(0, ui.field_d, 7);
                  break L3;
                } else {
                  if (6 == param2.field_g) {
                    var5.a(0, tn.field_y, 9);
                    break L3;
                  } else {
                    break L3;
                  }
                }
              } else {
                if (param2.field_i) {
                  ((v) this).a((fj) (Object) new pi((v) this), (byte) -72);
                  return;
                } else {
                  rg discarded$3 = var5.a(gi.field_fb, (uk) this, false);
                  break L3;
                }
              }
            }
            ((v) this).a((fj) (Object) var5, (byte) -72);
            if (param0 == -96) {
              break L0;
            } else {
              var7 = null;
              ((v) this).a(106, -28, -124, (rg) null, -89);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_31_0 = (RuntimeException) var4;
            stackOut_31_1 = new StringBuilder().append("v.FB(").append(param0).append(44).append(param1).append(44);
            stackIn_33_0 = stackOut_31_0;
            stackIn_33_1 = stackOut_31_1;
            stackIn_32_0 = stackOut_31_0;
            stackIn_32_1 = stackOut_31_1;
            if (param2 == null) {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "null";
              stackIn_34_0 = stackOut_33_0;
              stackIn_34_1 = stackOut_33_1;
              stackIn_34_2 = stackOut_33_2;
              break L5;
            } else {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "{...}";
              stackIn_34_0 = stackOut_32_0;
              stackIn_34_1 = stackOut_32_1;
              stackIn_34_2 = stackOut_32_2;
              break L5;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_34_0, stackIn_34_2 + 41);
        }
    }

    public final void a(int param0, int param1, int param2, rg param3, int param4) {
        if (param0 < 68) {
            ((v) this).field_Fb = false;
        }
        if (!(!((v) this).field_Gb)) {
            wl.a(-66, false, true);
            return;
        }
        try {
            la.j(31);
            ((v) this).n(10);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "v.FA(" + param0 + 44 + param1 + 44 + param2 + 44 + (param3 != null ? "{...}" : "null") + 44 + param4 + 41);
        }
    }

    final boolean l(int param0) {
        in var2 = null;
        Object var3 = null;
        if (param0 == -6) {
          if (((v) this).field_H) {
            if (!((v) this).field_Fb) {
              var2 = lc.b((byte) -100);
              if (var2 == null) {
                return super.l(-6);
              } else {
                this.a((byte) -96, false, var2);
                return super.l(-6);
              }
            } else {
              return super.l(-6);
            }
          } else {
            return super.l(-6);
          }
        } else {
          var3 = null;
          ((v) this).a(-51, -9, 28, (rg) null, -54);
          if (((v) this).field_H) {
            if (((v) this).field_Fb) {
              return super.l(-6);
            } else {
              L0: {
                var2 = lc.b((byte) -100);
                if (var2 != null) {
                  this.a((byte) -96, false, var2);
                  break L0;
                } else {
                  break L0;
                }
              }
              return super.l(-6);
            }
          } else {
            return super.l(-6);
          }
        }
    }

    final void o(int param0) {
        this.a((byte) -96, true, gd.a(4, ec.field_a, 248));
        if (param0 < 107) {
            v.j((byte) -117);
        }
    }

    v(sh param0, ke param1) {
        super(param0, fd.field_k, un.field_d, false, false);
        try {
            ((v) this).field_Hb = param1;
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "v.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    public static void j(byte param0) {
        field_Db = null;
        field_Bb = null;
        if (param0 != -39) {
            return;
        }
        field_Cb = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Cb = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled, or try a different resolution.";
    }
}
