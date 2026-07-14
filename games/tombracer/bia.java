/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bia extends fqa {
    static u[] field_J;

    final fsa a(boolean param0, int param1, la param2) {
        fsa var10 = new fsa(param2, param0);
        var10.b((byte) -11, ((bia) this).field_k, ((bia) this).field_l);
        var10.h(3, param1 ^ param1);
        var10.a(1, (byte) -12, false);
        var10.e(false, param1 + 112);
        var10.b((byte) 17, false);
        var10.a((byte) -3, 6);
        var10.a((byte) 83, (nv) (Object) new eq(param2, param0));
        eia var5 = new eia(param2, param0);
        var5.a(true, 3, (byte) -122);
        var5.a(true, 4, -81);
        var5.a(10, 1, 5, param1 + -2032);
        ((bia) this).a((ut) (Object) var5, (byte) -118);
        jma var6 = var5.k((byte) -101);
        int var7 = 25;
        var6.a(var7, 0, 0, 0, 5, 0);
        var10.a((byte) 83, (nv) (Object) var5);
        mfa var8 = rm.field_a;
        cv var9 = (cv) (Object) var8.a(9, 123);
        var9.b(1, (byte) -112);
        var10.a((gr) (Object) var5, (byte) 124, (dg) (Object) var9);
        return var10;
    }

    final boolean z(int param0) {
        if (param0 != 0) {
            field_J = null;
            return false;
        }
        return false;
    }

    bia(la param0, int param1, kh param2, csa param3) {
        super(param0, param1, param2, param3);
    }

    final boolean s(int param0) {
        if (param0 != -15254) {
            return false;
        }
        return false;
    }

    final static int a(byte param0, int param1) {
        int var2 = 0;
        L0: {
          var2 = 0;
          if (param1 < 0) {
            var2 += 16;
            param1 = param1 >>> 16;
            break L0;
          } else {
            if (65536 > param1) {
              break L0;
            } else {
              var2 += 16;
              param1 = param1 >>> 16;
              if (param0 == 93) {
                L1: {
                  if (256 > param1) {
                    break L1;
                  } else {
                    var2 += 8;
                    param1 = param1 >>> 8;
                    break L1;
                  }
                }
                L2: {
                  if (param1 <= -17) {
                    var2 += 4;
                    param1 = param1 >>> 4;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  if (-5 > param1) {
                    break L3;
                  } else {
                    param1 = param1 >>> 2;
                    var2 += 2;
                    break L3;
                  }
                }
                L4: {
                  if (-2 < (param1 ^ -1)) {
                    break L4;
                  } else {
                    var2++;
                    param1 = param1 >>> 1;
                    break L4;
                  }
                }
                return var2 - -param1;
              } else {
                L5: {
                  int discarded$2 = bia.a((byte) 58, 116);
                  if (256 > param1) {
                    break L5;
                  } else {
                    var2 += 8;
                    param1 = param1 >>> 8;
                    break L5;
                  }
                }
                L6: {
                  if (param1 <= -17) {
                    var2 += 4;
                    param1 = param1 >>> 4;
                    break L6;
                  } else {
                    break L6;
                  }
                }
                L7: {
                  if (-5 > param1) {
                    break L7;
                  } else {
                    param1 = param1 >>> 2;
                    var2 += 2;
                    break L7;
                  }
                }
                L8: {
                  if (-2 < (param1 ^ -1)) {
                    break L8;
                  } else {
                    var2++;
                    param1 = param1 >>> 1;
                    break L8;
                  }
                }
                return var2 - -param1;
              }
            }
          }
        }
        if (param0 != 93) {
          L9: {
            int discarded$3 = bia.a((byte) 58, 116);
            if (256 > param1) {
              break L9;
            } else {
              var2 += 8;
              param1 = param1 >>> 8;
              break L9;
            }
          }
          L10: {
            if (param1 <= -17) {
              var2 += 4;
              param1 = param1 >>> 4;
              break L10;
            } else {
              break L10;
            }
          }
          L11: {
            if (-5 > param1) {
              break L11;
            } else {
              param1 = param1 >>> 2;
              var2 += 2;
              break L11;
            }
          }
          L12: {
            if (-2 < (param1 ^ -1)) {
              break L12;
            } else {
              var2++;
              param1 = param1 >>> 1;
              break L12;
            }
          }
          return var2 - -param1;
        } else {
          L13: {
            if (256 > param1) {
              break L13;
            } else {
              var2 += 8;
              param1 = param1 >>> 8;
              break L13;
            }
          }
          L14: {
            if (param1 <= -17) {
              var2 += 4;
              param1 = param1 >>> 4;
              break L14;
            } else {
              break L14;
            }
          }
          L15: {
            if (-5 > param1) {
              break L15;
            } else {
              param1 = param1 >>> 2;
              var2 += 2;
              break L15;
            }
          }
          L16: {
            if (-2 < (param1 ^ -1)) {
              break L16;
            } else {
              var2++;
              param1 = param1 >>> 1;
              break L16;
            }
          }
          return var2 - -param1;
        }
    }

    final boolean n(byte param0) {
        if (param0 != -122) {
            return true;
        }
        return false;
    }

    final void a(boolean param0, kh param1) {
        super.a(param0, param1);
    }

    final int t(int param0) {
        if (param0 != 8) {
            Object var3 = null;
            fsa discarded$0 = ((bia) this).a(false, -105, (la) null);
            return 7;
        }
        return 7;
    }

    final boolean v(int param0) {
        if (param0 != 555277520) {
            return false;
        }
        return false;
    }

    public static void C(int param0) {
        field_J = null;
        if (param0 != 4194304) {
            field_J = null;
        }
    }

    final boolean r(byte param0) {
        if (param0 != 93) {
            field_J = null;
            return true;
        }
        return true;
    }

    final void q(byte param0) {
        super.q(param0);
        ((bia) this).b(-117, 4194304, 4194304);
    }

    bia(la param0, int param1) {
        super(param0, param1);
    }

    final int B(int param0) {
        if (param0 != 31609) {
            return -38;
        }
        return 3;
    }

    static {
    }
}
