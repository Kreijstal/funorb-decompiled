/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class coa implements ntb {
    static int[] field_d;
    lc field_e;
    boolean field_a;
    int[] field_c;
    private int[] field_b;
    static int field_f;

    final void a(byte param0) {
        if (param0 != -65) {
            int[] discarded$0 = this.b(-107);
        }
        ((coa) this).field_b = this.b(param0 ^ -64);
        ((coa) this).field_c = this.c(0);
        ((coa) this).field_a = true;
    }

    final boolean d(int param0, byte param1) {
        int var3 = ((coa) this).field_b[param0];
        if (param1 != -43) {
            return true;
        }
        return this.b(var3, false);
    }

    final boolean c(int param0, int param1) {
        int var3 = 0;
        int stackIn_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        L0: {
          L1: {
            var3 = -81 / ((param1 - 16) / 49);
            if (-3 == (param0 ^ -1)) {
              break L1;
            } else {
              if (param0 != 7) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L0;
              } else {
                break L1;
              }
            }
          }
          stackOut_3_0 = 1;
          stackIn_5_0 = stackOut_3_0;
          break L0;
        }
        return stackIn_5_0 != 0;
    }

    private final boolean b(int param0, boolean param1) {
        Object var4 = null;
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (!param1) {
            break L0;
          } else {
            var4 = null;
            ana discarded$2 = coa.a(-94, -103, 25, (gd) null);
            break L0;
          }
        }
        L1: {
          L2: {
            if (-4 == (param0 ^ -1)) {
              break L2;
            } else {
              if ((param0 ^ -1) != -9) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                break L1;
              } else {
                break L2;
              }
            }
          }
          stackOut_5_0 = 1;
          stackIn_7_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_7_0 != 0;
    }

    public final void b(byte param0, tv param1) {
        coa var3 = (coa) (Object) param1;
        var3.field_b = dob.a(var3.field_b, (byte) -108, var3.field_b);
        var3.field_c = dob.a(var3.field_c, (byte) -38, var3.field_c);
        var3.field_a = var3.field_a;
        if (param0 < 54) {
            boolean discarded$0 = ((coa) this).d(-67, (byte) -39);
        }
    }

    public final void a(tv param0, int param1) {
        coa var5 = (coa) (Object) param0;
        if (param1 >= -19) {
            return;
        }
        int var4 = 0;
        if (!(!ikb.a(var5.field_b, var5.field_b, false))) {
            var4 = 1;
            System.out.println("int[] voteoption_states has changed. ");
        }
        if (ikb.a(var5.field_c, var5.field_c, false)) {
            var4 = 1;
            System.out.println("int[] componentoption_states has changed. ");
        }
        if (!((!var5.field_a ? 1 : 0) == (!var5.field_a ? 1 : 0))) {
            var4 = 1;
            System.out.println("boolean copy_to_clipboard_hidden has changed. before=" + var5.field_a + ", now=" + var5.field_a);
        }
        if (!(var4 == 0)) {
            System.out.println("This instance of ServerInfo has changed");
        }
    }

    final boolean a(int param0, boolean param1) {
        int var3 = 0;
        if (!param1) {
          if (pr.field_c != null) {
            var3 = pr.field_c.field_g;
            if (-2 != (var3 ^ -1)) {
              if (pla.a(param0, -4)) {
                return false;
              } else {
                return true;
              }
            } else {
              L0: {
                if (!qq.a(param0, true)) {
                  break L0;
                } else {
                  if (pla.a(param0, -4)) {
                    break L0;
                  } else {
                    return false;
                  }
                }
              }
              return true;
            }
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    private final void a(int param0) {
        int[] var3 = null;
        int[] var2 = null;
        int[] var4 = null;
        if (null == ((coa) this).field_b) {
            ((coa) this).field_b = this.b(119);
            return;
        }
        if ((((coa) this).field_b.length ^ -1) != -32) {
            var3 = this.b(param0 + -13424);
            var2 = var3;
            this.a(((coa) this).field_b, (byte) 117, var3);
            ((coa) this).field_b = var3;
        }
        if (((coa) this).field_c == null) {
            ((coa) this).field_c = this.c(param0 + -13546);
            return;
        }
        if (param0 != 13546) {
            boolean discarded$0 = ((coa) this).d(-88, (byte) 56);
        }
        if (56 != ((coa) this).field_c.length) {
            var4 = this.c(0);
            var2 = var4;
            this.a(((coa) this).field_c, (byte) 108, var4);
            ((coa) this).field_c = var4;
        }
    }

    final boolean a(int param0, boolean param1, boolean param2) {
        int stackIn_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        L0: {
          if (!param2) {
            break L0;
          } else {
            int[] discarded$2 = this.c(66);
            break L0;
          }
        }
        L1: {
          L2: {
            if (param0 == 0) {
              break L2;
            } else {
              if (1 == param0) {
                break L2;
              } else {
                if (param0 == -4) {
                  break L2;
                } else {
                  L3: {
                    if (!param1) {
                      break L3;
                    } else {
                      if (param0 == 5) {
                        break L2;
                      } else {
                        if (-7 == param0) {
                          break L2;
                        } else {
                          if (-9 != (param0 ^ -1)) {
                            break L3;
                          } else {
                            break L2;
                          }
                        }
                      }
                    }
                  }
                  stackOut_11_0 = 0;
                  stackIn_12_0 = stackOut_11_0;
                  break L1;
                }
              }
            }
          }
          stackOut_10_0 = 1;
          stackIn_12_0 = stackOut_10_0;
          break L1;
        }
        return stackIn_12_0 != 0;
    }

    public final String toString() {
        return "Voteoption states=" + fva.a(((coa) this).field_b, false) + "\nComponentoption states=" + fva.a(((coa) this).field_c, false) + "\ncopy_to_clipboard_hidden=" + ((coa) this).field_a + "\nServerside: " + ((coa) this).field_e;
    }

    final boolean d(int param0, int param1) {
        if (param0 != -22549) {
            ((coa) this).field_e = null;
        }
        int var3 = ((coa) this).field_c[param1];
        return ((coa) this).c(var3, param0 + 22645);
    }

    public static void a(boolean param0) {
        field_d = null;
        if (!param0) {
            field_f = -124;
        }
    }

    private final void a(int[] param0, byte param1, int[] param2) {
        int var5 = 0;
        int var6 = VoidHunters.field_G;
        int var4 = Math.min(param2.length, param0.length);
        for (var5 = 0; var4 > var5; var5++) {
            param2[var5] = param0[var5];
        }
        if (param1 < 103) {
            boolean discarded$0 = this.a(36, 79);
        }
    }

    final boolean a(int param0, byte param1) {
        int var3 = ((coa) this).field_b[param0];
        int var4 = 22 % ((-29 - param1) / 48);
        return this.a(true, var3);
    }

    final boolean b(int param0, int param1) {
        if (param1 != 4) {
            Object var4 = null;
            ((coa) this).b((byte) 119, (tv) null);
        }
        int var3 = ((coa) this).field_b[param0];
        return ((coa) this).c(var3, -52);
    }

    private final boolean a(int param0, int param1) {
        int stackIn_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        L0: {
          if (param1 == -8) {
            break L0;
          } else {
            int[] discarded$2 = this.b(-5);
            break L0;
          }
        }
        L1: {
          L2: {
            if (5 == param0) {
              break L2;
            } else {
              if (6 == param0) {
                break L2;
              } else {
                if ((param0 ^ -1) == -8) {
                  break L2;
                } else {
                  if ((param0 ^ -1) != -9) {
                    stackOut_8_0 = 0;
                    stackIn_9_0 = stackOut_8_0;
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
            }
          }
          stackOut_7_0 = 1;
          stackIn_9_0 = stackOut_7_0;
          break L1;
        }
        return stackIn_9_0 != 0;
    }

    final boolean a(boolean param0, int param1, byte param2) {
        if (param2 != -84) {
            return true;
        }
        int var4 = ((coa) this).field_c[param1];
        return ((coa) this).a(var4, param0, false);
    }

    final static ana a(int param0, int param1, int param2, gd param3) {
        if (param1 != 100) {
            field_d = null;
        }
        return ka.a(param1 + -193, fga.a(param3, 100, param0, param2));
    }

    private final int[] b(int param0) {
        int var3 = 0;
        int var4 = VoidHunters.field_G;
        int[] var5 = new int[31];
        int[] var2 = var5;
        for (var3 = 0; (var3 ^ -1) > -32; var3++) {
            var5[var3] = 5;
        }
        int var6 = 0;
        var3 = var6;
        while ((var6 ^ -1) > -15) {
            var2[var6] = 4;
            var6++;
        }
        var2[4] = 5;
        var2[9] = 5;
        var2[3] = 5;
        var2[11] = 5;
        var2[12] = 5;
        var2[30] = 4;
        if (param0 <= 117) {
            ((coa) this).field_c = null;
        }
        var2[29] = 4;
        var2[1] = 5;
        return var2;
    }

    private final void b(boolean param0) {
        if (!param0) {
            field_d = null;
        }
        this.a(13546);
    }

    public final void a(faa param0, boolean param1) {
        ((coa) this).field_b = wkb.a((byte) 37, ((coa) this).field_b, param0, 8);
        ((coa) this).field_c = wkb.a((byte) 37, ((coa) this).field_c, param0, 8);
        ((coa) this).field_a = kv.a(param1, param0);
        this.b(true);
    }

    final boolean a(byte param0, int param1) {
        if (param0 > -116) {
            boolean discarded$0 = ((coa) this).c(-38, (byte) 32);
        }
        int var3 = ((coa) this).field_b[param1];
        return this.a(var3, -8);
    }

    final boolean a(int param0, int param1, boolean param2) {
        int var4 = ((coa) this).field_b[param0];
        if (param1 != 11) {
            ((coa) this).field_c = null;
        }
        if (!((coa) this).a(param0, false)) {
            return false;
        }
        return ((coa) this).a(var4, param2, false);
    }

    public final void b(faa param0, int param1) {
        pgb.a(8, null != ((coa) this).field_b ? ((coa) this).field_b.length : 0, 44, param0, ((coa) this).field_b);
        pgb.a(8, ((coa) this).field_c == null ? 0 : ((coa) this).field_c.length, 60, param0, ((coa) this).field_c);
        boolean discarded$11 = vq.a(param0, -110, ((coa) this).field_a);
        if (param1 >= -109) {
            ((coa) this).field_e = null;
        }
    }

    final boolean b(int param0, byte param1) {
        if (param1 != 24) {
            ((coa) this).a((byte) 119);
        }
        int var3 = ((coa) this).field_c[param0];
        return this.a(var3, param1 ^ -32);
    }

    private final int[] c(int param0) {
        int var3 = 0;
        int var4 = VoidHunters.field_G;
        int[] var5 = new int[56];
        int[] var2 = var5;
        for (var3 = param0; var3 < var5.length; var3++) {
            var5[var3] = 0;
        }
        int var6 = 8;
        var3 = var6;
        while (-13 < (var6 ^ -1)) {
            var2[var6] = 5;
            var6++;
        }
        return var2;
    }

    final static boolean b(byte param0, int param1) {
        if (param0 != -117) {
            return true;
        }
        if (0 > param1) {
            return -1 == ((1 + param1) % 4 ^ -1) ? true : false;
        }
        if (param1 > -1583) {
            return param1 % 4 == 0 ? true : false;
        }
        if (-1 != param1 % 4) {
            return false;
        }
        if (param1 % 100 != 0) {
            return true;
        }
        if (0 == param1 % 400) {
            return true;
        }
        return false;
    }

    final static arb a(byte[] param0, int param1) {
        if (param0 == null) {
            return null;
        }
        arb var2 = new arb(param0, iib.field_e, so.field_f, nhb.field_o, hla.field_a, sh.field_a);
        if (param1 != 11) {
            Object var3 = null;
            arb discarded$0 = coa.a((byte[]) null, -100);
        }
        qqb.a(69);
        return var2;
    }

    private final boolean a(boolean param0, int param1) {
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        if (param0) {
          L0: {
            L1: {
              if (param1 == 1) {
                break L1;
              } else {
                if (6 != param1) {
                  stackOut_6_0 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            stackOut_5_0 = 1;
            stackIn_7_0 = stackOut_5_0;
            break L0;
          }
          return stackIn_7_0 != 0;
        } else {
          return true;
        }
    }

    final boolean c(int param0, byte param1) {
        if (param1 != 34) {
            field_d = null;
        }
        int var3 = ((coa) this).field_c[param0];
        return -5 != (var3 ^ -1) ? true : false;
    }

    public final boolean a(byte param0, tv param1) {
        coa var3 = null;
        int var4 = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        L0: {
          L1: {
            var4 = 55 / ((param0 - 22) / 59);
            var3 = (coa) (Object) param1;
            if (wpb.a(var3.field_b, var3.field_b, (byte) 28)) {
              break L1;
            } else {
              if (wpb.a(var3.field_c, var3.field_c, (byte) 28)) {
                break L1;
              } else {
                L2: {
                  if (var3.field_a) {
                    stackOut_4_0 = 0;
                    stackIn_5_0 = stackOut_4_0;
                    break L2;
                  } else {
                    stackOut_3_0 = 1;
                    stackIn_5_0 = stackOut_3_0;
                    break L2;
                  }
                }
                if (stackIn_5_0 != (var3.field_a ? 1 : 0)) {
                  stackOut_7_0 = 0;
                  stackIn_8_0 = stackOut_7_0;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
          }
          stackOut_6_0 = 1;
          stackIn_8_0 = stackOut_6_0;
          break L0;
        }
        return stackIn_8_0 != 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        int var1 = 0;
        int var2 = 0;
        field_d = new int[256];
        var1 = 0;
        L0: while (true) {
          if (256 <= var1) {
            field_f = 64;
          } else {
            var0 = var1;
            var2 = 0;
            L1: while (true) {
              if ((var2 ^ -1) <= -9) {
                field_d[var1] = var0;
                var1++;
                continue L0;
              } else {
                if ((1 & var0) != 1) {
                  var0 = var0 >>> 1;
                  var2++;
                  continue L1;
                } else {
                  var0 = var0 >>> -1109173343 ^ -306674912;
                  var2++;
                  continue L1;
                }
              }
            }
          }
        }
    }
}
