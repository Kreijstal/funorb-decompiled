/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vd extends vn implements mj {
    private boolean field_Hb;
    private ol field_Ib;
    private boolean field_Jb;
    static String field_Gb;

    final static boolean p(int param0) {
        if (param0 <= -36) {
          if (10 <= rm.field_Q) {
            if (il.field_a < 13) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          return true;
        }
    }

    public final void a(fb param0, int param1, int param2, int param3, int param4) {
        if (param4 != -24221) {
            ((vd) this).field_Ib = null;
        }
        if (((vd) this).field_Jb) {
            in.a((byte) 95, false, true);
            return;
        }
        try {
            ij.a(-128);
            ((vd) this).k((byte) -114);
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) (Object) runtimeException, "vd.DA(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    private final void a(boolean param0, aj param1, int param2) {
        RuntimeException var4 = null;
        String var4_ref = null;
        e var5 = null;
        int var6 = 0;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        var6 = Chess.field_G;
        try {
          L0: {
            L1: {
              ((vd) this).field_Hb = true;
              if (!param1.field_h) {
                if (param1.field_a != null) {
                  var4_ref = eg.field_g;
                  if (null != ((vd) this).field_Ib) {
                    ((vd) this).field_Ib.a(120);
                    break L1;
                  } else {
                    break L1;
                  }
                } else {
                  var4_ref = param1.field_e;
                  if (param1.field_g != 248) {
                    break L1;
                  } else {
                    L2: {
                      if (!param0) {
                        ln.f((byte) -74);
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                    var4_ref = nj.field_z;
                    ((vd) this).field_Jb = true;
                    break L1;
                  }
                }
              } else {
                var4_ref = ge.field_db;
                break L1;
              }
            }
            L3: {
              var5 = new e((vn) this, tk.field_a, var4_ref);
              if (!param1.field_h) {
                L4: {
                  if (!((vd) this).field_Jb) {
                    if (5 != param1.field_g) {
                      var5.a(-1, 114, fa.field_k);
                      break L4;
                    } else {
                      var5.a(11, 67, vi.field_a);
                      var5.a(17, 39, sn.field_b);
                      break L4;
                    }
                  } else {
                    fb discarded$2 = var5.a((byte) -114, (rg) this, sg.field_e);
                    break L4;
                  }
                }
                if (param1.field_g != 3) {
                  if (param1.field_g == 6) {
                    var5.a(9, 124, gg.field_e);
                    break L3;
                  } else {
                    break L3;
                  }
                } else {
                  var5.a(7, 30, ki.field_Q);
                  break L3;
                }
              } else {
                if (param1.field_f) {
                  ((vd) this).c((mf) (Object) new ba((vd) this), 100);
                  return;
                } else {
                  fb discarded$3 = var5.a((byte) -114, (rg) this, sg.field_e);
                  break L3;
                }
              }
            }
            ((vd) this).c((mf) (Object) var5, 108);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_32_0 = (RuntimeException) var4;
            stackOut_32_1 = new StringBuilder().append("vd.M(").append(param0).append(44);
            stackIn_34_0 = stackOut_32_0;
            stackIn_34_1 = stackOut_32_1;
            stackIn_33_0 = stackOut_32_0;
            stackIn_33_1 = stackOut_32_1;
            if (param1 == null) {
              stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
              stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
              stackOut_34_2 = "null";
              stackIn_35_0 = stackOut_34_0;
              stackIn_35_1 = stackOut_34_1;
              stackIn_35_2 = stackOut_34_2;
              break L5;
            } else {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "{...}";
              stackIn_35_0 = stackOut_33_0;
              stackIn_35_1 = stackOut_33_1;
              stackIn_35_2 = stackOut_33_2;
              break L5;
            }
          }
          throw fk.a((Throwable) (Object) stackIn_35_0, stackIn_35_2 + 44 + -1 + 41);
        }
    }

    vd(fm param0, ol param1) {
        super(param0, tk.field_a, ka.field_e, false, false);
        try {
            ((vd) this).field_Ib = param1;
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) (Object) runtimeException, "vd.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final boolean g(byte param0) {
        aj var2 = null;
        if (param0 <= -4) {
          if (((vd) this).field_P) {
            if (!((vd) this).field_Hb) {
              var2 = ik.b(6792);
              if (var2 == null) {
                return super.g((byte) -90);
              } else {
                this.a(false, var2, -1);
                return super.g((byte) -90);
              }
            } else {
              return super.g((byte) -90);
            }
          } else {
            return super.g((byte) -90);
          }
        } else {
          vd.l((byte) -32);
          if (((vd) this).field_P) {
            if (!((vd) this).field_Hb) {
              var2 = ik.b(6792);
              if (var2 == null) {
                return super.g((byte) -90);
              } else {
                this.a(false, var2, -1);
                return super.g((byte) -90);
              }
            } else {
              return super.g((byte) -90);
            }
          } else {
            return super.g((byte) -90);
          }
        }
    }

    public static void l(byte param0) {
        int var1 = 57 % ((-49 - param0) / 44);
        field_Gb = null;
    }

    final void o(int param0) {
        this.a(true, sc.a(nj.field_z, 248, (byte) -92), -1);
        if (param0 != -10896) {
            ((vd) this).field_Jb = false;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Gb = "Fullscreen mode was cancelled after a delay of 10 seconds. If you were unable to accept fullscreen mode during this time, there may be a problem with your configuration. You could try restarting your browser and trying again.";
    }
}
