/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vla extends mv {
    private int field_q;
    static kka field_x;
    static byte[][][] field_o;
    static ee[] field_r;
    static long field_v;
    static String field_u;
    static String field_t;
    static boolean field_w;
    static boolean field_s;
    static String field_p;

    public static void f(byte param0) {
        field_r = null;
        field_t = null;
        field_p = null;
        field_o = (byte[][][]) null;
        if (param0 > -82) {
          vla.a(117, -79, -10, false);
          field_u = null;
          field_x = null;
          return;
        } else {
          field_u = null;
          field_x = null;
          return;
        }
    }

    final void e(int param0) {
        pp var2;
        ad var3;
        int var4;
        var4 = BachelorFridge.field_y;
        if (param0 == (this.field_k.field_p ^ -1)) {
          return;
        } else {
          var2 = (pp) ((Object) this.field_k.field_o.b((byte) 90));
          L0: while (true) {
            if (var2 == null) {
              return;
            } else {
              L1: {
                if (var2.field_h == null) {
                  break L1;
                } else {
                  var3 = var2.field_h.a(-27449, this.field_l);
                  if (var3.field_f.field_u.field_e) {
                    var3.b(false);
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
              var2 = (pp) ((Object) this.field_k.field_o.c(0));
              continue L0;
            }
          }
        }
    }

    vla(gj param0, vja param1) {
        super(param0, param1);
        try {
            this.field_q = 64;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "vla.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean c(byte param0) {
        Object var6 = null;
        t var6_ref = (t) ((Object) al.a(-69, this.field_k.field_k));
        aga var3 = this.field_k.field_l.a(125, this.field_l.field_h);
        ad var4 = this.field_k.field_l.a(-27449, this.field_l);
        this.field_l.field_s.a((byte) -57, var3.field_J, var3.field_x);
        if (!(!var3.i(91))) {
            return true;
        }
        int var5 = -90 % ((71 - param0) / 47);
        int fieldTemp$0 = this.field_q - 1;
        this.field_q = this.field_q - 1;
        if (!(0 > fieldTemp$0)) {
            if (-26 == (this.field_q ^ -1)) {
                this.d((byte) -86);
                mk.a(var6_ref.field_n, -114);
                if (15 != this.field_q) {
                    if (!(this.field_q >= 25)) {
                        this.e(-32);
                    }
                    if ((this.field_q ^ -1) != -64) {
                        return false;
                    }
                    if (this.field_k.d((byte) -90)) {
                        return false;
                    }
                    var4.b(-1, var6_ref.field_o);
                    return false;
                }
                if (!(this.field_k.d((byte) -75))) {
                    this.f(-76);
                }
                if (!(this.field_q >= 25)) {
                    this.e(-32);
                }
                if ((this.field_q ^ -1) != -64) {
                    return false;
                }
                if (!this.field_k.d((byte) -90)) {
                    var4.b(-1, var6_ref.field_o);
                    return false;
                }
                return false;
            }
            if (15 == this.field_q) {
                if (this.field_k.d((byte) -75)) {
                    if (!(this.field_q >= 25)) {
                        this.e(-32);
                    }
                    if ((this.field_q ^ -1) == -64 && !this.field_k.d((byte) -90)) {
                        var4.b(-1, var6_ref.field_o);
                        return false;
                    }
                    return false;
                }
                this.f(-76);
            }
            if (!(this.field_q >= 25)) {
                this.e(-32);
            }
            if ((this.field_q ^ -1) == -64 && !this.field_k.d((byte) -90)) {
                var4.b(-1, var6_ref.field_o);
                return false;
            }
            return false;
        }
        this.d(88);
        return true;
    }

    final static int a(int param0, be param1) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == -64) {
              if (param1 == null) {
                stackIn_6_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                stackIn_8_0 = 50 * param1.field_i.length / pb.field_j;
                decompiledRegionSelector0 = 2;
                break L0;
              }
            } else {
              stackIn_2_0 = -77;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var2);

            stackIn_11_1 = new StringBuilder().append("vla.E(").append(param0).append(',');

            if (param1 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L1;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L1;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            return stackIn_8_0;
          }
        }
    }

    final static void a(int param0, int param1, int param2, boolean param3) {
        int var4;
        int var5;
        if (param0 == 5) {
          if (gm.field_k) {
            L0: {
              fo.field_a.a(19842, param3);
              var4 = da.field_d.g(-16360) ? 1 : 0;
              if (lf.field_c == 0) {
                break L0;
              } else {
                if (var4 != 0) {
                  break L0;
                } else {
                  lc.b(-1);
                  param3 = false;
                  break L0;
                }
              }
            }
            if (!param3) {
              if (var4 == 0) {
                var5 = da.field_d.b(false) + da.field_d.field_D;
                if (var5 > 640) {
                  uga.field_x = uga.field_x + 5;
                  return;
                } else {
                  L1: {
                    if ((var5 ^ -1) <= -636) {
                      break L1;
                    } else {
                      if (-1 <= (uga.field_x ^ -1)) {
                        break L1;
                      } else {
                        uga.field_x = uga.field_x - 5;
                        return;
                      }
                    }
                  }
                  return;
                }
              } else {
                fo.field_a.a(19842, param3);
                var5 = da.field_d.b(false) + da.field_d.field_D;
                if (var5 > 640) {
                  uga.field_x = uga.field_x + 5;
                  return;
                } else {
                  L2: {
                    if ((var5 ^ -1) <= -636) {
                      break L2;
                    } else {
                      if (-1 <= (uga.field_x ^ -1)) {
                        break L2;
                      } else {
                        uga.field_x = uga.field_x - 5;
                        return;
                      }
                    }
                  }
                  return;
                }
              }
            } else {
              da.field_d.a(param2, 30091, param1);
              if (var4 == 0) {
                var5 = da.field_d.b(false) + da.field_d.field_D;
                if (var5 > 640) {
                  uga.field_x = uga.field_x + 5;
                  return;
                } else {
                  L3: {
                    if ((var5 ^ -1) <= -636) {
                      break L3;
                    } else {
                      if (-1 <= (uga.field_x ^ -1)) {
                        break L3;
                      } else {
                        uga.field_x = uga.field_x - 5;
                        return;
                      }
                    }
                  }
                  return;
                }
              } else {
                fo.field_a.a(19842, param3);
                var5 = da.field_d.b(false) + da.field_d.field_D;
                if (var5 > 640) {
                  uga.field_x = uga.field_x + 5;
                  return;
                } else {
                  L4: {
                    if ((var5 ^ -1) <= -636) {
                      break L4;
                    } else {
                      if (-1 <= (uga.field_x ^ -1)) {
                        break L4;
                      } else {
                        uga.field_x = uga.field_x - 5;
                        return;
                      }
                    }
                  }
                  return;
                }
              }
            }
          } else {
            return;
          }
        } else {
          vla.f((byte) -87);
          if (gm.field_k) {
            L5: {
              fo.field_a.a(19842, param3);
              var4 = da.field_d.g(-16360) ? 1 : 0;
              if (lf.field_c == 0) {
                break L5;
              } else {
                if (var4 != 0) {
                  break L5;
                } else {
                  lc.b(-1);
                  param3 = false;
                  break L5;
                }
              }
            }
            if (param3) {
              da.field_d.a(param2, 30091, param1);
              if (var4 != 0) {
                fo.field_a.a(19842, param3);
                var5 = da.field_d.b(false) + da.field_d.field_D;
                if (var5 > 640) {
                  uga.field_x = uga.field_x + 5;
                  return;
                } else {
                  if ((var5 ^ -1) > -636) {
                    if (-1 > (uga.field_x ^ -1)) {
                      uga.field_x = uga.field_x - 5;
                      return;
                    } else {
                      return;
                    }
                  } else {
                    return;
                  }
                }
              } else {
                var5 = da.field_d.b(false) + da.field_d.field_D;
                if (var5 <= 640) {
                  if ((var5 ^ -1) > -636) {
                    if (-1 <= (uga.field_x ^ -1)) {
                      return;
                    } else {
                      uga.field_x = uga.field_x - 5;
                      return;
                    }
                  } else {
                    return;
                  }
                } else {
                  uga.field_x = uga.field_x + 5;
                  return;
                }
              }
            } else {
              if (var4 == 0) {
                var5 = da.field_d.b(false) + da.field_d.field_D;
                if (var5 <= 640) {
                  if ((var5 ^ -1) > -636) {
                    if (-1 > (uga.field_x ^ -1)) {
                      uga.field_x = uga.field_x - 5;
                      return;
                    } else {
                      return;
                    }
                  } else {
                    return;
                  }
                } else {
                  uga.field_x = uga.field_x + 5;
                  return;
                }
              } else {
                L6: {
                  fo.field_a.a(19842, param3);
                  var5 = da.field_d.b(false) + da.field_d.field_D;
                  if (var5 > 640) {
                    uga.field_x = uga.field_x + 5;
                    break L6;
                  } else {
                    if ((var5 ^ -1) <= -636) {
                      break L6;
                    } else {
                      if (-1 <= (uga.field_x ^ -1)) {
                        break L6;
                      } else {
                        uga.field_x = uga.field_x - 5;
                        break L6;
                      }
                    }
                  }
                }
                return;
              }
            }
          } else {
            return;
          }
        }
    }

    static {
        field_t = "Inviting <%0>";
        field_p = "<%0> turns remaining";
        field_u = "<col=0></col>£<%0>";
    }
}
