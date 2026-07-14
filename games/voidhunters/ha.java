/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ha {
    d field_a;
    int field_b;

    abstract aja a(int[] param0, int param1, int param2, int param3, int param4, boolean param5);

    final void a(int param0, byte param1, int param2, int param3, int param4, int param5) {
        ((ha) this).aa(param5, param4, param0, param3, param2, 1);
        if (param1 != 120) {
            ((ha) this).field_b = 8;
        }
    }

    final void a(int param0, int param1, int param2, byte param3, int param4) {
        ((ha) this).s(param2, param1, param0, param4, 1);
        int var6 = -99 % ((47 - param3) / 49);
    }

    final void a(int param0, int param1, int param2, int param3, boolean param4, int param5, int param6) {
        ((ha) this).a(param1, param2, param5, param0, param3, param6, 1);
        if (param4) {
            ((ha) this).field_a = null;
        }
    }

    abstract void P(int param0, int param1, int param2, int param3, int param4);

    final void b(int param0) throws jkb {
        int var2 = -72 / ((-30 - param0) / 53);
        ((ha) this).a(0, 0);
    }

    void a(aja param0, boolean param1) {
        ((ha) this).a(((ha) this).a((ekb) (Object) param0, param1 ? ((ha) this).b(param0.d(), param0.a()) : null));
    }

    abstract void a(float param0, float param1, float param2);

    abstract void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9);

    final void c(int param0, int param1, int param2, int param3, int param4, int param5) {
        ((ha) this).b(param4, param5, param0, param3, param2, param1);
    }

    abstract za e(int param0);

    abstract void j();

    abstract boolean r();

    abstract void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6);

    abstract int[] na(int param0, int param1, int param2, int param3);

    abstract boolean h();

    abstract void c(int param0);

    abstract boolean c();

    abstract void u();

    abstract boolean w();

    abstract void T(int param0, int param1, int param2, int param3);

    abstract void ya();

    final synchronized static ha a(int param0, asb param1, int param2, int param3, d param4, java.awt.Canvas param5, int param6, int param7) {
        if (-1 == (param7 ^ -1)) {
          return wmb.a(param4, param0, 42, param5, param3);
        } else {
          if ((param7 ^ -1) == -3) {
            return awa.a((byte) 113, param3, param5, param4, param0);
          } else {
            if (param6 > 0) {
              if (param7 != 1) {
                if (5 == param7) {
                  return pbb.a(param1, param2, -1588388127, param4, param5);
                } else {
                  if (param7 == 3) {
                    return jsa.a(param1, param2, 27908, param5, param4);
                  } else {
                    throw new IllegalArgumentException("UM");
                  }
                }
              } else {
                return sl.a(param4, (byte) 16, param2, param5);
              }
            } else {
              ha.a(false, -43, -73, 67);
              if (param7 != 1) {
                if (5 == param7) {
                  return pbb.a(param1, param2, -1588388127, param4, param5);
                } else {
                  if (param7 == 3) {
                    return jsa.a(param1, param2, 27908, param5, param4);
                  } else {
                    throw new IllegalArgumentException("UM");
                  }
                }
              } else {
                return sl.a(param4, (byte) 16, param2, param5);
              }
            }
          }
        }
    }

    abstract hf a(ekb param0, wib param1);

    abstract boolean m();

    protected void finalize() {
        ((ha) this).a((byte) 30);
    }

    abstract void ZA(int param0, float param1, float param2, float param3, float param4, float param5);

    abstract void v();

    abstract void a(pw param0);

    abstract int[] Y();

    abstract void DA(int param0, int param1, int param2, int param3);

    abstract boolean q();

    abstract void SA(int param0, int param1, int param2, int param3, int[] param4, int param5, int param6);

    abstract boolean x();

    abstract void za(int param0, int param1, int param2, int param3, int param4);

    abstract void a(int param0, int param1, int param2, int param3);

    final aja a(int param0, int param1, int[] param2, int param3, byte param4, int param5) {
        if (param4 < 18) {
          ((ha) this).a(-25, -48, -23, 85, -120, -118, 69);
          return ((ha) this).a(param2, param3, param1, param0, param5, true);
        } else {
          return ((ha) this).a(param2, param3, param1, param0, param5, true);
        }
    }

    abstract boolean s();

    final boolean a(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 >= -16) {
          L0: {
            boolean discarded$8 = ((ha) this).e();
            if (((ha) this).t() <= 0) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (((ha) this).t() <= 0) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    abstract void aa(int param0, int param1, int param2, int param3, int param4, int param5);

    abstract boolean f();

    abstract boolean p();

    abstract void d(int param0, int param1, int param2, int param3, int param4, int param5);

    abstract void b(int param0, int param1, int param2, int param3, int param4, int param5);

    abstract void a(za param0);

    abstract boolean a();

    abstract boolean n();

    ha(d param0) {
        int var3 = 0;
        ((ha) this).field_a = param0;
        int var2 = -1;
        for (var3 = 0; -9 < (var3 ^ -1); var3++) {
            if (!bqb.field_o[var3]) {
                bqb.field_o[var3] = true;
                var2 = var3;
                if (-1 == var2) {
                    throw new IllegalStateException("NFTI");
                }
                ((ha) this).field_b = var2;
            }
        }
        if (-1 == var2) {
            throw new IllegalStateException("NFTI");
        }
        ((ha) this).field_b = var2;
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        ((ha) this).U(param0, param3, param4, param2, 1);
        if (param1 != -25559) {
            ((ha) this).j();
        }
    }

    abstract int XA();

    abstract aja a(ima param0, boolean param1);

    final void a(int param0, int param1, int param2, int param3, byte param4) {
        int var6 = 120 / ((param4 - -44) / 63);
        ((ha) this).za(param2, param3, param1, param0, 1);
    }

    abstract void K(int[] param0);

    final void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var7 = -111 / ((-20 - param0) / 57);
        ((ha) this).d(param4, param1, param2, param5, param3, 1);
    }

    abstract boolean l();

    abstract void o();

    abstract int t();

    abstract void f(int param0, int param1);

    final static void a(boolean param0, int param1, int param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        if (!uga.field_d) {
          return;
        } else {
          L0: {
            tra.field_o.a(param0, param3 ^ 1329);
            var4 = fkb.field_m.h(-25675) ? 1 : 0;
            if (pba.field_o == 0) {
              break L0;
            } else {
              if (var4 == 0) {
                fj.b(18444);
                param0 = false;
                break L0;
              } else {
                if (param3 == 5) {
                  if (param0) {
                    L1: {
                      fkb.field_m.a(param2, param1, (byte) 115);
                      if (var4 != 0) {
                        tra.field_o.a(param0, param3 ^ 1329);
                        break L1;
                      } else {
                        break L1;
                      }
                    }
                    var5 = fkb.field_m.k(-4109) - -fkb.field_m.field_M;
                    if (-641 <= var5) {
                      if (var5 < 635) {
                        if (-1 >= ejb.field_p) {
                          return;
                        } else {
                          ejb.field_p = ejb.field_p - 5;
                          return;
                        }
                      } else {
                        return;
                      }
                    } else {
                      ejb.field_p = ejb.field_p + 5;
                      return;
                    }
                  } else {
                    L2: {
                      if (var4 != 0) {
                        tra.field_o.a(param0, param3 ^ 1329);
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                    var5 = fkb.field_m.k(-4109) - -fkb.field_m.field_M;
                    if (-641 <= var5) {
                      if (var5 < 635) {
                        if (-1 >= ejb.field_p) {
                          return;
                        } else {
                          ejb.field_p = ejb.field_p - 5;
                          return;
                        }
                      } else {
                        return;
                      }
                    } else {
                      ejb.field_p = ejb.field_p + 5;
                      return;
                    }
                  }
                } else {
                  return;
                }
              }
            }
          }
          if (param3 == 5) {
            if (!param0) {
              L3: {
                if (var4 != 0) {
                  tra.field_o.a(param0, param3 ^ 1329);
                  break L3;
                } else {
                  break L3;
                }
              }
              var5 = fkb.field_m.k(-4109) - -fkb.field_m.field_M;
              if (-641 <= var5) {
                if (var5 < 635) {
                  if (-1 < ejb.field_p) {
                    ejb.field_p = ejb.field_p - 5;
                    return;
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              } else {
                ejb.field_p = ejb.field_p + 5;
                return;
              }
            } else {
              L4: {
                fkb.field_m.a(param2, param1, (byte) 115);
                if (var4 != 0) {
                  tra.field_o.a(param0, param3 ^ 1329);
                  break L4;
                } else {
                  break L4;
                }
              }
              var5 = fkb.field_m.k(-4109) - -fkb.field_m.field_M;
              if (-641 <= var5) {
                if (var5 < 635) {
                  if (-1 >= ejb.field_p) {
                    return;
                  } else {
                    ejb.field_p = ejb.field_p - 5;
                    return;
                  }
                } else {
                  return;
                }
              } else {
                ejb.field_p = ejb.field_p + 5;
                return;
              }
            }
          } else {
            return;
          }
        }
    }

    abstract void KA(int param0, int param1, int param2, int param3);

    abstract int i();

    abstract void GA(int param0);

    abstract da a(sw param0, ima[] param1, boolean param2);

    abstract void U(int param0, int param1, int param2, int param3, int param4);

    abstract wib b(int param0, int param1);

    abstract ka a(cbb param0, int param1, int param2, int param3, int param4);

    final void a(byte param0) {
        if (param0 != 30) {
            return;
        }
        bqb.field_o[((ha) this).field_b] = false;
        ((ha) this).o();
    }

    abstract aja a(int param0, int param1, boolean param2);

    abstract void a(hf param0);

    abstract void a(int param0, int param1) throws jkb;

    abstract boolean k();

    abstract boolean b();

    abstract void xa(float param0);

    abstract boolean e();

    abstract pw d();

    abstract void s(int param0, int param1, int param2, int param3, int param4);

    static {
    }
}
