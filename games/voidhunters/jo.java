/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jo implements ntb, ofa, iu {
    int[] field_d;
    static java.security.SecureRandom field_a;
    int field_h;
    int field_f;
    static String field_g;
    int field_b;
    private int field_c;
    static int field_e;

    final int a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7_int = 0;
        int[] var7 = null;
        int var8 = 0;
        L0: {
          var8 = VoidHunters.field_G;
          var4 = 0;
          if (param0 <= -9) {
            break L0;
          } else {
            boolean discarded$2 = ((jo) this).c(105, -29);
            break L0;
          }
        }
        L1: while (true) {
          if (((jo) this).field_d.length <= var4) {
            return param2;
          } else {
            var5 = ((jo) this).field_d[var4];
            if (param1 != var5) {
              var6 = 0;
              var7_int = 0;
              L2: while (true) {
                L3: {
                  if (var7_int >= param2) {
                    break L3;
                  } else {
                    if (var5 == ada.field_a[var7_int]) {
                      var6 = 1;
                      break L3;
                    } else {
                      var7_int++;
                      continue L2;
                    }
                  }
                }
                if (var6 == 0) {
                  L4: {
                    if (ada.field_a.length != param2) {
                      break L4;
                    } else {
                      var7 = new int[10 + ada.field_a.length];
                      cua.a(ada.field_a, 0, var7, 0, ada.field_a.length);
                      ada.field_a = var7;
                      break L4;
                    }
                  }
                  param2++;
                  ada.field_a[param2] = var5;
                  var4++;
                  continue L1;
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

    public static void a(boolean param0) {
        field_g = null;
        if (!param0) {
            jo.a(true);
        }
        field_a = null;
    }

    final boolean c(int param0, int param1) {
        ((jo) this).field_d = wm.a(param0, (byte) 116, ((jo) this).field_d);
        this.a((byte) -119);
        if (null == ((jo) this).field_d) {
            return true;
        }
        if (param1 != 8) {
            return true;
        }
        return false;
    }

    public final void b(faa param0, int param1) {
        pgb.a(8, null != ((jo) this).field_d ? ((jo) this).field_d.length : 0, 73, param0, ((jo) this).field_d);
        param0.a(-632, ((jo) this).field_h, 8);
        if (param1 > -109) {
            ((jo) this).field_b = -39;
        }
        param0.a(-632, ((jo) this).field_b, 8);
        param0.a(-632, ((jo) this).field_f, 2);
    }

    public final int a(Object param0, boolean param1) {
        jo var3 = null;
        if (param1) {
          var3 = (jo) param0;
          if (var3.field_h > var3.field_h) {
            return -1;
          } else {
            if (var3.field_h < var3.field_h) {
              return 1;
            } else {
              if (var3.field_b >= var3.field_b) {
                if (var3.field_b >= var3.field_b) {
                  if (var3.field_f < var3.field_f) {
                    return -1;
                  } else {
                    if (var3.field_f <= var3.field_f) {
                      return 0;
                    } else {
                      return 1;
                    }
                  }
                } else {
                  return 1;
                }
              } else {
                return -1;
              }
            }
          }
        } else {
          return 114;
        }
    }

    public final void a(tv param0, int param1) {
        if (param1 >= -19) {
            ((jo) this).field_d = null;
        }
        jo var5 = (jo) (Object) param0;
        int var4 = 0;
        if (ikb.a(var5.field_d, var5.field_d, false)) {
            var4 = 1;
            System.out.println("int[] ids has changed. ");
        }
        if (!(var5.field_h == var5.field_h)) {
            System.out.println("int gridx has changed. before=" + var5.field_h + ", now=" + var5.field_h);
            var4 = 1;
        }
        if (!(var5.field_b == var5.field_b)) {
            var4 = 1;
            System.out.println("int gridy has changed. before=" + var5.field_b + ", now=" + var5.field_b);
        }
        if (var5.field_f != var5.field_f) {
            var4 = 1;
            System.out.println("int type has changed. before=" + var5.field_f + ", now=" + var5.field_f);
        }
        if (var4 != 0) {
            System.out.println("This instance of PartitionZone has changed");
        }
    }

    public final void b(byte param0, tv param1) {
        jo var3 = (jo) (Object) param1;
        if (var3.field_c == var3.field_c) {
            return;
        }
        var3.field_c = var3.field_c;
        var3.field_d = dob.a(var3.field_d, (byte) -55, var3.field_d);
        var3.field_b = var3.field_b;
        var3.field_h = var3.field_h;
        if (param0 <= 54) {
            Object var4 = null;
            ((jo) this).b((faa) null, 31);
        }
        var3.field_f = var3.field_f;
    }

    final void b(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        Object var5 = null;
        var4 = VoidHunters.field_G;
        var3 = 0;
        L0: while (true) {
          if (var3 >= ((jo) this).field_d.length) {
            L1: {
              if (param0 == 11964) {
                break L1;
              } else {
                var5 = null;
                ((jo) this).b((faa) null, 55);
                break L1;
              }
            }
            return;
          } else {
            if (param1 < ((jo) this).field_d[var3]) {
              ((jo) this).field_d[var3] = ((jo) this).field_d[var3] - 1;
              this.a((byte) -82);
              var3++;
              continue L0;
            } else {
              var3++;
              continue L0;
            }
          }
        }
    }

    public final void a(faa param0, boolean param1) {
        if (param1) {
            ((jo) this).field_d = null;
        }
        ((jo) this).field_d = wkb.a((byte) 37, ((jo) this).field_d, param0, 8);
        ((jo) this).field_h = uwa.a(8, param0, (byte) 20);
        ((jo) this).field_b = uwa.a(8, param0, (byte) 20);
        ((jo) this).field_f = param0.i(0, 2);
    }

    public final boolean a(byte param0, tv param1) {
        jo var3 = null;
        int var4 = 0;
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          L1: {
            var3 = (jo) (Object) param1;
            var4 = 11 % ((22 - param0) / 59);
            if (wpb.a(var3.field_d, var3.field_d, (byte) 28)) {
              break L1;
            } else {
              if (var3.field_h != var3.field_h) {
                break L1;
              } else {
                if (var3.field_b != var3.field_b) {
                  break L1;
                } else {
                  if (var3.field_f == var3.field_f) {
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

    private final void a(byte param0) {
        if (param0 >= -57) {
            ((jo) this).field_c = -117;
        }
        kgb.field_a = kgb.field_a + 1;
        ((jo) this).field_c = kgb.field_a;
    }

    final void a(int param0, int param1) {
        if (param1 != -13251) {
            int discarded$0 = ((jo) this).a(-116, 102, -62);
        }
        ((jo) this).field_d = nra.a(true, ((jo) this).field_d, param0, param1 + 42100, true);
        this.a((byte) -77);
    }

    jo() {
        ((jo) this).field_c = 0;
        this.a((byte) -92);
    }

    jo(int param0, int param1, int param2) {
        ((jo) this).field_c = 0;
        this.a((byte) -92);
        ((jo) this).field_f = param2;
        ((jo) this).field_b = param1;
        ((jo) this).field_h = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "Blueprint Showdown";
        field_e = 500;
    }
}
