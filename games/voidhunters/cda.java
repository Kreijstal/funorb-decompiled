/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cda implements ntb, ofa {
    private int field_b;
    private jo[] field_a;

    public final void a(tv param0, int param1) {
        cda var3 = (cda) (Object) param0;
        boolean discarded$10 = tja.a((ntb[]) (Object) var3.field_a, 1, (ntb[]) (Object) var3.field_a, false, 5547);
        if (param1 > -19) {
            ((cda) this).field_a = null;
        }
        int var4 = 0;
        if (dn.a((tv[]) (Object) var3.field_a, false, 1, (tv[]) (Object) var3.field_a, -57)) {
            var4 = 1;
            System.out.println("PartitionZone[] zones has changed. ");
        }
        if (!(var4 == 0)) {
            System.out.println("This instance of PartitionZoneList has changed");
        }
    }

    final void a(int param0, int param1, byte param2) {
        int var4 = 0;
        int var5 = 0;
        L0: {
          var5 = VoidHunters.field_G;
          if (null != ((cda) this).field_a) {
            var4 = 0;
            L1: while (true) {
              if (var4 >= ((cda) this).field_a.length) {
                break L0;
              } else {
                if (param1 == ((cda) this).field_a[var4].field_f) {
                  ((cda) this).field_a[var4].b(11964, param0);
                  ((cda) this).a(-104);
                  var4++;
                  continue L1;
                } else {
                  var4++;
                  continue L1;
                }
              }
            }
          } else {
            break L0;
          }
        }
        L2: {
          if (param2 == -21) {
            break L2;
          } else {
            ((cda) this).field_a = null;
            break L2;
          }
        }
    }

    final jo a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        var6 = VoidHunters.field_G;
        var5 = 0;
        L0: while (true) {
          if (var5 >= ((cda) this).field_a.length) {
            if (param0 < 98) {
              ((cda) this).a(83);
              return null;
            } else {
              return null;
            }
          } else {
            if (param2 == ((cda) this).field_a[var5].field_h) {
              if (param3 == ((cda) this).field_a[var5].field_b) {
                if (((cda) this).field_a[var5].field_f == param1) {
                  return ((cda) this).field_a[var5];
                } else {
                  var5++;
                  continue L0;
                }
              } else {
                var5++;
                continue L0;
              }
            } else {
              var5++;
              continue L0;
            }
          }
        }
    }

    public final void a(faa param0, boolean param1) {
        ((cda) this).field_a = (jo[]) (Object) kcb.a(8, dp.field_b, param0, 1, -76, (tv[]) (Object) ((cda) this).field_a);
        if (param1) {
            ((cda) this).a(-8);
        }
    }

    public final void b(byte param0, tv param1) {
        if (param0 < 54) {
            ((cda) this).field_b = -73;
        }
        cda var3 = (cda) (Object) param1;
        if (var3.field_b == var3.field_b) {
            return;
        }
        var3.field_b = var3.field_b;
        var3.field_a = (jo[]) (Object) sqb.a((tv[]) (Object) var3.field_a, (tv[]) (Object) var3.field_a, 1, dp.field_b, false);
    }

    public final void b(faa param0, int param1) {
        faa var3 = null;
        jo[] var4 = null;
        int var5 = 0;
        jo[] var6 = null;
        int var7 = 0;
        jo var8 = null;
        int var9 = 0;
        int stackIn_5_0 = 0;
        faa stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        faa stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        faa stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        int stackIn_12_2 = 0;
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
        var9 = VoidHunters.field_G;
        var3 = param0;
        if (param1 <= -109) {
          L0: {
            var4 = ((cda) this).field_a;
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
            var3.a(-632, var5, 8);
            if (var5 != 0) {
              var6 = var4;
              var7 = 0;
              L2: while (true) {
                if (var7 >= var6.length) {
                  break L1;
                } else {
                  L3: {
                    var8 = var6[var7];
                    stackOut_9_0 = (faa) var3;
                    stackOut_9_1 = 46;
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
                    stb.a(2, 1, var3, (tv) (Object) var8);
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
          return;
        } else {
          return;
        }
    }

    final static void a(int param0, String param1, String param2) {
        if (param0 > -11) {
            return;
        }
        kma.a(param1, false, -17833, param2);
    }

    public final boolean a(byte param0, tv param1) {
        int var4 = 107 / ((22 - param0) / 59);
        cda var3 = (cda) (Object) param1;
        return dn.a((tv[]) (Object) var3.field_a, false, 1, (tv[]) (Object) var3.field_a, 3);
    }

    final jo a(byte param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        jo var7 = null;
        L0: {
          var6 = VoidHunters.field_G;
          if (null == ((cda) this).field_a) {
            break L0;
          } else {
            var5 = 0;
            L1: while (true) {
              if (var5 >= ((cda) this).field_a.length) {
                break L0;
              } else {
                if (((cda) this).field_a[var5].field_h == param1) {
                  if (param2 == ((cda) this).field_a[var5].field_b) {
                    if (param3 == ((cda) this).field_a[var5].field_f) {
                      return ((cda) this).field_a[var5];
                    } else {
                      var5++;
                      continue L1;
                    }
                  } else {
                    var5++;
                    continue L1;
                  }
                } else {
                  var5++;
                  continue L1;
                }
              }
            }
          }
        }
        L2: {
          var7 = new jo(param1, param2, param3);
          if (param0 > 118) {
            break L2;
          } else {
            ((cda) this).field_b = -59;
            break L2;
          }
        }
        ((cda) this).field_a = (jo[]) (Object) qlb.a((Object[]) (Object) ((cda) this).field_a, (Object) (Object) var7, dp.field_b, true, true, 1);
        ((cda) this).a(125);
        return var7;
    }

    final void a(int param0) {
        ggb.field_a = ggb.field_a + 1;
        ((cda) this).field_b = ggb.field_a;
        int var2 = -124 % ((-66 - param0) / 32);
    }

    cda() {
        ((cda) this).field_b = 0;
        ((cda) this).a(-33);
    }

    final boolean b(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = VoidHunters.field_G;
          if (param1 == -6775) {
            break L0;
          } else {
            ((cda) this).field_a = null;
            break L0;
          }
        }
        var5 = -1;
        var6 = 0;
        L1: while (true) {
          L2: {
            if (((cda) this).field_a.length <= var6) {
              break L2;
            } else {
              if (param3 == ((cda) this).field_a[var6].field_h) {
                if (((cda) this).field_a[var6].field_b == param2) {
                  if (((cda) this).field_a[var6].field_f == param0) {
                    var5 = var6;
                    break L2;
                  } else {
                    var6++;
                    continue L1;
                  }
                } else {
                  var6++;
                  continue L1;
                }
              } else {
                var6++;
                continue L1;
              }
            }
          }
          if (var5 == -1) {
            return false;
          } else {
            L3: {
              ((cda) this).field_a = (jo[]) (Object) dt.a(dp.field_b, var5, 15667, (Object[]) (Object) ((cda) this).field_a);
              ((cda) this).a(-100);
              if (((cda) this).field_a == null) {
                break L3;
              } else {
                if (-1 == (((cda) this).field_a.length ^ -1)) {
                  break L3;
                } else {
                  return false;
                }
              }
            }
            return true;
          }
        }
    }

    static {
    }
}
