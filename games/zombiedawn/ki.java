/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ki extends pn {
    private int field_ab;
    static String field_V;
    private int field_cb;
    private ga field_W;
    private wl field_U;
    private mh field_Y;
    private int field_T;
    private int field_db;
    private int field_Z;
    static String field_bb;
    static int[] field_X;

    final boolean e(byte param0) {
        ((ki) this).f((byte) -48);
        if (param0 != 28) {
            ((ki) this).field_U = null;
        }
        return super.e((byte) 28);
    }

    final void l(int param0) {
        if (((ki) this).field_U == j.field_h) {
            return;
        }
        ((ki) this).field_U = dn.field_I;
        ((ki) this).field_cb = 0;
        this.a(((ki) this).field_W, (byte) -98);
        ((ki) this).field_Y.field_H = 0;
        ((ki) this).field_W = null;
        if (param0 != -7476) {
            ((ki) this).field_cb = -54;
        }
    }

    void b(int param0, ga param1) {
        if (param0 != 20) {
            field_bb = null;
        }
        ((ki) this).field_W = param1;
        if (sj.field_c == ((ki) this).field_U) {
            ((ki) this).a(false, ((ki) this).field_W.field_n + 12 - -((ki) this).field_db, 12 + ((ki) this).field_W.field_i, ((ki) this).field_ab);
            ((ki) this).field_cb = 0;
        } else {
            if (!(((ki) this).field_U == j.field_h)) {
                ((ki) this).field_U = j.field_h;
                ((ki) this).field_cb = 0;
            }
        }
    }

    final static boolean a(int param0, CharSequence param1, int param2, boolean param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        L0: {
          var11 = ZombieDawn.field_J;
          if (param0 < 2) {
            break L0;
          } else {
            if (param0 > 36) {
              break L0;
            } else {
              var4 = 0;
              var5 = 0;
              var6 = 0;
              var7 = param1.length();
              var8 = 0;
              L1: while (true) {
                if (var8 >= var7) {
                  L2: {
                    if (param2 == -123) {
                      break L2;
                    } else {
                      ki.g((byte) -94);
                      break L2;
                    }
                  }
                  return var5 != 0;
                } else {
                  L3: {
                    var9 = param1.charAt(var8);
                    if (var8 == 0) {
                      if (45 != var9) {
                        if (43 != var9) {
                          break L3;
                        } else {
                          if (!param3) {
                            break L3;
                          } else {
                            var8++;
                            continue L1;
                          }
                        }
                      } else {
                        var4 = 1;
                        var8++;
                        continue L1;
                      }
                    } else {
                      break L3;
                    }
                  }
                  L4: {
                    L5: {
                      if (var9 < 48) {
                        break L5;
                      } else {
                        if (57 >= var9) {
                          var9 -= 48;
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    L6: {
                      if (var9 < 65) {
                        break L6;
                      } else {
                        if (var9 > 90) {
                          break L6;
                        } else {
                          var9 -= 55;
                          break L4;
                        }
                      }
                    }
                    L7: {
                      if (var9 < 97) {
                        break L7;
                      } else {
                        if (var9 > 122) {
                          break L7;
                        } else {
                          var9 -= 87;
                          break L4;
                        }
                      }
                    }
                    return false;
                  }
                  if (param0 <= var9) {
                    return false;
                  } else {
                    L8: {
                      if (var4 != 0) {
                        var9 = -var9;
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                    var10 = var6 * param0 + var9;
                    if (var10 / param0 != var6) {
                      return false;
                    } else {
                      var6 = var10;
                      var5 = 1;
                      var8++;
                      continue L1;
                    }
                  }
                }
              }
            }
          }
        }
        throw new IllegalArgumentException("" + param0);
    }

    private final void a(ga param0, byte param1) {
        if (((ki) this).field_Y != null) {
            ((ki) this).field_Y.b(-27598);
        }
        int var3 = -45 / ((-21 - param1) / 52);
        if (param0 == null) {
            ((ki) this).field_Y = new mh();
        } else {
            param0.a(-73, 6 + ((ki) this).field_db, 6, param0.field_i, param0.field_n);
            ((ki) this).field_Y = new mh(param0);
        }
        ((ki) this).a((ga) (Object) ((ki) this).field_Y, 10);
        ((ki) this).field_W = null;
    }

    boolean a(int param0, int param1, ga param2, char param3) {
        if (!(!super.a(-122, param1, param2, param3))) {
            return true;
        }
        int var5 = 8 % ((param0 - -83) / 32);
        if (((ki) this).field_Y != null) {
            if (98 == param1) {
                boolean discarded$0 = ((ki) this).field_Y.a((byte) 121, param2);
            }
            if (99 == param1) {
                boolean discarded$1 = ((ki) this).field_Y.a((byte) 82, param2);
                return false;
            }
        }
        return false;
    }

    final static void a(byte param0, vn param1) {
        hk.i(1584);
        if (param0 >= -76) {
            return;
        }
        bi.a(param1.field_z, param1.field_r, param1.field_q);
    }

    final void f(byte param0) {
        if (!(((ki) this).field_U == null)) {
            if (!(((ki) this).field_U == dn.field_I)) {
                ((ki) this).a((byte) 105, ((ki) this).field_W.field_n + (12 + ((ki) this).field_db), ((ki) this).field_W.field_i + 12);
                this.a(((ki) this).field_W, (byte) 94);
            }
            ((ki) this).field_U = null;
            ((ki) this).field_Y.field_H = 256;
        }
        int var2 = -96 % ((param0 - 22) / 59);
        super.f((byte) -58);
    }

    ki(dn param0, ga param1, int param2, int param3, int param4) {
        super(param0, param1.field_i + 12, 12 + (param2 + param1.field_n));
        ((ki) this).field_ab = param4;
        ((ki) this).field_db = param2;
        ((ki) this).field_T = param3;
        ((ki) this).field_Z = param3;
        this.a(param1, (byte) -104);
    }

    boolean j(int param0) {
        int var3 = 0;
        L0: {
          var3 = ZombieDawn.field_J;
          if (((ki) this).field_U == null) {
            break L0;
          } else {
            if (((ki) this).field_U == j.field_h) {
              int fieldTemp$38 = ((ki) this).field_cb + 1;
              ((ki) this).field_cb = ((ki) this).field_cb + 1;
              if (((ki) this).field_Z != fieldTemp$38) {
                ((ki) this).field_Y.field_H = -((((ki) this).field_cb << -937865176) / ((ki) this).field_Z) + 256;
                break L0;
              } else {
                ((ki) this).field_U = sj.field_c;
                ((ki) this).a(false, ((ki) this).field_W.field_n + 12 - -((ki) this).field_db, 12 + ((ki) this).field_W.field_i, ((ki) this).field_ab);
                ((ki) this).field_cb = 0;
                ((ki) this).field_Y.field_H = 0;
                break L0;
              }
            } else {
              if (dn.field_I != ((ki) this).field_U) {
                break L0;
              } else {
                int fieldTemp$39 = ((ki) this).field_cb + 1;
                ((ki) this).field_cb = ((ki) this).field_cb + 1;
                if (((ki) this).field_T == fieldTemp$39) {
                  ((ki) this).field_Y.field_H = 256;
                  ((ki) this).field_U = null;
                  break L0;
                } else {
                  ((ki) this).field_Y.field_H = (((ki) this).field_cb << 1247311752) / ((ki) this).field_T;
                  break L0;
                }
              }
            }
          }
        }
        if (param0 == 2634) {
          return super.j(2634);
        } else {
          return true;
        }
    }

    public static void g(byte param0) {
        if (param0 < 41) {
            Object var2 = null;
            ki.a((byte) 10, (vn) null);
        }
        field_V = null;
        field_bb = null;
        field_X = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_bb = "Cancel";
        field_X = new int[]{-1, 160, 342, 435};
    }
}
