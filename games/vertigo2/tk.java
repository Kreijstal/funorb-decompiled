/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class tk {
    static ba field_n;
    static cc field_c;
    ak field_b;
    static boolean field_e;
    ak field_a;
    static String field_p;
    ak field_d;
    ak field_g;
    ed field_f;
    int field_o;
    long field_k;
    volatile int field_j;
    byte field_l;
    ed field_i;
    volatile int field_m;
    ia field_h;

    final static int c(int param0) {
        if (param0 != 1) {
          field_e = false;
          return 1;
        }
        return 1;
    }

    abstract void a(Object param0, boolean param1, int param2);

    final static void a(int param0, int param1, int param2, double param3, double param4) {
        nj discarded$20 = null;
        nj discarded$19 = null;
        nj discarded$18 = null;
        nj discarded$12 = null;
        nj discarded$13 = null;
        nj discarded$17 = null;
        nj discarded$16 = null;
        nj discarded$14 = null;
        nj discarded$15 = null;
        int var8;
        var8 = Vertigo2.field_L ? 1 : 0;
        if (ir.field_d != 0) {
          if (param2 == 0) {
            s.field_t = null;
            if (param0 != -1) {
              field_p = (String) null;
            }
            ir.field_d = param2;
            il.field_e = param3;
            if (0 == bq.field_E &&
              param1 > 0) {
              discarded$20 = new nj();
            } else {
              if (param1 != 0) {
              }
            }
          } else {
            if (param0 != -1) {
              field_p = (String) null;
              ir.field_d = param2;
              il.field_e = param3;
              if (0 == bq.field_E &&
                param1 > 0) {
                discarded$19 = new nj();
              } else {
                if (param1 != 0) {
                }
              }
            } else {
              ir.field_d = param2;
              il.field_e = param3;
              if (0 == bq.field_E &&
                param1 > 0) {
                discarded$18 = new nj();
                bq.field_E = param1;
                wo.field_S = param4;
                return;
              }
              if (param1 == 0) {
              }
            }
          }
        } else {
          if (param2 > 0) {
            s.field_t = new nj();
            if (param0 == -1) {
              ir.field_d = param2;
              il.field_e = param3;
              if (0 == bq.field_E &&
                param1 > 0) {
                discarded$12 = new nj();
                bq.field_E = param1;
                wo.field_S = param4;
                return;
              }
            } else {
              field_p = (String) null;
              ir.field_d = param2;
              il.field_e = param3;
              if (0 == bq.field_E &&
                param1 > 0) {
                discarded$13 = new nj();
                bq.field_E = param1;
                wo.field_S = param4;
                return;
              }
            }
            if (param1 != 0) {
            }
          } else {
            if (param2 == 0) {
              s.field_t = null;
              if (param0 != -1) {
                field_p = (String) null;
                ir.field_d = param2;
                il.field_e = param3;
                if (0 == bq.field_E &&
                  param1 > 0) {
                  discarded$17 = new nj();
                } else {
                  if (param1 != 0) {
                  }
                }
              } else {
                ir.field_d = param2;
                il.field_e = param3;
                if (0 == bq.field_E &&
                  param1 > 0) {
                  discarded$16 = new nj();
                  bq.field_E = param1;
                  wo.field_S = param4;
                  return;
                }
                if (param1 == 0) {
                }
              }
            } else {
              if (param0 == -1) {
                ir.field_d = param2;
                il.field_e = param3;
                if (0 == bq.field_E &&
                  param1 > 0) {
                  discarded$14 = new nj();
                  bq.field_E = param1;
                  wo.field_S = param4;
                  return;
                }
              } else {
                field_p = (String) null;
                ir.field_d = param2;
                il.field_e = param3;
                if (0 == bq.field_E &&
                  param1 > 0) {
                  discarded$15 = new nj();
                  bq.field_E = param1;
                  wo.field_S = param4;
                  return;
                }
              }
              if (param1 != 0) {
              }
            }
          }
        }
        bq.field_E = param1;
        wo.field_S = param4;
    }

    final static boolean c(byte param0) {
        if (param0 >= -28) {
          return false;
        }
        if (hn.field_w < 10) {
          return false;
        }
        if (qc.field_A >= 13) {
          return true;
        }
        return false;
    }

    public static void a(byte param0) {
        field_n = null;
        if (param0 <= 46) {
          field_n = (ba) null;
          field_p = null;
          field_c = null;
          return;
        }
        field_p = null;
        field_c = null;
    }

    final static byte[] a(String param0, boolean param1) {
        RuntimeException var2 = null;
        byte[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1) {
            field_p = (String) null;
          }
          stackIn_3_0 = re.field_a.a("", param0, 0);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("tk.N(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    static int a(int param0, int param1) {
        return param0 ^ param1;
    }

    final ia a(int param0, int param1, boolean param2, byte param3, boolean param4) {
        ia stackIn_3_0 = null;
        boolean stackIn_4_1 = false;
        ia stackIn_16_0 = null;
        boolean stackIn_17_1 = false;
        long var6;
        ia var8;
        long var6Lifetime1;
        ia var8Lifetime1;
        if (!param4) {
          var6 = ((long)param1 << 32) + (long)param0;
          var8 = new ia();
          var8.field_B = param3;
          var8.field_n = var6;
          stackIn_16_0 = var8;
          stackIn_17_1 = (!param2) ? false : true;
          stackIn_16_0.field_u = stackIn_17_1;
          if (!param2) {
            if (this.b(-1) >= 20) {
              throw new RuntimeException();
            }
            this.field_d.a(param4, var8);
            return var8;
          }
          if (this.d((byte) -70) >= 20) {
            throw new RuntimeException();
          }
          this.field_b.a(false, var8);
          return var8;
        }
        field_c = (cc) null;
        var6Lifetime1 = ((long)param1 << 32) + (long)param0;
        var8Lifetime1 = new ia();
        var8Lifetime1.field_B = param3;
        var8Lifetime1.field_n = var6Lifetime1;
        stackIn_3_0 = var8Lifetime1;
        stackIn_4_1 = (!param2) ? false : true;
        stackIn_3_0.field_u = stackIn_4_1;
        if (!param2) {
          if (this.b(-1) >= 20) {
            throw new RuntimeException();
          }
          this.field_d.a(param4, var8Lifetime1);
          return var8Lifetime1;
        }
        if (this.d((byte) -70) >= 20) {
          throw new RuntimeException();
        }
        this.field_b.a(false, var8Lifetime1);
        return var8Lifetime1;
    }

    abstract void e(int param0);

    abstract boolean d(int param0);

    final int b(int param0) {
        if (param0 != -1) {
          return -12;
        }
        return this.field_d.a((byte) 82) + this.field_g.a((byte) 89);
    }

    final int d(byte param0) {
        int var2 = -71 / ((-5 - param0) / 62);
        return this.field_b.a((byte) 78) + this.field_a.a((byte) 60);
    }

    abstract void b(byte param0);

    final boolean a(int param0) {
        if (param0 == 20) {
          return this.d((byte) -127) >= 20 ? true : false;
        }
        tk.a((byte) 29);
        return this.d((byte) -127) >= 20 ? true : false;
    }

    final boolean f(int param0) {
        if (param0 != 6) {
          return true;
        }
        return this.b(-1) >= 20 ? true : false;
    }

    tk() {
        this.field_b = new ak();
        this.field_a = new ak();
        this.field_d = new ak();
        this.field_g = new ak();
        this.field_f = new ed(6);
        this.field_l = (byte) 0;
        this.field_m = 0;
        this.field_j = 0;
        this.field_i = new ed(10);
    }

    static {
        field_n = new ba();
        field_p = "Unfortunately your configuration doesn't support fullscreen mode.";
    }
}
