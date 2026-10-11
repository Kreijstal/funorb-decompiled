/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ei extends hp {
    dn field_F;
    private int field_I;
    static int field_K;
    boolean field_H;
    static int field_J;
    static int[] field_G;

    boolean e(byte param0) {
        this.field_I = this.i(35);
        if (param0 != 28) {
          this.field_F = (dn) null;
          if (this.field_I != 0) {
            return false;
          }
          if (!this.field_H) {
            return true;
          }
          return false;
        }
        if (this.field_I != 0) {
          return false;
        }
        if (!this.field_H) {
          return true;
        }
        return false;
    }

    private final int i(int param0) {
        if (param0 == 35) {
          return !this.field_H ? 0 : this.field_F.c(true) == this ? 256 : 0;
        }
        return -13;
    }

    final static void a(int param0, int param1, int[] param2, int param3, boolean param4, int param5, int param6, int param7) {
        try {
          int[] var9 = (int[]) null;
          rl.a(param0, param7, param1, param6, (int[]) null, param3, param4, (byte) 120, param2);
          if (param5 != -14237) {
            field_G = (int[]) null;
          }
        } catch (RuntimeException runtimeException) {
          throw sh.a((Throwable) ((Object) runtimeException), "ei.DA(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    final ga d(byte param0) {
        ga var2 = super.d(param0);
        if (var2 != null) {
          return var2;
        }
        return (ga) (this);
    }

    final void a(int param0, int param1, int param2, int param3) {
        if (this.field_I == 0) {
          return;
        }
        if (this.field_I >= 256) {
          if (param1 != 0) {
            return;
          }
          this.a(param2 + this.field_k, this.field_j + param0, (byte) -123);
          super.a(param0, param1, param2, param3 + 0);
          return;
        }
        if (null == f.field_e) {
          f.field_e = new vn(this.field_i, this.field_n);
          ki.a((byte) -86, f.field_e);
          bi.d();
          this.a(param3, 0, (byte) -121);
          super.a(-param0 - this.field_j, param1, -this.field_k - param2, 0);
          pa.a(param3 ^ -21189);
          f.field_e.e(this.field_k + param2, this.field_j + param0, this.field_I);
          return;
        }
        if (f.field_e.field_w < this.field_i) {
          f.field_e = new vn(this.field_i, this.field_n);
          ki.a((byte) -86, f.field_e);
          bi.d();
          this.a(param3, 0, (byte) -121);
          super.a(-param0 - this.field_j, param1, -this.field_k - param2, 0);
          pa.a(param3 ^ -21189);
          f.field_e.e(this.field_k + param2, this.field_j + param0, this.field_I);
          return;
        }
        if (f.field_e.field_t >= this.field_n) {
          ki.a((byte) -86, f.field_e);
          bi.d();
          this.a(param3, 0, (byte) -121);
          super.a(-param0 - this.field_j, param1, -this.field_k - param2, 0);
          pa.a(param3 ^ -21189);
          f.field_e.e(this.field_k + param2, this.field_j + param0, this.field_I);
          return;
        }
        f.field_e = new vn(this.field_i, this.field_n);
        ki.a((byte) -86, f.field_e);
        bi.d();
        this.a(param3, 0, (byte) -121);
        super.a(-param0 - this.field_j, param1, -this.field_k - param2, 0);
        pa.a(param3 ^ -21189);
        f.field_e.e(this.field_k + param2, this.field_j + param0, this.field_I);
    }

    ei(dn param0, int param1, int param2) {
        super(pk.field_N - param1 >> 1, -param2 + b.field_l >> 1, param1, param2, (io) null);
        try {
          this.field_H = false;
          this.field_I = 0;
          this.field_F = param0;
        } catch (RuntimeException runtimeException) {
          throw sh.a((Throwable) ((Object) runtimeException), "ei.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    abstract void a(int param0, int param1, byte param2);

    final void a(byte param0, int param1, int param2) {
        if (param0 >= 79) {
          this.a(-99, -param1 + b.field_l >> 1, pk.field_N - param2 >> 1, param2, param1);
          return;
        }
    }

    final static boolean h(int param0) {
        int var2;
        var2 = ZombieDawn.field_J;
        if (param0 < -110) {
          if (ul.field_f) {
            vj.field_q = vj.field_q + 1;
          }
          boolean decompiledFrameRemainder1 = true;
          if (ma.field_r != sm.field_a) {
            vj.field_o = vj.field_o - 40;
            if (0 < vj.field_o) {
              if (!nm.field_b) {
                return false;
              }
              if (sm.field_a != 0) {
                return false;
              }
              if (vk.field_c == 1 &&
                vf.field_f == 0) {
                return true;
              }
              if (vk.field_c == 5 &&
                vf.field_f == 0) {
                return true;
              }
              if (vk.field_c == 5 &&
                vf.field_f == 1) {
                return true;
              }
              if (5 == vk.field_c &&
                vf.field_f == 2) {
                return true;
              }
              if (vk.field_c != 5) {
                return false;
              }
              if (vf.field_f == 4) {
                return true;
              }
              return false;
            }
            vj.field_o = 0;
            ma.field_r = sm.field_a;
            jd.field_c = rc.field_w;
          } else {
            if (nm.field_b &&
              vj.field_o < 400) {
              vj.field_o = vj.field_o + 40;
              if (!(400 >= vj.field_o)) {
                vj.field_o = 400;
              }
              decompiledFrameRemainder1 = false;
            }
            else {
              if (!nm.field_b &&
                vj.field_o > 0) {
                vj.field_o = vj.field_o - 40;
                if (0 >= vj.field_o) {
                  vj.field_o = 0;
                }
              }
            }
          }
          if (!nm.field_b) {
            return false;
          }
          if (sm.field_a != 0) {
            return false;
          }
          if (vk.field_c == 1) {
            if (vf.field_f == 0) {
              return true;
            }
            if (vk.field_c == 5 &&
              vf.field_f == 0) {
              return true;
            }
            if (vk.field_c == 5 &&
              vf.field_f == 1) {
              return true;
            }
            if (5 == vk.field_c &&
              vf.field_f == 2) {
              return true;
            }
            if (vk.field_c != 5) {
              return false;
            }
            if (vf.field_f != 4) {
              return false;
            }
            return true;
          }
          if (vk.field_c == 5) {
            if (vf.field_f == 0) {
              return true;
            }
            if (vk.field_c == 5 &&
              vf.field_f == 1) {
              return true;
            }
            if (5 == vk.field_c &&
              vf.field_f == 2) {
              return true;
            }
            if (vk.field_c != 5) {
              return false;
            }
            if (vf.field_f == 4) {
              return true;
            }
            return false;
          }
          if (vk.field_c != 5) {
            if (5 != vk.field_c) {
              if (vk.field_c == 5 &&
                vf.field_f == 4) {
                return true;
              }
              return false;
            }
            if (vf.field_f != 2) {
              if (vk.field_c == 5 &&
                vf.field_f == 4) {
                return true;
              }
              return false;
            }
          } else {
            if (vf.field_f != 1) {
              if ((5 != vk.field_c ||
                vf.field_f != 2) &&
                (vk.field_c != 5 ||
                vf.field_f != 4)) {
                return false;
              }
              return true;
            }
          }
          return true;
        }
        field_K = 91;
        if (ul.field_f) {
          vj.field_q = vj.field_q + 1;
        }
        if (ma.field_r != sm.field_a) {
          vj.field_o = vj.field_o - 40;
          if (0 < vj.field_o) {
            if (nm.field_b &&
              sm.field_a == 0 && (vk.field_c == 1 &&
              vf.field_f == 0 ||
              vk.field_c == 5 &&
              vf.field_f == 0 ||
              vk.field_c == 5 &&
              vf.field_f == 1 ||
              5 == vk.field_c &&
              vf.field_f == 2 ||
              vk.field_c == 5 &&
              vf.field_f == 4)) {
              return true;
            }
            return false;
          }
          vj.field_o = 0;
          ma.field_r = sm.field_a;
          jd.field_c = rc.field_w;
        } else {
          if (!nm.field_b) {
            if (!nm.field_b &&
              vj.field_o > 0) {
              vj.field_o = vj.field_o - 40;
              if (0 >= vj.field_o) {
                vj.field_o = 0;
              }
            }
            boolean decompiledFrameRemainder0 = true;
            if (nm.field_b &&
              sm.field_a == 0) {
              if (vk.field_c != 1) {
                if (vk.field_c != 5) {
                  if (vk.field_c != 5) {
                    if ((5 != vk.field_c) &&
                      (decompiledFrameRemainder0 = (vk.field_c == 5)) &&
                      (decompiledFrameRemainder0 = (vf.field_f == 4))) {
                      return true;
                    }
                    if ((decompiledFrameRemainder0) &&
                      (vf.field_f != 2)) {
                      if (vk.field_c == 5 &&
                        vf.field_f == 4) {
                        return true;
                      }
                      return false;
                    }
                  } else {
                    if (vf.field_f != 1) {
                      if ((5 != vk.field_c ||
                        vf.field_f != 2) &&
                        (vk.field_c != 5 ||
                        vf.field_f != 4)) {
                        return false;
                      }
                      return true;
                    }
                  }
                } else {
                  if (vf.field_f != 0) {
                    if ((vk.field_c != 5 ||
                      vf.field_f != 1) &&
                      (5 != vk.field_c ||
                      vf.field_f != 2) &&
                      (vk.field_c != 5 ||
                      vf.field_f != 4)) {
                      return false;
                    }
                    return true;
                  }
                }
              } else {
                if (vf.field_f != 0) {
                  if ((vk.field_c != 5 ||
                    vf.field_f != 0) &&
                    (vk.field_c != 5 ||
                    vf.field_f != 1) &&
                    (5 != vk.field_c ||
                    vf.field_f != 2) &&
                    (vk.field_c != 5 ||
                    vf.field_f != 4)) {
                    return false;
                  }
                  return true;
                }
              }
              if (decompiledFrameRemainder0) {
                return true;
              }
            }
            return false;
          }
          if (vj.field_o < 400) {
            vj.field_o = vj.field_o + 40;
            if (400 < vj.field_o) {
              vj.field_o = 400;
            }
          } else {
            if (!nm.field_b &&
              vj.field_o > 0) {
              vj.field_o = vj.field_o - 40;
              if (0 >= vj.field_o) {
                vj.field_o = 0;
              }
            }
          }
        }
        if (!nm.field_b) {
          return false;
        }
        if (sm.field_a != 0) {
          return false;
        }
        if (vk.field_c != 1) {
          if (vk.field_c != 5) {
            if (vk.field_c != 5) {
              if (5 != vk.field_c) {
                if (vk.field_c == 5 &&
                  vf.field_f == 4) {
                  return true;
                }
                return false;
              }
              if (vf.field_f != 2) {
                if (vk.field_c == 5 &&
                  vf.field_f == 4) {
                  return true;
                }
                return false;
              }
            } else {
              if (vf.field_f != 1) {
                if (5 == vk.field_c &&
                  vf.field_f == 2) {
                  return true;
                }
                if (vk.field_c == 5 &&
                  vf.field_f == 4) {
                  return true;
                }
                return false;
              }
            }
          } else {
            if (vf.field_f != 0) {
              if (vk.field_c == 5 &&
                vf.field_f == 1) {
                return true;
              }
              if (5 == vk.field_c &&
                vf.field_f == 2) {
                return true;
              }
              if (vk.field_c == 5 &&
                vf.field_f == 4) {
                return true;
              }
              return false;
            }
          }
        } else {
          if (vf.field_f != 0) {
            if ((vk.field_c != 5 ||
              vf.field_f != 0) &&
              (vk.field_c != 5 ||
              vf.field_f != 1) &&
              (5 != vk.field_c ||
              vf.field_f != 2)) {
              if (vk.field_c == 5 &&
                vf.field_f == 4) {
                return true;
              }
              return false;
            }
            return true;
          }
        }
        return true;
    }

    boolean j(int param0) {
        boolean stackIn_12_0 = false;
        boolean stackIn_25_0 = false;
        int var2;
        int var3;
        int var2Lifetime1;
        int var3Lifetime1;
        if (param0 != 2634) {
          this.a((byte) -43, -14, -18);
          var2 = this.i(35);
          var3 = -this.field_I + var2;
          if (var3 > 0) {
            this.field_I = this.field_I + (-1 + (var3 + 8)) / 8;
          }
          if (0 > var3) {
            this.field_I = this.field_I + (-16 + var3 + 1) / 16;
          }
          if (0 != this.field_I) {
            return false;
          }
          if (0 != var2) {
            return false;
          }
          stackIn_25_0 = !(this.field_H);
          return stackIn_25_0;
        }
        var2Lifetime1 = this.i(35);
        var3Lifetime1 = -this.field_I + var2Lifetime1;
        if (var3Lifetime1 > 0) {
          this.field_I = this.field_I + (-1 + (var3Lifetime1 + 8)) / 8;
        }
        if (0 > var3Lifetime1) {
          this.field_I = this.field_I + (-16 + var3Lifetime1 + 1) / 16;
        }
        stackIn_12_0 = (0 == this.field_I) && (0 == var2Lifetime1) && (!this.field_H);
        return stackIn_12_0;
    }

    public static void a(int param0) {
        field_G = null;
        if (param0 < 99) {
          field_G = (int[]) null;
        }
    }

    static {
        field_K = 0;
        field_G = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    }
}
