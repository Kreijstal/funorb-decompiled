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
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        try {
          boolean decompiledFrameRemainder0 = true;
          if (param2 != 0) {
            if (param2 != 4 &&
              param2 != 2 &&
              param2 != 1) {
              if (param2 == 5) {
                oc.field_H[param2] = (de) ((Object) new fq(param2, param6, param3, param1, param5, param4));
              } else {
                if (param2 == 6) {
                  oc.field_H[param2] = (de) ((Object) new wh(param2, param6, param3, param1, param5, param4));
                } else {
                  if (param2 == 7) {
                    oc.field_H[param2] = (de) ((Object) new fk(param2, param6, param3, param1, param5, param4));
                  } else {
                    if (param2 != 8 &&
                      param2 != 9) {
                      if (param2 == 10) {
                        oc.field_H[param2] = (de) ((Object) new mi(param2, param6, param3, param1, param5, param4));
                      } else {
                        if (11 == param2) {
                          oc.field_H[param2] = (de) ((Object) new l(param2, param6, param3, param1, param5, param4));
                        } else {
                          if (param2 == 12) {
                            oc.field_H[param2] = (de) ((Object) new ol(param2, param6, param3, param1, param5, param4));
                          } else {
                            if (param2 == 13) {
                              oc.field_H[param2] = (de) ((Object) new hq(param2, param6, param3, param1, param5, param4));
                            } else {
                              if (param2 == 16) {
                                oc.field_H[param2] = (de) ((Object) new uk(param2, param6, param3, param1, param5, param4));
                              } else {
                                if (17 == param2) {
                                  oc.field_H[param2] = (de) ((Object) new op(param2, param6, param3, param1, param5, param4));
                                } else {
                                  if (param2 != 14) {
                                    throw new IllegalStateException("No class defined for id=" + param2);
                                  }
                                  oc.field_H[param2] = (de) ((Object) new ij(param2, param6, param3, param1, param5, param4));
                                }
                              }
                            }
                          }
                        }
                      }
                    } else {
                      oc.field_H[param2] = (de) ((Object) new rb(param2, param6, param3, param1, param5, param4));
                    }
                  }
                }
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              oc.field_H[param2] = (de) ((Object) new dp(param2, param6, param3, param1, param5, param4));
            }
          } else {
            oc.field_H[param2] = (de) ((Object) new to(param2, param6, param3, param1, param5, param4));
          }
          if (param0) {
            return;
          }
          hb.e((byte) 29);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_35_0 = var7;
          stackIn_35_1 = new StringBuilder().append("hb.P(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_36_2 = "null";
          } else {
            stackIn_36_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_35_0), ((StringBuilder) (Object) stackIn_35_1).append(stackIn_36_2).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final static byte[] a(String param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        byte[] stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = 59 % ((49 - param1) / 54);
          stackIn_1_0 = ig.field_b.a((byte) 24, param0, "");
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_4_0 = var2;
          stackIn_4_1 = new StringBuilder().append("hb.O(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(')').toString());
        }
    }

    final void f(boolean param0) {
        if (fh.field_I == this.field_lb) {
          return;
        }
        if (param0) {
          this.field_cb = 0;
          this.field_lb = rf.field_i;
          this.d(this.field_db, 114);
          this.field_bb.field_O = 0;
          this.field_db = null;
          return;
        }
        this.c(true);
        this.field_cb = 0;
        this.field_lb = rf.field_i;
        this.d(this.field_db, 114);
        this.field_bb.field_O = 0;
        this.field_db = null;
    }

    boolean a(int param0, int param1, ng param2, char param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.a(param0, param1, param2, param3)) {
            return true;
          }
          if (null == this.field_bb) {
            return false;
          }
          if (param0 == 98) {
            this.field_bb.a(param2, param1 ^ 24);
          }
          if (param0 == 99) {
            this.field_bb.a(param2, 27);
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_15_0 = var5;
          stackIn_15_1 = new StringBuilder().append("hb.G(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param3).append(')').toString());
        }
    }

    boolean c(boolean param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int fieldTemp$2 = 0;
        int var3 = Pixelate.field_H ? 1 : 0;
        if (!param0) {
          if (this.field_lb == null) {
            return super.c(false);
          }
          if (fh.field_I != this.field_lb) {
            if (this.field_lb != rf.field_i) {
              return super.c(false);
            }
            fieldTemp$0 = this.field_cb + 1;
            this.field_cb = this.field_cb + 1;
            if (this.field_ib == fieldTemp$0) {
              this.field_lb = null;
              this.field_bb.field_O = 256;
              return super.c(false);
            }
            this.field_bb.field_O = (this.field_cb << 8) / this.field_ib;
            return super.c(false);
          }
          fieldTemp$1 = this.field_cb + 1;
          this.field_cb = this.field_cb + 1;
          if (fieldTemp$1 != this.field_ab) {
            this.field_bb.field_O = 256 - (this.field_cb << 8) / this.field_ab;
            return super.c(false);
          }
          this.field_lb = co.field_h;
          this.a(this.field_db.field_C + this.field_fb + 12, 12 + this.field_db.field_E, this.field_gb, 57);
          this.field_cb = 0;
          this.field_bb.field_O = 0;
          return super.c(false);
        }
        hb.e((byte) 58);
        if (this.field_lb == null) {
          return super.c(false);
        }
        if (fh.field_I != this.field_lb) {
          if (this.field_lb != rf.field_i) {
            return super.c(false);
          }
          fieldTemp$2 = this.field_cb + 1;
          this.field_cb = this.field_cb + 1;
          if (this.field_ib == fieldTemp$2) {
            this.field_lb = null;
            this.field_bb.field_O = 256;
            return super.c(false);
          }
          this.field_bb.field_O = (this.field_cb << 8) / this.field_ib;
          return super.c(false);
        }
        int fieldTemp$3 = this.field_cb + 1;
        this.field_cb = this.field_cb + 1;
        if (fieldTemp$3 != this.field_ab) {
          this.field_bb.field_O = 256 - (this.field_cb << 8) / this.field_ab;
          return super.c(false);
        }
        this.field_lb = co.field_h;
        this.a(this.field_db.field_C + this.field_fb + 12, 12 + this.field_db.field_E, this.field_gb, 57);
        this.field_cb = 0;
        this.field_bb.field_O = 0;
        return super.c(false);
    }

    hb(kn param0, ng param1, int param2, int param3, int param4) {
        super(param0, param1.field_E + 12, param2 + 12 + param1.field_C);
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
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_db = param0;
          if (co.field_h != this.field_lb) {
            if (fh.field_I != this.field_lb) {
              this.field_lb = fh.field_I;
              this.field_cb = 0;
            }
          } else {
            this.a(this.field_db.field_C + this.field_fb + 12, 12 + this.field_db.field_E, this.field_gb, 57);
            this.field_cb = 0;
          }
          if (param1 < -111) {
            return;
          }
          var4 = (ng) null;
          this.a(-79, 114, (ng) null, 'F');
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("hb.R(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void d(ng param0, int param1) {
        if (null != this.field_bb) {
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
        if (null != this.field_lb) {
          if (rf.field_i != this.field_lb) {
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
