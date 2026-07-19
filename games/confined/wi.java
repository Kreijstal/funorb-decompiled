/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wi {
    private int field_t;
    static int field_c;
    private int field_j;
    static String field_q;
    static String field_b;
    private int field_k;
    private int field_g;
    private int field_s;
    private boolean field_n;
    private int field_u;
    private int field_a;
    private float field_d;
    private int field_f;
    private int field_m;
    private int field_r;
    private int field_l;
    private int field_i;
    private bb field_e;
    private int field_o;
    private int field_p;
    private int field_h;

    final void a(int param0, byte param1, int param2) {
        this.field_u = param2;
        this.field_h = param0;
        if (param1 <= 26) {
            this.d((byte) 84);
        }
    }

    final static String c(int param0) {
        int var1 = -102 % ((-82 - param0) / 41);
        if (oe.field_Q == wh.field_fb) {
            return kc.field_n;
        }
        return hm.field_gb;
    }

    final static void a(int param0, int param1) {
        rk var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        sf var4 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = Confined.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 < -39) {
                break L1;
              } else {
                wi.a(41, 111);
                break L1;
              }
            }
            var4 = (sf) ((Object) sm.field_y.a(-128));
            L2: while (true) {
              if (var4 == null) {
                var2 = ra.field_d.a(107);
                L3: while (true) {
                  if (var2 == null) {
                    break L0;
                  } else {
                    fm.a(-87, param0);
                    var2 = ra.field_d.d(2123);
                    continue L3;
                  }
                }
              } else {
                nh.a(var4, 0, param0);
                var4 = (sf) ((Object) sm.field_y.d(2123));
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw sd.a((Throwable) ((Object) var2_ref), "wi.H(" + param0 + ',' + param1 + ')');
        }
    }

    public static void b(byte param0) {
        field_b = null;
        field_q = null;
        if (param0 != 12) {
            field_b = (String) null;
        }
    }

    final void d(byte param0) {
        int fieldTemp$1 = 0;
        if (dn.field_d != null) {
          return;
        } else {
          L0: {
            if ((sg.field_x ^ -1) < -1) {
              break L0;
            } else {
              this.field_n = false;
              break L0;
            }
          }
          if (!this.field_n) {
            L1: {
              if (this.field_h <= wm.field_ab) {
                if (-1 <= (this.field_h ^ -1)) {
                  break L1;
                } else {
                  ei.field_kb = 0;
                  break L1;
                }
              } else {
                ei.field_kb = (-wm.field_ab + this.field_h) / 2;
                break L1;
              }
            }
            L2: {
              if (wm.field_ab != this.field_t) {
                this.field_e.a(this.field_t, this.field_r, 1099);
                break L2;
              } else {
                if (im.field_b == this.field_r) {
                  return;
                } else {
                  this.field_e.a(this.field_t, this.field_r, 1099);
                  break L2;
                }
              }
            }
            return;
          } else {
            fieldTemp$1 = this.field_l - 1;
            this.field_l = this.field_l - 1;
            if ((fieldTemp$1 ^ -1) < -1) {
              return;
            } else {
              this.field_l = this.field_i;
              if (pi.field_H < this.field_m) {
                this.field_n = false;
                return;
              } else {
                L3: {
                  this.c((byte) -128);
                  if (param0 == -44) {
                    break L3;
                  } else {
                    this.field_p = 19;
                    break L3;
                  }
                }
                return;
              }
            }
          }
        }
    }

    final boolean b(int param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 < -112) {
            break L0;
          } else {
            field_q = (String) null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (this.field_m > pi.field_H) {
              break L2;
            } else {
              if (0 >= sg.field_x) {
                break L2;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    final static boolean a(boolean param0) {
        dg var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        dg var4 = null;
        int stackIn_4_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_22_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_15_0 = 0;
        var3 = Confined.field_J ? 1 : 0;
        try {
          L0: {
            var4 = (dg) ((Object) af.field_cb.a(-115));
            var1 = var4;
            if (var1 == null) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var2 = 0;
              L1: while (true) {
                if (var2 >= var1.field_r) {
                  if (!param0) {
                    stackOut_21_0 = 1;
                    stackIn_22_0 = stackOut_21_0;
                    decompiledRegionSelector0 = 4;
                    break L0;
                  } else {
                    stackOut_19_0 = 0;
                    stackIn_20_0 = stackOut_19_0;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                } else {
                  L2: {
                    if (var4.field_m[var2] != null) {
                      if (var4.field_m[var2].field_g != 0) {
                        break L2;
                      } else {
                        stackOut_10_0 = 0;
                        stackIn_11_0 = stackOut_10_0;
                        decompiledRegionSelector0 = 1;
                        break L0;
                      }
                    } else {
                      break L2;
                    }
                  }
                  L3: {
                    if (var4.field_q[var2] != null) {
                      if (-1 != (var4.field_q[var2].field_g ^ -1)) {
                        break L3;
                      } else {
                        stackOut_15_0 = 0;
                        stackIn_16_0 = stackOut_15_0;
                        decompiledRegionSelector0 = 2;
                        break L0;
                      }
                    } else {
                      break L3;
                    }
                  }
                  var2++;
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw sd.a((Throwable) ((Object) var1_ref), "wi.F(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_11_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_16_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_20_0 != 0;
              } else {
                return stackIn_22_0 != 0;
              }
            }
          }
        }
    }

    final gj a(int param0) {
        this.field_o = wm.field_ab;
        this.field_p = im.field_b;
        this.field_e.a(this.field_a, this.field_k, param0 ^ 21837);
        ac.field_a = false;
        if (param0 != 20742) {
            this.field_a = 67;
        }
        gj var2 = id.a(2401, ki.field_d, this.field_a, 0, 0, this.field_k);
        if (!(var2 != null)) {
            this.a((byte) -105);
        }
        return var2;
    }

    final void a(byte param0) {
        this.field_e.a(this.field_o, this.field_p, 1099);
        if (param0 > -82) {
            field_c = 71;
        }
    }

    private final void c(byte param0) {
        boolean discarded$2 = false;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        L0: {
          var5 = Confined.field_J ? 1 : 0;
          var2 = this.field_h;
          var3 = this.field_u;
          if (param0 <= -115) {
            break L0;
          } else {
            discarded$2 = wi.a(true);
            break L0;
          }
        }
        if (this.b(-116)) {
          L1: {
            if (this.field_g >= var2) {
              if (var2 >= this.field_s) {
                break L1;
              } else {
                var2 = this.field_s;
                break L1;
              }
            } else {
              var2 = this.field_g;
              break L1;
            }
          }
          L2: {
            if (this.field_f < var3) {
              var3 = this.field_f;
              break L2;
            } else {
              if (this.field_j <= var3) {
                break L2;
              } else {
                var3 = this.field_j;
                break L2;
              }
            }
          }
          L3: {
            if (this.field_d <= 0.0f) {
              break L3;
            } else {
              var4 = (int)((float)var3 * this.field_d + 0.5f);
              if (var2 < var4) {
                var3 = (int)((float)var2 / this.field_d);
                break L3;
              } else {
                if (var4 >= var2) {
                  break L3;
                } else {
                  var2 = var4;
                  break L3;
                }
              }
            }
          }
          L4: {
            if (var2 != wm.field_ab) {
              this.field_e.a(var2, var3, 1099);
              break L4;
            } else {
              if (im.field_b == var3) {
                break L4;
              } else {
                this.field_e.a(var2, var3, 1099);
                break L4;
              }
            }
          }
          L5: {
            if ((this.field_h ^ -1) >= -1) {
              break L5;
            } else {
              ei.field_kb = (-wm.field_ab + this.field_h) / 2;
              break L5;
            }
          }
          return;
        } else {
          this.field_n = false;
          return;
        }
    }

    private wi() throws Throwable {
        throw new Error();
    }

    static {
        field_q = "IO error - unable to communicate reliably with the data server. Please check any firewall/antivirus/filtering software.";
        field_b = "Lightning cannon";
    }
}
