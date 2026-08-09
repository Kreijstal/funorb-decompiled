/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class hb extends ka {
    static tf field_hb;
    static ak field_eb;
    static boolean field_kb;
    private int field_ib;
    private dq field_lb;
    private sd field_bb;
    private ng field_db;
    private int field_fb;
    private int field_cb;
    private int field_gb;
    static String[] field_jb;
    private int field_ab;

    final static void a(boolean param0, int param1, int param2, int param3, int[] param4, int param5, int param6) {
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        try {
          L0: {
            L1: {
              if (param2 != 0) {
                L2: {
                  if ((param2 ^ -1) == -5) {
                    break L2;
                  } else {
                    if ((param2 ^ -1) == -3) {
                      break L2;
                    } else {
                      if (-2 == (param2 ^ -1)) {
                        break L2;
                      } else {
                        if ((param2 ^ -1) != -6) {
                          if ((param2 ^ -1) != -7) {
                            if ((param2 ^ -1) != -8) {
                              L3: {
                                if (param2 == 8) {
                                  break L3;
                                } else {
                                  if ((param2 ^ -1) == -10) {
                                    break L3;
                                  } else {
                                    if (-11 == (param2 ^ -1)) {
                                      oc.field_H[param2] = (de) ((Object) new mi(param2, param6, param3, param1, param5, param4));
                                      break L1;
                                    } else {
                                      if (11 == param2) {
                                        oc.field_H[param2] = (de) ((Object) new l(param2, param6, param3, param1, param5, param4));
                                        break L1;
                                      } else {
                                        if ((param2 ^ -1) != -13) {
                                          if (param2 != 13) {
                                            if ((param2 ^ -1) == -17) {
                                              oc.field_H[param2] = (de) ((Object) new uk(param2, param6, param3, param1, param5, param4));
                                              break L1;
                                            } else {
                                              if (17 != param2) {
                                                if (param2 == 14) {
                                                  oc.field_H[param2] = (de) ((Object) new ij(param2, param6, param3, param1, param5, param4));
                                                  break L1;
                                                } else {
                                                  throw new IllegalStateException("No class defined for id=" + param2);
                                                }
                                              } else {
                                                oc.field_H[param2] = (de) ((Object) new op(param2, param6, param3, param1, param5, param4));
                                                break L1;
                                              }
                                            }
                                          } else {
                                            oc.field_H[param2] = (de) ((Object) new hq(param2, param6, param3, param1, param5, param4));
                                            break L1;
                                          }
                                        } else {
                                          oc.field_H[param2] = (de) ((Object) new ol(param2, param6, param3, param1, param5, param4));
                                          break L1;
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                              oc.field_H[param2] = (de) ((Object) new rb(param2, param6, param3, param1, param5, param4));
                              break L1;
                            } else {
                              oc.field_H[param2] = (de) ((Object) new fk(param2, param6, param3, param1, param5, param4));
                              break L1;
                            }
                          } else {
                            oc.field_H[param2] = (de) ((Object) new wh(param2, param6, param3, param1, param5, param4));
                            break L1;
                          }
                        } else {
                          oc.field_H[param2] = (de) ((Object) new fq(param2, param6, param3, param1, param5, param4));
                          break L1;
                        }
                      }
                    }
                  }
                }
                oc.field_H[param2] = (de) ((Object) new dp(param2, param6, param3, param1, param5, param4));
                break L1;
              } else {
                oc.field_H[param2] = (de) ((Object) new to(param2, param6, param3, param1, param5, param4));
                break L1;
              }
            }
            if (param0) {
              break L0;
            } else {
              hb.e((byte) 29);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var7 = decompiledCaughtException;
            stackIn_35_0 = (RuntimeException) (var7);

            stackIn_35_1 = new StringBuilder().append("hb.P(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_36_0 = (RuntimeException) ((Object) stackIn_35_0);
              stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackIn_36_2 = "null";
              break L4;
            } else {
              stackIn_36_0 = (RuntimeException) ((Object) stackIn_35_0);
              stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackIn_36_2 = "{...}";
              break L4;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_36_0), stackIn_36_2 + ',' + param5 + ',' + param6 + ')');
        }
    }

    final static byte[] a(String param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        byte[] stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var2_int = 59 % ((49 - param1) / 54);
            stackIn_1_0 = ig.field_b.a((byte) 24, param0, "");
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var2);

            stackIn_4_1 = new StringBuilder().append("hb.O(");

            if (param0 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ',' + param1 + ')');
        }
        return stackIn_1_0;
    }

    final void f(boolean param0) {
        if (fh.field_I == this.field_lb) {
          return;
        } else {
          if (!param0) {
            this.c(true);
            this.field_cb = 0;
            this.field_lb = rf.field_i;
            this.d(this.field_db, 114);
            this.field_bb.field_O = 0;
            this.field_db = null;
            return;
          } else {
            this.field_cb = 0;
            this.field_lb = rf.field_i;
            this.d(this.field_db, 114);
            this.field_bb.field_O = 0;
            this.field_db = null;
            return;
          }
        }
    }

    boolean a(int param0, int param1, ng param2, char param3) {
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (super.a(param0, param1, param2, param3)) {
              stackIn_3_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (null != this.field_bb) {
                L1: {
                  if (-99 == (param0 ^ -1)) {
                    this.field_bb.a(param2, param1 ^ 24);
                    break L1;
                  } else {
                    break L1;
                  }
                }
                L2: {
                  if ((param0 ^ -1) != -100) {
                    break L2;
                  } else {
                    this.field_bb.a(param2, 27);
                    break L2;
                  }
                }
                stackIn_12_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                return false;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var5);

            stackIn_15_1 = new StringBuilder().append("hb.G(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L3;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L3;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          return stackIn_12_0 != 0;
        }
    }

    boolean c(boolean param0) {
        int fieldTemp$4 = 0;
        int fieldTemp$5 = 0;
        int fieldTemp$6 = 0;
        int fieldTemp$7 = 0;
        int var3;
        var3 = Pixelate.field_H ? 1 : 0;
        if (param0) {
          hb.e((byte) 58);
          if (this.field_lb != null) {
            if (fh.field_I == this.field_lb) {
              fieldTemp$4 = this.field_cb + 1;
              this.field_cb = this.field_cb + 1;
              if (fieldTemp$4 == this.field_ab) {
                this.field_lb = co.field_h;
                this.a(this.field_db.field_C + this.field_fb + 12, 12 - -this.field_db.field_E, this.field_gb, 57);
                this.field_cb = 0;
                this.field_bb.field_O = 0;
                return super.c(false);
              } else {
                this.field_bb.field_O = 256 - (this.field_cb << 1439492488) / this.field_ab;
                return super.c(false);
              }
            } else {
              if (this.field_lb == rf.field_i) {
                fieldTemp$5 = this.field_cb + 1;
                this.field_cb = this.field_cb + 1;
                if (this.field_ib != fieldTemp$5) {
                  this.field_bb.field_O = (this.field_cb << -231020888) / this.field_ib;
                  return super.c(false);
                } else {
                  this.field_lb = null;
                  this.field_bb.field_O = 256;
                  return super.c(false);
                }
              } else {
                return super.c(false);
              }
            }
          } else {
            return super.c(false);
          }
        } else {
          if (this.field_lb != null) {
            if (fh.field_I == this.field_lb) {
              fieldTemp$6 = this.field_cb + 1;
              this.field_cb = this.field_cb + 1;
              if (fieldTemp$6 == this.field_ab) {
                this.field_lb = co.field_h;
                this.a(this.field_db.field_C + this.field_fb + 12, 12 - -this.field_db.field_E, this.field_gb, 57);
                this.field_cb = 0;
                this.field_bb.field_O = 0;
                return super.c(false);
              } else {
                this.field_bb.field_O = 256 - (this.field_cb << 1439492488) / this.field_ab;
                return super.c(false);
              }
            } else {
              if (this.field_lb == rf.field_i) {
                fieldTemp$7 = this.field_cb + 1;
                this.field_cb = this.field_cb + 1;
                if (this.field_ib != fieldTemp$7) {
                  this.field_bb.field_O = (this.field_cb << -231020888) / this.field_ib;
                  return super.c(false);
                } else {
                  this.field_lb = null;
                  this.field_bb.field_O = 256;
                  return super.c(false);
                }
              } else {
                return super.c(false);
              }
            }
          } else {
            return super.c(false);
          }
        }
    }

    hb(kn param0, ng param1, int param2, int param3, int param4) {
        super(param0, param1.field_E + 12, param2 + 12 - -param1.field_C);
        try {
            this.field_gb = param4;
            this.field_fb = param2;
            this.field_ib = param3;
            this.field_ab = param3;
            this.d(param1, 125);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "hb.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    void c(ng param0, int param1) {
        RuntimeException var3 = null;
        ng var4 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              this.field_db = param0;
              if (co.field_h != this.field_lb) {
                if (fh.field_I == this.field_lb) {
                  break L1;
                } else {
                  this.field_lb = fh.field_I;
                  this.field_cb = 0;
                  break L1;
                }
              } else {
                this.a(this.field_db.field_C + this.field_fb + 12, 12 - -this.field_db.field_E, this.field_gb, 57);
                this.field_cb = 0;
                break L1;
              }
            }
            if (param1 < -111) {
              break L0;
            } else {
              var4 = (ng) null;
              this.a(-79, 114, (ng) null, 'F');
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var3);

            stackIn_9_1 = new StringBuilder().append("hb.R(");

            if (param0 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ')');
        }
    }

    private final void d(ng param0, int param1) {
        if (!(null == this.field_bb)) {
            this.field_bb.c(2779);
        }
        if (param1 <= 101) {
            return;
        }
        try {
            if (param0 != null) {
                param0.a(param0.field_E, (byte) 55, this.field_fb + 6, 6, param0.field_C);
                this.field_bb = new sd(param0);
            } else {
                this.field_bb = new sd();
            }
            this.b(this.field_bb, 80);
            this.field_db = null;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "hb.M(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void e(boolean param0) {
        if (!(null == this.field_lb)) {
            if (!(rf.field_i == this.field_lb)) {
                this.a(this.field_fb + 12 + this.field_db.field_C, (byte) -110, 12 + this.field_db.field_E);
                this.d(this.field_db, 111);
            }
            this.field_bb.field_O = 256;
            this.field_lb = null;
        }
        super.e(param0);
    }

    public static void f(byte param0) {
        field_hb = null;
        field_jb = null;
        field_eb = null;
        if (param0 != 82) {
            String var2 = (String) null;
            hb.a((String) null, (byte) -11);
        }
    }

    final boolean a(byte param0) {
        this.e(false);
        if (param0 < 120) {
            this.f(false);
            return super.a((byte) 126);
        }
        return super.a((byte) 126);
    }

    final static String e(byte param0) {
        int var1 = -24 / ((-51 - param0) / 54);
        if (re.field_h) {
            return null;
        }
        if (am.field_c > no.field_h) {
            return null;
        }
        if (!(am.field_c + pc.field_s <= no.field_h)) {
            return qg.field_b;
        }
        return null;
    }

    static {
        field_kb = true;
    }
}
