/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vga extends vpa {
    private ng[] field_o;
    static vna field_n;
    static boolean field_q;
    private ng field_p;

    public vga() {
        ((vga) this).field_o = new ng[6];
        ((vga) this).field_p = new ng();
        ((vga) this).field_o[0] = new ng();
        ng var1 = new ng();
        var1.a(true);
    }

    final static void a(java.applet.Applet param0, byte param1) {
        if (param1 > -96) {
            vga.b(91);
        }
        String var2 = param0.getParameter("username");
        if (var2 != null) {
            CharSequence var3 = (CharSequence) (Object) var2;
            // ifne L45
        }
        return;
    }

    final void a(int param0, iu[] param1) {
        ng[] var3 = null;
        int var4 = 0;
        ng var5 = null;
        int var6 = 0;
        Object var7 = null;
        ng[] var8 = null;
        L0: {
          var6 = TombRacer.field_G ? 1 : 0;
          var8 = ((vga) this).field_o;
          var3 = var8;
          if (param0 == -18379) {
            break L0;
          } else {
            var7 = null;
            this.a((byte) -79, (vga) null, false);
            break L0;
          }
        }
        var4 = 0;
        L1: while (true) {
          if (var8.length <= var4) {
            return;
          } else {
            var5 = var8[var4];
            if (var5 != null) {
              var5.field_i = param1;
              var4++;
              continue L1;
            } else {
              var4++;
              continue L1;
            }
          }
        }
    }

    final void a(iu param0, byte param1) {
        ng[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        ng var6 = null;
        int var7 = 0;
        ng[] var8 = null;
        var7 = TombRacer.field_G ? 1 : 0;
        var8 = ((vga) this).field_o;
        var3 = var8;
        var5 = -107 / ((-39 - param1) / 62);
        var4 = 0;
        L0: while (true) {
          if (var8.length <= var4) {
            return;
          } else {
            var6 = var8[var4];
            if (var6 != null) {
              var6.field_c = param0;
              var4++;
              continue L0;
            } else {
              var4++;
              continue L0;
            }
          }
        }
    }

    public static void b(int param0) {
        field_n = null;
        if (param0 < 36) {
            field_q = true;
        }
    }

    final void a(int param0, int param1, iu[] param2) {
        if (param0 != 0) {
            ((vga) this).field_p = null;
        }
        int var4 = param1;
        if (null == ((vga) this).field_o[var4]) {
            ((vga) this).field_o[var4] = new ng();
        }
        ((vga) this).field_o[param1].field_i = param2;
    }

    final ng a(int param0, byte param1) {
        if (param1 < 40) {
            ng discarded$0 = ((vga) this).a(100, (byte) 15);
        }
        ((vga) this).field_o[param0] = new ng();
        return new ng();
    }

    public final void a(ae param0, int param1, int param2, int param3, boolean param4) {
        ng var7 = null;
        ng var9 = null;
        rj var10 = null;
        ng var11 = null;
        ng var12 = null;
        ng var13 = null;
        ng var14 = null;
        ae stackIn_3_0 = null;
        Object stackOut_2_0 = null;
        ae stackOut_1_0 = null;
        L0: {
          if (!(param0 instanceof rj)) {
            stackOut_2_0 = null;
            stackIn_3_0 = (ae) (Object) stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = (ae) param0;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var10 = (rj) (Object) stackIn_3_0;
          tga.a(param2 + -16799168, param0.field_i + param1, param1 - -param0.field_i + param0.field_m, param0.field_n + param3, param0.field_n + param3 + param0.field_p);
          if (var10 != null) {
            param4 = param4 & var10.field_y;
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          var7 = ((vga) this).field_o[0];
          ((vga) this).field_p.a(true);
          if (param2 == 16777215) {
            break L2;
          } else {
            ((vga) this).field_o = null;
            break L2;
          }
        }
        L3: {
          var7.a((vga) this, param0, 123, param3, param1, ((vga) this).field_p);
          if (var10 == null) {
            break L3;
          } else {
            L4: {
              if (var10.field_w) {
                var11 = ((vga) this).field_o[1];
                if (var11 != null) {
                  var11.a((vga) this, param0, 125, param3, param1, ((vga) this).field_p);
                  break L4;
                } else {
                  break L4;
                }
              } else {
                break L4;
              }
            }
            if (var10.field_f) {
              L5: {
                var12 = ((vga) this).field_o[3];
                if (0 == var10.field_s) {
                  break L5;
                } else {
                  if (var12 != null) {
                    var12.a((vga) this, param0, 123, param3, param1, ((vga) this).field_p);
                    break L3;
                  } else {
                    break L5;
                  }
                }
              }
              var9 = ((vga) this).field_o[2];
              if (var9 != null) {
                var9.a((vga) this, param0, param2 ^ 16777092, param3, param1, ((vga) this).field_p);
                break L3;
              } else {
                break L3;
              }
            } else {
              break L3;
            }
          }
        }
        L6: {
          if (param0.b((byte) -34)) {
            var13 = ((vga) this).field_o[5];
            if (var13 != null) {
              var13.a((vga) this, param0, 123, param3, param1, ((vga) this).field_p);
              break L6;
            } else {
              break L6;
            }
          } else {
            break L6;
          }
        }
        L7: {
          if (!param4) {
            var14 = ((vga) this).field_o[4];
            if (var14 == null) {
              break L7;
            } else {
              var14.a((vga) this, param0, 126, param3, param1, ((vga) this).field_p);
              break L7;
            }
          } else {
            break L7;
          }
        }
        ((vga) this).field_p.a(-83, param1, (vga) this, param3, param0);
        pfa.a(1);
    }

    private final void a(byte param0, vga param1, boolean param2) {
        int var4 = 0;
        ng var5 = null;
        ng var6 = null;
        ng var6_ref = null;
        int var7 = 0;
        Object var8 = null;
        ng stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        ng stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        ng stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        ng stackIn_10_2 = null;
        ng stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        ng stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        ng stackOut_9_2 = null;
        ng stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        ng stackOut_8_2 = null;
        L0: {
          var7 = TombRacer.field_G ? 1 : 0;
          if (param0 == -16) {
            break L0;
          } else {
            var8 = null;
            ((vga) this).a(-72, (iu[]) null);
            break L0;
          }
        }
        L1: {
          super.a((vpa) (Object) param1, param0 + -64);
          if (!param2) {
            lua.a((Object[]) (Object) ((vga) this).field_o, 0, (Object[]) (Object) param1.field_o, 0, 6);
            break L1;
          } else {
            var4 = 0;
            L2: while (true) {
              if (var4 >= 6) {
                break L1;
              } else {
                var5 = ((vga) this).field_o[var4];
                var6 = var5;
                var6 = var5;
                if (var5 != null) {
                  L3: {
                    var6_ref = param1.field_o[var4];
                    stackOut_7_0 = (ng) var5;
                    stackOut_7_1 = 1;
                    stackIn_9_0 = stackOut_7_0;
                    stackIn_9_1 = stackOut_7_1;
                    stackIn_8_0 = stackOut_7_0;
                    stackIn_8_1 = stackOut_7_1;
                    if (var6_ref != null) {
                      stackOut_9_0 = (ng) (Object) stackIn_9_0;
                      stackOut_9_1 = stackIn_9_1;
                      stackOut_9_2 = (ng) var6_ref;
                      stackIn_10_0 = stackOut_9_0;
                      stackIn_10_1 = stackOut_9_1;
                      stackIn_10_2 = stackOut_9_2;
                      break L3;
                    } else {
                      param1.field_o[var4] = new ng();
                      stackOut_8_0 = (ng) (Object) stackIn_8_0;
                      stackOut_8_1 = stackIn_8_1;
                      stackOut_8_2 = new ng();
                      stackIn_10_0 = stackOut_8_0;
                      stackIn_10_1 = stackOut_8_1;
                      stackIn_10_2 = stackOut_8_2;
                      break L3;
                    }
                  }
                  ((ng) (Object) stackIn_10_0).a(stackIn_10_1 != 0, stackIn_10_2);
                  var4++;
                  continue L2;
                } else {
                  param1.field_o[var4] = null;
                  var4++;
                  continue L2;
                }
              }
            }
          }
        }
    }

    vga(vga param0, boolean param1) {
        this();
        param0.a((byte) -16, (vga) this, param1);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = new vna();
    }
}
