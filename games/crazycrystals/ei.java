/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ei extends om {
    private vc field_B;
    static int field_E;
    static int field_F;
    private String field_I;
    private int field_C;
    private int field_H;
    private int field_z;
    static int field_A;
    private boolean field_y;
    static String field_G;

    final void a(int param0, byte param1, int param2, int param3) {
        int var5 = param2 + this.field_r;
        int var6 = this.field_j + param0;
        super.a(param0, (byte) -128, param2, param3);
        if (0 != param3) {
          return;
        }
        int var7 = this.field_y ? this.field_g - (this.field_z + this.field_C * 2) : 0;
        this.field_B.a(this.field_I, var7 + (var5 + this.field_C), var6 + this.field_C, -this.field_C + this.field_z, this.field_f - 2 * this.field_C, this.field_H, -1, this.field_y ? 0 : 2, 1, this.field_B.field_o);
        if (param1 < -12) {
          return;
        }
        ei.a(-13, -55, true);
    }

    final static void a(int param0, int param1, boolean param2) {
        if (rc.field_b == null) {
          rc.field_b = new int[2 * param0];
          if (param2) {
            field_E = -34;
          }
          if (null == mh.field_l ||
            !(mh.field_l.length >= param0)) {
            mh.field_l = new int[param0 * 2];
          }
          if (dk.field_l == null ||
            !(param0 <= dk.field_l.length)) {
            dk.field_l = new int[2 * param0];
          }
          if (null == j.field_i ||
            !(j.field_i.length >= param0)) {
            j.field_i = new int[param0 * 2];
          }
          if (null == cd.field_u) {
            cd.field_u = new int[2 * param0];
            if (jk.field_g == null ||
              !(param0 <= jk.field_g.length)) {
              jk.field_g = new int[2 * param0];
            }
            if (wp.field_d == null ||
              !(wp.field_d.length >= param1 + param0)) {
              wp.field_d = new int[(param0 + param1) * 2];
            }
            if (qj.field_c == null ||
              !(param0 <= qj.field_c.length)) {
              qj.field_c = new boolean[param0 * 2];
            }
          } else {
            if (cd.field_u.length >= param0) {
              if (jk.field_g == null ||
                !(param0 <= jk.field_g.length)) {
                jk.field_g = new int[2 * param0];
              }
              if (wp.field_d == null ||
                !(wp.field_d.length >= param1 + param0)) {
                wp.field_d = new int[(param0 + param1) * 2];
              }
              if (qj.field_c == null ||
                !(param0 <= qj.field_c.length)) {
                qj.field_c = new boolean[param0 * 2];
              }
            } else {
              cd.field_u = new int[2 * param0];
              if (jk.field_g == null ||
                !(param0 <= jk.field_g.length)) {
                jk.field_g = new int[2 * param0];
              }
              if (wp.field_d == null ||
                !(wp.field_d.length >= param1 + param0)) {
                wp.field_d = new int[(param0 + param1) * 2];
              }
              if (qj.field_c == null ||
                !(param0 <= qj.field_c.length)) {
                qj.field_c = new boolean[param0 * 2];
              }
            }
          }
        } else {
          if (param0 <= rc.field_b.length) {
            if (param2) {
              field_E = -34;
            }
            if (null == mh.field_l ||
              !(mh.field_l.length >= param0)) {
              mh.field_l = new int[param0 * 2];
            }
            if (dk.field_l == null ||
              !(param0 <= dk.field_l.length)) {
              dk.field_l = new int[2 * param0];
            }
            if (null == j.field_i ||
              !(j.field_i.length >= param0)) {
              j.field_i = new int[param0 * 2];
            }
            if (null == cd.field_u) {
              cd.field_u = new int[2 * param0];
              if (jk.field_g == null ||
                !(param0 <= jk.field_g.length)) {
                jk.field_g = new int[2 * param0];
              }
              if (wp.field_d == null ||
                !(wp.field_d.length >= param1 + param0)) {
                wp.field_d = new int[(param0 + param1) * 2];
              }
              if (qj.field_c == null ||
                !(param0 <= qj.field_c.length)) {
                qj.field_c = new boolean[param0 * 2];
              }
            } else {
              if (cd.field_u.length >= param0) {
                if (jk.field_g == null ||
                  !(param0 <= jk.field_g.length)) {
                  jk.field_g = new int[2 * param0];
                }
                if (wp.field_d == null ||
                  !(wp.field_d.length >= param1 + param0)) {
                  wp.field_d = new int[(param0 + param1) * 2];
                }
                if (qj.field_c == null ||
                  !(param0 <= qj.field_c.length)) {
                  qj.field_c = new boolean[param0 * 2];
                }
              } else {
                cd.field_u = new int[2 * param0];
                if (jk.field_g == null ||
                  !(param0 <= jk.field_g.length)) {
                  jk.field_g = new int[2 * param0];
                }
                if (wp.field_d == null ||
                  !(wp.field_d.length >= param1 + param0)) {
                  wp.field_d = new int[(param0 + param1) * 2];
                }
                if (qj.field_c == null ||
                  !(param0 <= qj.field_c.length)) {
                  qj.field_c = new boolean[param0 * 2];
                }
              }
            }
          } else {
            rc.field_b = new int[2 * param0];
            if (param2) {
              field_E = -34;
            }
            if (null == mh.field_l ||
              !(mh.field_l.length >= param0)) {
              mh.field_l = new int[param0 * 2];
            }
            if (dk.field_l == null ||
              !(param0 <= dk.field_l.length)) {
              dk.field_l = new int[2 * param0];
            }
            if (null == j.field_i ||
              !(j.field_i.length >= param0)) {
              j.field_i = new int[param0 * 2];
            }
            if (null == cd.field_u) {
              cd.field_u = new int[2 * param0];
              if (jk.field_g == null ||
                !(param0 <= jk.field_g.length)) {
                jk.field_g = new int[2 * param0];
              }
              if (wp.field_d == null ||
                !(wp.field_d.length >= param1 + param0)) {
                wp.field_d = new int[(param0 + param1) * 2];
              }
              if (qj.field_c == null) {
                qj.field_c = new boolean[param0 * 2];
              } else {
                if (param0 > qj.field_c.length) {
                  qj.field_c = new boolean[param0 * 2];
                }
              }
            } else {
              if (cd.field_u.length >= param0) {
                if (jk.field_g == null ||
                  !(param0 <= jk.field_g.length)) {
                  jk.field_g = new int[2 * param0];
                }
                if (wp.field_d == null ||
                  !(wp.field_d.length >= param1 + param0)) {
                  wp.field_d = new int[(param0 + param1) * 2];
                }
                if (qj.field_c == null ||
                  !(param0 <= qj.field_c.length)) {
                  qj.field_c = new boolean[param0 * 2];
                }
              } else {
                cd.field_u = new int[2 * param0];
                if (jk.field_g == null ||
                  !(param0 <= jk.field_g.length)) {
                  jk.field_g = new int[2 * param0];
                }
                if (wp.field_d == null) {
                  wp.field_d = new int[(param0 + param1) * 2];
                  if (qj.field_c == null ||
                    !(param0 <= qj.field_c.length)) {
                    qj.field_c = new boolean[param0 * 2];
                  }
                } else {
                  if (wp.field_d.length < param1 + param0) {
                    wp.field_d = new int[(param0 + param1) * 2];
                    if (qj.field_c == null ||
                      !(param0 <= qj.field_c.length)) {
                      qj.field_c = new boolean[param0 * 2];
                    }
                  } else {
                    if (qj.field_c == null) {
                      qj.field_c = new boolean[param0 * 2];
                    } else {
                      if (param0 > qj.field_c.length) {
                        qj.field_c = new boolean[param0 * 2];
                      }
                    }
                  }
                }
              }
            }
          }
        }
        ae.field_F = 2147483647;
        be.field_c = 0;
        em.field_i = -2147483648;
        uo.field_m = -2147483648;
        db.field_i = 2147483647;
    }

    public static void f(byte param0) {
        int var1 = -26 % ((4 - param0) / 38);
        field_G = null;
    }

    final String a(byte param0) {
        int var2 = 0;
        String var3 = null;
        if (param0 <= -23) {
          var2 = this.field_w.field_m ? 1 : 0;
          this.field_w.field_m = this.field_m;
          var3 = this.field_w.a((byte) -28);
          this.field_w.field_m = var2 != 0 ? true : false;
          return var3;
        }
        return (String) null;
    }

    ei(int param0, int param1, int param2, int param3, qm param4, boolean param5, int param6, int param7, vc param8, int param9, String param10) {
        super(param0, param1, param2, param3, (wo) null, (bi) null);
        boolean stackIn_4_1 = false;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var12_int = 0;
        RuntimeException var12 = null;
        int var13 = 0;
        int var14 = 0;
        try {
          this.field_I = param10;
          this.field_w = param4;
          stackIn_4_1 = (param5);
          this.field_y = stackIn_4_1;
          this.field_H = param9;
          this.field_B = param8;
          this.field_C = param7;
          this.field_z = param6;
          var12_int = -this.field_C + this.field_z;
          var13 = this.field_B.b(param10, var12_int, this.field_B.field_o) + this.field_C * 2;
          if (var13 <= param3) {
            var13 = param3;
          } else {
            this.a(var13, param0, param1, param2, (byte) -52);
          }
          if (!this.field_y) {
            stackIn_10_0 = this.field_C * 2 + this.field_z;
          } else {
            stackIn_10_0 = 0;
          }
          var14 = stackIn_10_0;
          this.field_w.a(-(this.field_C * 2) + param3, var14, (var13 - param3 >> 1) + this.field_C, -this.field_z + param2 - 3 * this.field_C, (byte) -52);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var12 = decompiledCaughtException;
          stackIn_14_0 = var12;
          stackIn_14_1 = new StringBuilder().append("ei.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',');
          if (param8 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param9).append(',');
          if (param10 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    static {
        field_F = 45;
        field_A = 0;
        field_G = "Crazy Crystals";
    }
}
