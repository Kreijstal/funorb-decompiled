/*
 * Decompiled by CFR-JS 0.4.0.
 */
class tja implements ntb {
    static String field_b;
    bha[] field_c;
    static soa field_a;

    public static void a(boolean param0) {
        if (param0) {
            tja.a(false);
        }
        field_b = null;
        field_a = null;
    }

    final int a(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        Object var5 = null;
        var4 = VoidHunters.field_G;
        if (null == ((tja) this).field_c) {
          return 0;
        } else {
          L0: {
            if (param0 == -5358) {
              break L0;
            } else {
              var5 = null;
              ((tja) this).b((faa) null, -13);
              break L0;
            }
          }
          var2 = 0;
          var3 = 0;
          L1: while (true) {
            if (((tja) this).field_c.length <= var3) {
              return var2;
            } else {
              if (((tja) this).field_c[var3].field_a) {
                var2++;
                var3++;
                continue L1;
              } else {
                var3++;
                continue L1;
              }
            }
          }
        }
    }

    public void b(faa param0, int param1) {
        faa var3 = null;
        bha[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        bha[] var7 = null;
        int var8 = 0;
        bha var9 = null;
        int var10 = 0;
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
        L0: {
          var10 = VoidHunters.field_G;
          if (param1 < -109) {
            break L0;
          } else {
            ((tja) this).field_c = null;
            break L0;
          }
        }
        L1: {
          var3 = param0;
          var4 = ((tja) this).field_c;
          var5 = hab.field_h;
          if (var4 == null) {
            stackOut_4_0 = 0;
            stackIn_5_0 = stackOut_4_0;
            break L1;
          } else {
            stackOut_3_0 = var4.length;
            stackIn_5_0 = stackOut_3_0;
            break L1;
          }
        }
        L2: {
          var6 = stackIn_5_0;
          var3.a(-632, var6, var5);
          if (var6 != 0) {
            var7 = var4;
            var8 = 0;
            L3: while (true) {
              if (var7.length <= var8) {
                break L2;
              } else {
                L4: {
                  var9 = var7[var8];
                  stackOut_9_0 = (faa) var3;
                  stackOut_9_1 = -110;
                  stackIn_11_0 = stackOut_9_0;
                  stackIn_11_1 = stackOut_9_1;
                  stackIn_10_0 = stackOut_9_0;
                  stackIn_10_1 = stackOut_9_1;
                  if (var9 == null) {
                    stackOut_11_0 = (faa) (Object) stackIn_11_0;
                    stackOut_11_1 = stackIn_11_1;
                    stackOut_11_2 = 0;
                    stackIn_12_0 = stackOut_11_0;
                    stackIn_12_1 = stackOut_11_1;
                    stackIn_12_2 = stackOut_11_2;
                    break L4;
                  } else {
                    stackOut_10_0 = (faa) (Object) stackIn_10_0;
                    stackOut_10_1 = stackIn_10_1;
                    stackOut_10_2 = 1;
                    stackIn_12_0 = stackOut_10_0;
                    stackIn_12_1 = stackOut_10_1;
                    stackIn_12_2 = stackOut_10_2;
                    break L4;
                  }
                }
                if (vq.a(stackIn_12_0, stackIn_12_1, stackIn_12_2 != 0)) {
                  stb.a(2, 1, var3, (tv) (Object) var9);
                  var8++;
                  continue L3;
                } else {
                  var8++;
                  continue L3;
                }
              }
            }
          } else {
            break L2;
          }
        }
    }

    final static boolean a(ntb[] param0, int param1, ntb[] param2, boolean param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        Object var10 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        L0: {
          var9 = VoidHunters.field_G;
          if (param2 == null) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = param2.length;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var5 = stackIn_3_0;
          if (param0 != null) {
            stackOut_5_0 = param0.length;
            stackIn_6_0 = stackOut_5_0;
            break L1;
          } else {
            stackOut_4_0 = 0;
            stackIn_6_0 = stackOut_4_0;
            break L1;
          }
        }
        var6 = stackIn_6_0;
        if (var6 == var5) {
          L2: {
            var7 = 0;
            if (param4 == 5547) {
              break L2;
            } else {
              var10 = null;
              boolean discarded$1 = tja.a((ntb[]) null, 96, (ntb[]) null, true, 70);
              break L2;
            }
          }
          var8 = 0;
          L3: while (true) {
            if (var8 >= var5) {
              return var7 != 0;
            } else {
              L4: {
                if (!param3) {
                  break L4;
                } else {
                  if (null == param2[var8]) {
                    break L4;
                  } else {
                    if (param0[var8] == null) {
                      break L4;
                    } else {
                      if (((Object) (Object) param2[var8]).getClass() != ((Object) (Object) param0[var8]).getClass()) {
                        te.a(param4 + 24239, (Object) (Object) param2[var8], (Object) (Object) param0[var8]);
                        var8++;
                        continue L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
              }
              L5: {
                L6: {
                  L7: {
                    if (param2[var8] != null) {
                      break L7;
                    } else {
                      if (param0[var8] != null) {
                        break L6;
                      } else {
                        break L7;
                      }
                    }
                  }
                  if (null == param2[var8]) {
                    break L5;
                  } else {
                    if (param0[var8] == null) {
                      break L6;
                    } else {
                      break L5;
                    }
                  }
                }
                te.a(29786, (Object) (Object) param2[var8], (Object) (Object) param0[var8]);
                break L5;
              }
              if (null != param2[var8]) {
                if (null != param0[var8]) {
                  param2[var8].a((tv) (Object) param0[var8], param4 ^ -5605);
                  if (param2[var8].a((byte) -78, (tv) (Object) param0[var8])) {
                    var7 = 1;
                    System.out.println("Element " + var8 + " has changed");
                    var8++;
                    continue L3;
                  } else {
                    var8++;
                    continue L3;
                  }
                } else {
                  var8++;
                  continue L3;
                }
              } else {
                var8++;
                continue L3;
              }
            }
          }
        } else {
          return true;
        }
    }

    public void a(tv param0, int param1) {
        if (param1 >= -19) {
            field_a = null;
        }
        tja var3 = (tja) (Object) param0;
        int var4 = 0;
        boolean discarded$20 = tja.a((ntb[]) (Object) var3.field_c, 1, (ntb[]) (Object) var3.field_c, false, 5547);
        if (!(!dn.a((tv[]) (Object) var3.field_c, false, 1, (tv[]) (Object) var3.field_c, 126))) {
            var4 = 1;
            iva.a(-6940, "CarouselPlayerInfo[] players has changed. ");
        }
        if (!(var4 == 0)) {
            iva.a(-6940, "This instance of CarouselSlot has changed");
        }
    }

    public boolean a(byte param0, tv param1) {
        int var3 = -83 % ((22 - param0) / 59);
        tja var4 = (tja) (Object) param1;
        return dn.a((tv[]) (Object) var4.field_c, false, 1, (tv[]) (Object) var4.field_c, -93);
    }

    void a(tja param0, int param1, int param2, boolean param3) {
        if (param2 != 1) {
            int discarded$0 = ((tja) this).a(-32);
        }
    }

    public void b(byte param0, tv param1) {
        tja var3 = (tja) (Object) param1;
        var3.field_c = (bha[]) (Object) sqb.a((tv[]) (Object) var3.field_c, (tv[]) (Object) var3.field_c, 1, uqa.field_q, false);
        if (param0 < 54) {
            ((tja) this).field_c = null;
        }
    }

    void a(boolean param0, int param1) {
        if (param0) {
            field_b = null;
        }
    }

    final static String a(int param0, int param1, int param2, byte[] param3) {
        char[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = VoidHunters.field_G;
        var4 = new char[param2];
        var5 = 0;
        var6 = param1;
        L0: while (true) {
          if (var6 >= param2) {
            return new String(var4, 0, var5);
          } else {
            var7 = 255 & param3[param0 + var6];
            if (var7 != 0) {
              L1: {
                if (var7 > -129) {
                  break L1;
                } else {
                  if (-161 > var7) {
                    L2: {
                      var8 = tu.field_c[-128 + var7];
                      if (var8 == 0) {
                        var8 = 63;
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                    var7 = var8;
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
              var5++;
              var4[var5] = (char)var7;
              var6++;
              continue L0;
            } else {
              var6++;
              continue L0;
            }
          }
        }
    }

    void a(int param0, int param1) {
        int var3 = 0;
        int var4 = VoidHunters.field_G;
        if (param1 <= 93) {
            field_a = null;
        }
        ((tja) this).field_c = (bha[]) (Object) uqa.field_q.a(11995, param0);
        for (var3 = 0; var3 < param0; var3++) {
            ((tja) this).field_c[var3] = (bha) (Object) uqa.field_q.a((byte) 15);
        }
    }

    public void a(faa param0, boolean param1) {
        if (param1) {
            return;
        }
        ((tja) this).field_c = (bha[]) (Object) kcb.a(hab.field_h, uqa.field_q, param0, 1, -80, (tv[]) (Object) ((tja) this).field_c);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Friends";
    }
}
