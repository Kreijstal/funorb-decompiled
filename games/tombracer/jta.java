/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jta extends qr {
    static int[] field_z;
    private vna field_y;

    public static void c(boolean param0) {
        if (param0) {
            field_z = null;
            field_z = null;
            return;
        }
        field_z = null;
    }

    final void g(byte param0) {
        uja var2 = null;
        gn var3 = null;
        int var4 = 0;
        var4 = TombRacer.field_G ? 1 : 0;
        var2 = new uja(((jta) this).field_y);
        var3 = (gn) (Object) var2.a(true);
        if (param0 < -105) {
          L0: while (true) {
            if (var3 == null) {
              ((jta) this).field_x = (ae) (Object) ((jta) this).a((byte) -58);
              return;
            } else {
              L1: {
                if (!var3.a(127)) {
                  break L1;
                } else {
                  var3.p(71);
                  break L1;
                }
              }
              var3 = (gn) (Object) var2.a(-1);
              continue L0;
            }
          }
        } else {
          ((jta) this).g((byte) 58);
          L2: while (true) {
            if (var3 == null) {
              ((jta) this).field_x = (ae) (Object) ((jta) this).a((byte) -58);
              return;
            } else {
              L3: {
                if (!var3.a(127)) {
                  break L3;
                } else {
                  var3.p(71);
                  break L3;
                }
              }
              var3 = (gn) (Object) var2.a(-1);
              continue L2;
            }
          }
        }
    }

    final int g(int param0) {
        uja var2 = null;
        int var3 = 0;
        gn var4 = null;
        int var5 = 0;
        var5 = TombRacer.field_G ? 1 : 0;
        var2 = new uja(((jta) this).field_y);
        var3 = -2147483648;
        var4 = (gn) (Object) var2.a(true);
        L0: while (true) {
          if (var4 == null) {
            if (param0 >= -72) {
              field_z = null;
              return var3;
            } else {
              return var3;
            }
          } else {
            L1: {
              if (!var4.field_B) {
                break L1;
              } else {
                if (var3 < var4.field_m) {
                  var3 = var4.field_m;
                  break L1;
                } else {
                  var4 = (gn) (Object) var2.a(-1);
                  continue L0;
                }
              }
            }
            var4 = (gn) (Object) var2.a(-1);
            continue L0;
          }
        }
    }

    final static void a(boolean param0, boolean param1) {
        if (null != era.field_d) {
          if (era.field_d.a(param0, 94)) {
            era.field_d = null;
            if (param1) {
              return;
            } else {
              field_z = null;
              return;
            }
          } else {
            if (param1) {
              return;
            } else {
              field_z = null;
              return;
            }
          }
        } else {
          if (param1) {
            return;
          } else {
            field_z = null;
            return;
          }
        }
    }

    final void h(int param0) {
        uja var2 = null;
        gn var3 = null;
        int var4 = 0;
        var4 = TombRacer.field_G ? 1 : 0;
        var2 = new uja(((jta) this).field_y);
        var3 = (gn) (Object) var2.a(true);
        if (param0 != -1) {
          int discarded$1 = ((jta) this).d(true);
          L0: while (true) {
            if (var3 != null) {
              L1: {
                if (var3.a((byte) -115)) {
                  var3.p(param0 ^ -111);
                  break L1;
                } else {
                  break L1;
                }
              }
              var3 = (gn) (Object) var2.a(-1);
              continue L0;
            } else {
              return;
            }
          }
        } else {
          L2: while (true) {
            if (var3 != null) {
              L3: {
                if (var3.a((byte) -115)) {
                  var3.p(param0 ^ -111);
                  break L3;
                } else {
                  break L3;
                }
              }
              var3 = (gn) (Object) var2.a(-1);
              continue L2;
            } else {
              return;
            }
          }
        }
    }

    final gn a(byte param0) {
        int var2 = 0;
        uja var3 = null;
        gn var4 = null;
        int var5 = 0;
        var5 = TombRacer.field_G ? 1 : 0;
        var2 = -31 % ((6 - param0) / 61);
        var3 = new uja(((jta) this).field_y);
        var4 = (gn) (Object) var3.a(true);
        L0: while (true) {
          if (var4 != null) {
            if (!var4.field_B) {
              var4 = (gn) (Object) var3.a(-1);
              continue L0;
            } else {
              return var4;
            }
          } else {
            return null;
          }
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        uja var5 = null;
        ae var6 = null;
        int var7 = 0;
        L0: {
          var7 = TombRacer.field_G ? 1 : 0;
          if (((jta) this).field_r != null) {
            ((jta) this).field_r.a((ae) this, param0, 16777215, param1, true);
            break L0;
          } else {
            break L0;
          }
        }
        var5 = new uja(((jta) this).field_y);
        var6 = (ae) (Object) var5.a((byte) 71);
        L1: while (true) {
          if (var6 == null) {
            if (param2 != 0) {
              field_z = null;
              return;
            } else {
              return;
            }
          } else {
            var6.a(param0 + ((jta) this).field_i, ((jta) this).field_n + param1, 0, param3);
            var6 = (ae) (Object) var5.c(param2 + 42);
            continue L1;
          }
        }
    }

    final int f(int param0) {
        uja var2 = null;
        int var3 = 0;
        gn var4 = null;
        int var5 = 0;
        var5 = TombRacer.field_G ? 1 : 0;
        var2 = new uja(((jta) this).field_y);
        var3 = param0;
        var4 = (gn) (Object) var2.a(true);
        L0: while (true) {
          if (var4 == null) {
            return var3;
          } else {
            L1: {
              if (!var4.field_B) {
                break L1;
              } else {
                if (var4.field_p > var3) {
                  var3 = var4.field_p;
                  break L1;
                } else {
                  var4 = (gn) (Object) var2.a(-1);
                  continue L0;
                }
              }
            }
            var4 = (gn) (Object) var2.a(-1);
            continue L0;
          }
        }
    }

    final ae b(boolean param0) {
        uja var2 = null;
        Object var3 = null;
        gn var3_ref = null;
        int var4 = 0;
        uja stackIn_2_0 = null;
        uja stackIn_3_0 = null;
        uja stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        uja stackIn_12_0 = null;
        uja stackIn_13_0 = null;
        uja stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        uja stackOut_11_0 = null;
        uja stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        uja stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        uja stackOut_1_0 = null;
        uja stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        uja stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        var3 = null;
        var4 = TombRacer.field_G ? 1 : 0;
        if (!param0) {
          L0: {
            var2 = new uja(((jta) this).field_y);
            stackOut_11_0 = (uja) var2;
            stackIn_13_0 = stackOut_11_0;
            stackIn_12_0 = stackOut_11_0;
            if (param0) {
              stackOut_13_0 = (uja) (Object) stackIn_13_0;
              stackOut_13_1 = 0;
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              break L0;
            } else {
              stackOut_12_0 = (uja) (Object) stackIn_12_0;
              stackOut_12_1 = 1;
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              break L0;
            }
          }
          var3_ref = (gn) (Object) ((uja) (Object) stackIn_14_0).a(stackIn_14_1 != 0);
          L1: while (true) {
            if (var3_ref != null) {
              if (var3_ref.field_B) {
                return var3_ref.g((byte) 52);
              } else {
                var3_ref = (gn) (Object) var2.a(-1);
                continue L1;
              }
            } else {
              return null;
            }
          }
        } else {
          L2: {
            int discarded$4 = ((jta) this).d(false);
            var2 = new uja(((jta) this).field_y);
            stackOut_1_0 = (uja) var2;
            stackIn_3_0 = stackOut_1_0;
            stackIn_2_0 = stackOut_1_0;
            if (param0) {
              stackOut_3_0 = (uja) (Object) stackIn_3_0;
              stackOut_3_1 = 0;
              stackIn_4_0 = stackOut_3_0;
              stackIn_4_1 = stackOut_3_1;
              break L2;
            } else {
              stackOut_2_0 = (uja) (Object) stackIn_2_0;
              stackOut_2_1 = 1;
              stackIn_4_0 = stackOut_2_0;
              stackIn_4_1 = stackOut_2_1;
              break L2;
            }
          }
          var3_ref = (gn) (Object) ((uja) (Object) stackIn_4_0).a(stackIn_4_1 != 0);
          L3: while (true) {
            if (var3_ref != null) {
              if (var3_ref.field_B) {
                return var3_ref.g((byte) 52);
              } else {
                var3_ref = (gn) (Object) var2.a(-1);
                continue L3;
              }
            } else {
              return null;
            }
          }
        }
    }

    final static hea a(byte param0, String param1, cn param2, String param3, cn param4) {
        int var5 = 0;
        int var6 = 0;
        var5 = param2.b(param3, -7768);
        var6 = param2.a(true, param1, var5);
        if (param0 < 110) {
          field_z = null;
          return aca.a(param4, var5, param2, (byte) -110, var6);
        } else {
          return aca.a(param4, var5, param2, (byte) -110, var6);
        }
    }

    final void c(ae param0, int param1) {
        gn var3 = null;
        if (param0 instanceof gn) {
          if (param1 <= 81) {
            return;
          } else {
            var3 = (gn) (Object) param0;
            ((jta) this).field_y.a((byte) 125, (vg) (Object) var3);
            var3.field_B = true;
            boolean discarded$2 = var3.a((ae) this, false);
            return;
          }
        } else {
          throw new IllegalArgumentException();
        }
    }

    final void e(boolean param0) {
        uja var2 = null;
        gn var3 = null;
        int var4 = 0;
        var4 = TombRacer.field_G ? 1 : 0;
        var2 = new uja(((jta) this).field_y);
        var3 = (gn) (Object) var2.a(param0);
        L0: while (true) {
          if (var3 == null) {
            if (!param0) {
              return;
            } else {
              ((jta) this).field_x = null;
              return;
            }
          } else {
            var3.field_B = false;
            var3 = (gn) (Object) var2.a(-1);
            continue L0;
          }
        }
    }

    final int d(boolean param0) {
        int var2 = 0;
        gn var3 = null;
        if (!param0) {
          L0: {
            ((jta) this).field_y = null;
            var2 = -1;
            var3 = ((jta) this).a((byte) -87);
            if (var3 != null) {
              var2 = var3.field_p;
              break L0;
            } else {
              break L0;
            }
          }
          return var2;
        } else {
          L1: {
            var2 = -1;
            var3 = ((jta) this).a((byte) -87);
            if (var3 != null) {
              var2 = var3.field_p;
              break L1;
            } else {
              break L1;
            }
          }
          return var2;
        }
    }

    public jta() {
        super(0, 0, bb.field_m, qba.field_a, (isa) null, (qc) null);
        ((jta) this).field_y = new vna();
    }

    final int e(int param0) {
        int var2 = param0;
        gn var3 = ((jta) this).a((byte) -79);
        if (var3 != null) {
            var2 = var3.field_m;
        }
        return var2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_z = new int[]{0, 21};
    }
}
