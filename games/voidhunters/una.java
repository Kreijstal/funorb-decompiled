/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class una implements ntb {
    static String field_f;
    int field_g;
    private int field_c;
    private bba[] field_b;
    static String field_a;
    private int[] field_d;
    int field_e;

    final void f(byte param0) {
        bba var3 = null;
        bba var4 = null;
        int var2 = 19 / ((param0 - 35) / 63);
        if (null != ((una) this).field_b) {
            if (((una) this).field_g > 0) {
                if (((una) this).field_b.length > ((una) this).field_g) {
                    var3 = ((una) this).field_b[-1 + ((una) this).field_g];
                    var4 = ((una) this).field_b[((una) this).field_g];
                    ((una) this).field_b[-1 + ((una) this).field_g] = var4;
                    ((una) this).field_b[((una) this).field_g] = var3;
                    ((una) this).field_g = ((una) this).field_g - 1;
                }
            }
        }
    }

    final boolean a(int param0, byte param1) {
        int var4 = 0;
        int var5 = VoidHunters.field_G;
        if (!(null != ((una) this).field_d)) {
            return true;
        }
        int var3 = 64 % ((-33 - param1) / 32);
        for (var4 = 0; var4 < ((una) this).field_d.length; var4++) {
            if (!(param0 != ((una) this).field_d[var4])) {
                return false;
            }
        }
        return true;
    }

    final void b(byte param0) {
        bba var2 = null;
        wm[] var3 = null;
        rna[] var4 = null;
        int var5 = 0;
        if (((una) this).field_b != null) {
            if ((((una) this).field_g ^ -1) <= -1) {
                if (((una) this).field_b.length > ((una) this).field_g) {
                    var2 = ((una) this).field_b[((una) this).field_g];
                    var3 = var2.a((byte) -125);
                    var4 = var2.c((byte) -42);
                    var5 = (var4 != null ? var4.length : 0) + (var3 == null ? 0 : var3.length);
                    ((una) this).field_e = (((una) this).field_e - -1) % var5;
                }
            }
        }
        if (param0 > -123) {
            ((una) this).field_d = null;
        }
    }

    final void e(byte param0) {
        bba var2 = null;
        if (((una) this).field_b != null) {
            if (-1 >= (((una) this).field_g ^ -1)) {
                if (!(((una) this).field_g >= ((una) this).field_b.length)) {
                    var2 = ((una) this).field_b[((una) this).field_g];
                    var2.a(((una) this).field_e, (byte) -79);
                    ((una) this).field_e = ((una) this).field_e - 1;
                    if (((una) this).field_e < 0) {
                        ((una) this).field_e = 0;
                    }
                }
            }
        }
        if (param0 != -99) {
            ((una) this).g((byte) -104);
        }
    }

    final void a(byte param0, wm param1) {
        if (((una) this).field_b != null) {
            if ((((una) this).field_g ^ -1) <= -1) {
                if (((una) this).field_b.length > ((una) this).field_g) {
                    ((una) this).field_b[((una) this).field_g].a((byte) -105, param1);
                }
            }
        }
        if (param0 > -112) {
            boolean discarded$0 = ((una) this).a(121, (byte) -5);
        }
    }

    public final void a(faa param0, boolean param1) {
        if (param1) {
            Object var4 = null;
            ((una) this).b((byte) -44, (tv) null);
        }
        ((una) this).field_b = (bba[]) (Object) kcb.a(8, vtb.field_o, param0, 1, -115, (tv[]) (Object) ((una) this).field_b);
        ((una) this).field_g = param0.i(0, 32);
        ((una) this).field_e = param0.i(0, 32);
        ((una) this).field_d = wkb.a((byte) 37, ((una) this).field_d, param0, 8);
    }

    public final void b(faa param0, int param1) {
        faa var3 = null;
        bba[] var4 = null;
        int var5 = 0;
        bba[] var6 = null;
        int var7 = 0;
        bba var8 = null;
        int var9 = 0;
        faa var10 = null;
        int stackIn_5_0 = 0;
        faa stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        faa stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        faa stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        int stackIn_12_2 = 0;
        int stackIn_16_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_18_1 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        faa stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        faa stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        int stackOut_11_2 = 0;
        faa stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        int stackOut_10_2 = 0;
        int stackOut_15_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_17_1 = 0;
        int stackOut_16_0 = 0;
        int stackOut_16_1 = 0;
        var9 = VoidHunters.field_G;
        if (param1 < -109) {
          L0: {
            var10 = param0;
            var3 = var10;
            var4 = ((una) this).field_b;
            if (var4 == null) {
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              break L0;
            } else {
              stackOut_3_0 = var4.length;
              stackIn_5_0 = stackOut_3_0;
              break L0;
            }
          }
          L1: {
            var5 = stackIn_5_0;
            var10.a(-632, var5, 8);
            if (-1 != (var5 ^ -1)) {
              var6 = var4;
              var7 = 0;
              L2: while (true) {
                if (var7 >= var6.length) {
                  break L1;
                } else {
                  L3: {
                    var8 = var6[var7];
                    stackOut_9_0 = (faa) var3;
                    stackOut_9_1 = -126;
                    stackIn_11_0 = stackOut_9_0;
                    stackIn_11_1 = stackOut_9_1;
                    stackIn_10_0 = stackOut_9_0;
                    stackIn_10_1 = stackOut_9_1;
                    if (var8 == null) {
                      stackOut_11_0 = (faa) (Object) stackIn_11_0;
                      stackOut_11_1 = stackIn_11_1;
                      stackOut_11_2 = 0;
                      stackIn_12_0 = stackOut_11_0;
                      stackIn_12_1 = stackOut_11_1;
                      stackIn_12_2 = stackOut_11_2;
                      break L3;
                    } else {
                      stackOut_10_0 = (faa) (Object) stackIn_10_0;
                      stackOut_10_1 = stackIn_10_1;
                      stackOut_10_2 = 1;
                      stackIn_12_0 = stackOut_10_0;
                      stackIn_12_1 = stackOut_10_1;
                      stackIn_12_2 = stackOut_10_2;
                      break L3;
                    }
                  }
                  if (vq.a(stackIn_12_0, stackIn_12_1, stackIn_12_2 != 0)) {
                    stb.a(2, 1, var10, (tv) (Object) var8);
                    var7++;
                    continue L2;
                  } else {
                    var7++;
                    continue L2;
                  }
                }
              }
            } else {
              break L1;
            }
          }
          L4: {
            param0.a(-632, ((una) this).field_g, 32);
            param0.a(-632, ((una) this).field_e, 32);
            stackOut_15_0 = 8;
            stackIn_17_0 = stackOut_15_0;
            stackIn_16_0 = stackOut_15_0;
            if (null != ((una) this).field_d) {
              stackOut_17_0 = stackIn_17_0;
              stackOut_17_1 = ((una) this).field_d.length;
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              break L4;
            } else {
              stackOut_16_0 = stackIn_16_0;
              stackOut_16_1 = 0;
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              break L4;
            }
          }
          pgb.a(stackIn_18_0, stackIn_18_1, -120, param0, ((una) this).field_d);
          return;
        } else {
          return;
        }
    }

    final void a(int param0, rsb param1) {
        int var4 = VoidHunters.field_G;
        qha.b(false);
        if (param0 != -2374) {
            ((una) this).field_e = 104;
        }
        if (null != ((una) this).field_b) {
            ((una) this).field_c = 0;
            while (((una) this).field_b.length > ((una) this).field_c) {
                ((una) this).field_b[((una) this).field_c].a(param1, -40);
                ((una) this).field_c = ((una) this).field_c + 1;
            }
            ((una) this).field_c = -1;
        }
    }

    final static int a(int param0, kb param1) {
        L0: {
          if (param0 == -29328) {
            break L0;
          } else {
            field_f = null;
            break L0;
          }
        }
        if (ep.field_o == param1) {
          return 6407;
        } else {
          if (param1 == qua.field_d) {
            return 6408;
          } else {
            if (nw.field_p == param1) {
              return 6406;
            } else {
              if (param1 != gka.field_p) {
                if (wh.field_o != param1) {
                  if (qf.field_o != param1) {
                    throw new IllegalStateException();
                  } else {
                    return 6145;
                  }
                } else {
                  return 6410;
                }
              } else {
                return 6409;
              }
            }
          }
        }
    }

    final void a(int param0, int param1, pe param2) {
        bba var4 = null;
        int var5 = 0;
        if (null != ((una) this).field_b) {
            if ((((una) this).field_g ^ -1) <= -1) {
                if (((una) this).field_b.length > ((una) this).field_g) {
                    var4 = ((una) this).field_b[((una) this).field_g];
                    var5 = var4.a((byte) 127, ((una) this).field_e, param1);
                    var4.a(var5 + -1, -61, param1, ((una) this).field_e, param2);
                }
            }
        }
        if (param0 != 1) {
            field_f = null;
        }
    }

    public final boolean a(byte param0, tv param1) {
        una var3 = null;
        int var4 = 0;
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          L1: {
            var4 = 26 % ((22 - param0) / 59);
            var3 = (una) (Object) param1;
            if (dn.a((tv[]) (Object) var3.field_b, false, 1, (tv[]) (Object) var3.field_b, 119)) {
              break L1;
            } else {
              if (var3.field_g != var3.field_g) {
                break L1;
              } else {
                if (var3.field_e != var3.field_e) {
                  break L1;
                } else {
                  if (!wpb.a(var3.field_d, var3.field_d, (byte) 28)) {
                    stackOut_6_0 = 0;
                    stackIn_7_0 = stackOut_6_0;
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
            }
          }
          stackOut_5_0 = 1;
          stackIn_7_0 = stackOut_5_0;
          break L0;
        }
        return stackIn_7_0 != 0;
    }

    public final void b(byte param0, tv param1) {
        una var3 = (una) (Object) param1;
        var3.field_b = (bba[]) (Object) sqb.a((tv[]) (Object) var3.field_b, (tv[]) (Object) var3.field_b, 1, vtb.field_o, false);
        var3.field_e = var3.field_e;
        if (param0 <= 54) {
            ((una) this).field_d = null;
        }
        var3.field_g = var3.field_g;
        var3.field_d = dob.a(var3.field_d, (byte) -59, var3.field_d);
    }

    final void a(rna param0, int param1) {
        if (((una) this).field_b != null) {
            if (0 <= ((una) this).field_g) {
                if (!(((una) this).field_b.length <= ((una) this).field_g)) {
                    ((una) this).field_b[((una) this).field_g].a(param0, true);
                }
            }
        }
        if (param1 != 0) {
            una.a((byte) 108);
        }
    }

    final void g(byte param0) {
        if (param0 != 82) {
            return;
        }
        if (((una) this).field_b != null) {
            ((una) this).field_g = (1 + ((una) this).field_g) % ((una) this).field_b.length;
            ((una) this).field_e = 0;
        }
    }

    public static void a(byte param0) {
        if (param0 != -98) {
            field_f = null;
        }
        field_a = null;
        field_f = null;
    }

    public final void a(tv param0, int param1) {
        una var5 = (una) (Object) param0;
        boolean discarded$0 = tja.a((ntb[]) (Object) var5.field_b, 1, (ntb[]) (Object) var5.field_b, false, 5547);
        int var4 = 0;
        if (!(!dn.a((tv[]) (Object) var5.field_b, false, 1, (tv[]) (Object) var5.field_b, 115))) {
            var4 = 1;
            System.out.println("MissionEvent[] events has changed. ");
        }
        if (!(var5.field_g == var5.field_g)) {
            System.out.println("int selected_event has changed. before=" + var5.field_g + ", now=" + var5.field_g);
            var4 = 1;
        }
        if (!(var5.field_e == var5.field_e)) {
            System.out.println("int selected_condition_or_action has changed. before=" + var5.field_e + ", now=" + var5.field_e);
            var4 = 1;
        }
        if (ikb.a(var5.field_d, var5.field_d, false)) {
            var4 = 1;
            System.out.println("int[] reserved_ids has changed. ");
        }
        if (param1 > -19) {
            return;
        }
        if (var4 != 0) {
            System.out.println("This instance of MissionControl has changed");
        }
    }

    final void c(int param0) {
        bba var2 = new bba();
        ((una) this).field_b = (bba[]) (Object) ija.a((Object) (Object) var2, (Object[]) (Object) ((una) this).field_b, param0, vtb.field_o);
        ((una) this).field_g = -1 + ((una) this).field_b.length;
    }

    final void c(byte param0) {
        if (param0 != 55) {
            Object var3 = null;
            boolean discarded$0 = ((una) this).a((byte) -25, (tv) null);
        }
        if ((((una) this).field_c ^ -1) > -1) {
            ((una) this).field_b = (bba[]) (Object) dt.a(vtb.field_o, ((una) this).field_g, 15667, (Object[]) (Object) ((una) this).field_b);
            if (null != ((una) this).field_b) {
                if (((una) this).field_b.length <= ((una) this).field_g) {
                    ((una) this).field_g = -1 + ((una) this).field_b.length;
                }
            }
            if (null != ((una) this).field_b) {
                // if_icmpne L165
            }
            ((una) this).field_g = 0;
        } else {
            ((una) this).field_b = (bba[]) (Object) dt.a(vtb.field_o, ((una) this).field_c, param0 ^ 15620, (Object[]) (Object) ((una) this).field_b);
            ((una) this).field_c = ((una) this).field_c - 1;
        }
    }

    final void a(boolean param0, pe param1, int param2) {
        bba var4 = null;
        int var5 = 0;
        if (null != ((una) this).field_b) {
            if (0 <= ((una) this).field_g) {
                if (((una) this).field_b.length > ((una) this).field_g) {
                    var4 = ((una) this).field_b[((una) this).field_g];
                    var5 = var4.a((byte) -82, ((una) this).field_e, param2);
                    var4.a(1 + var5, 118, param2, ((una) this).field_e, param1);
                }
            }
        }
        if (param0) {
            ((una) this).field_e = 56;
        }
    }

    private final void d(byte param0) {
        int var2 = 0;
        bba[] var3 = null;
        int var4 = 0;
        bba var5 = null;
        wm[] var6 = null;
        rna[] var7 = null;
        int var9 = 0;
        wm var10 = null;
        int var12 = 0;
        wm[] var13 = null;
        rna[] var14 = null;
        int var15 = 0;
        wm var16 = null;
        Object var17 = null;
        rna var18 = null;
        Object var19 = null;
        hd var20 = null;
        hd var21 = null;
        L0: {
          var17 = null;
          var19 = null;
          var12 = VoidHunters.field_G;
          var2 = 43 / ((-7 - param0) / 55);
          ((una) this).field_d = null;
          if (((una) this).field_b == null) {
            break L0;
          } else {
            var3 = ((una) this).field_b;
            var4 = 0;
            L1: while (true) {
              if (var3.length <= var4) {
                break L0;
              } else {
                L2: {
                  var5 = var3[var4];
                  var6 = var5.a((byte) -115);
                  var7 = var5.c((byte) -42);
                  if (var6 != null) {
                    var13 = var6;
                    var9 = 0;
                    L3: while (true) {
                      if (var9 >= var13.length) {
                        break L2;
                      } else {
                        var16 = var13[var9];
                        var10 = var16;
                        if (var10 instanceof hd) {
                          var20 = (hd) (Object) var16;
                          ((una) this).field_d = var20.a(121, ((una) this).field_d);
                          var9++;
                          continue L3;
                        } else {
                          var9++;
                          continue L3;
                        }
                      }
                    }
                  } else {
                    break L2;
                  }
                }
                if (var7 != null) {
                  var14 = var7;
                  var15 = 0;
                  var9 = var15;
                  L4: while (true) {
                    if (var14.length > var15) {
                      var18 = var14[var15];
                      var10 = (wm) (Object) var18;
                      if (var10 instanceof hd) {
                        var21 = (hd) (Object) var18;
                        ((una) this).field_d = var21.a(114, ((una) this).field_d);
                        var15++;
                        continue L4;
                      } else {
                        var15++;
                        continue L4;
                      }
                    } else {
                      var4++;
                      continue L1;
                    }
                  }
                } else {
                  var4++;
                  continue L1;
                }
              }
            }
          }
        }
    }

    final bba[] b(int param0) {
        if (param0 != 1) {
            Object var3 = null;
            ((una) this).a(23, (rsb) null);
        }
        return ((una) this).field_b;
    }

    public una() {
        ((una) this).field_c = -1;
    }

    final void a(int param0) {
        bba var2 = null;
        if (param0 != -828) {
            ((una) this).field_g = 33;
        }
        if (null != ((una) this).field_b) {
            if (((una) this).field_g >= 0) {
                if (((una) this).field_g < ((una) this).field_b.length) {
                    var2 = ((una) this).field_b[((una) this).field_g];
                    var2.a(((una) this).field_e, -1);
                }
            }
        }
    }

    final void a(int param0, bba param1) {
        ((una) this).field_b = (bba[]) (Object) ija.a((Object) (Object) param1, (Object[]) (Object) ((una) this).field_b, param0, vtb.field_o);
        this.d((byte) -111);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "Data server full or too many connections from your address. Please try again in a few minutes.";
        field_a = "Maximum ship size reached";
    }
}
