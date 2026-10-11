/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class se extends li implements ho {
    static long field_f;
    static String field_g;
    private ga field_h;

    final static void a(byte param0, boolean param1, int param2) {
        fa.a(gj.field_m, go.field_l, true, param1, r.field_m ? 280 : 480, 5, 20, 15, 26, 240, h.field_d, af.field_c, 0, param2, r.field_m ? 240 : 320, 20, 17);
        int var3 = -117 / ((param0 + 6) / 42);
    }

    public static void d(byte param0) {
        field_g = null;
        if (param0 > -23) {
          field_g = (String) null;
        }
    }

    final String a(boolean param0) {
        if (param0) {
          return (String) null;
        }
        return this.a(this.field_h.field_o, 114);
    }

    final oi b(int param0) {
        if (param0 != 51) {
          return (oi) null;
        }
        return this.a(this.field_h.field_o, (byte) -122);
    }

    final static int a(int param0, byte param1) {
        int var3 = CrazyCrystals.field_B;
        ci.field_k = null;
        jh.field_e = 0;
        so.field_c = null;
        int var2 = cb.field_m;
        if (param1 > -99) {
          se.a(-41, (byte) -4);
          cb.field_m = CrazyCrystals.field_D;
          oi.field_d.field_j = oi.field_d.field_j + 1;
          CrazyCrystals.field_D = var2;
          if (param0 == 51) {
            oi.field_d.field_p = 2;
            if (oi.field_d.field_j < 2) {
              if (oi.field_d.field_j < 2) {
                if (4 > oi.field_d.field_j) {
                  return -1;
                }
                return 1;
              }
              if (param0 != 50) {
                if (4 <= oi.field_d.field_j) {
                  return 1;
                }
                return -1;
              }
              return 5;
            }
            if (param0 != 51) {
              if (oi.field_d.field_j >= 2 &&
                param0 == 50) {
                return 5;
              }
              if (4 <= oi.field_d.field_j) {
                return 1;
              }
              return -1;
            }
            return 2;
          }
          if (50 != param0) {
            oi.field_d.field_p = 1;
            if (oi.field_d.field_j < 2) {
              if (oi.field_d.field_j >= 2 &&
                param0 == 50) {
                return 5;
              }
              if (4 <= oi.field_d.field_j) {
                return 1;
              }
              return -1;
            }
            if (param0 != 51) {
              if (oi.field_d.field_j >= 2 &&
                param0 == 50) {
                return 5;
              }
              if (4 <= oi.field_d.field_j) {
                return 1;
              }
              return -1;
            }
            return 2;
          }
          oi.field_d.field_p = 5;
          if (oi.field_d.field_j < 2) {
            if (oi.field_d.field_j >= 2 &&
              param0 == 50) {
              return 5;
            }
            if (4 <= oi.field_d.field_j) {
              return 1;
            }
            return -1;
          }
          if (param0 != 51) {
            if (oi.field_d.field_j >= 2 &&
              param0 == 50) {
              return 5;
            }
            if (4 <= oi.field_d.field_j) {
              return 1;
            }
            return -1;
          }
          return 2;
        }
        cb.field_m = CrazyCrystals.field_D;
        oi.field_d.field_j = oi.field_d.field_j + 1;
        CrazyCrystals.field_D = var2;
        if (param0 == 51) {
          oi.field_d.field_p = 2;
          if (oi.field_d.field_j >= 2 &&
            param0 == 51) {
            return 2;
          }
          if (oi.field_d.field_j >= 2 &&
            param0 == 50) {
            return 5;
          }
          if (4 <= oi.field_d.field_j) {
            return 1;
          }
          return -1;
        }
        if (50 != param0) {
          oi.field_d.field_p = 1;
          if (oi.field_d.field_j >= 2 &&
            param0 == 51) {
            return 2;
          }
          if (oi.field_d.field_j >= 2 &&
            param0 == 50) {
            return 5;
          }
          if (4 <= oi.field_d.field_j) {
            return 1;
          }
          return -1;
        }
        oi.field_d.field_p = 5;
        if (oi.field_d.field_j >= 2 &&
          param0 == 51) {
          return 2;
        }
        if (oi.field_d.field_j >= 2 &&
          param0 == 50) {
          return 5;
        }
        if (4 <= oi.field_d.field_j) {
          return 1;
        }
        return -1;
    }

    abstract String a(String param0, int param1);

    public final boolean a(byte param0) {
        if (param0 != -41) {
          ga var3 = (ga) null;
          this.a((ga) null, -13);
          if (this.field_h.field_o != null) {
            return 0 == this.field_h.field_o.length() ? true : false;
          }
          return true;
        }
        if (this.field_h.field_o == null) {
          return true;
        }
        if (0 != this.field_h.field_o.length()) {
          return false;
        }
        return true;
    }

    abstract oi a(String param0, byte param1);

    public final void a(int param0, ga param1) {
        try {
          int var3_int = -104 / ((param0 + 20) / 46);
        } catch (RuntimeException runtimeException) {
          throw dn.a((Throwable) ((Object) runtimeException), "se.U(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    se(ga param0) {
        try {
          this.field_h = param0;
        } catch (RuntimeException runtimeException) {
          throw dn.a((Throwable) ((Object) runtimeException), "se.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final void a(ga param0, int param1) {
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param1 != -29513) {
            field_f = -69L;
            this.b((byte) 78);
          } else {
            this.b((byte) 78);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("se.DA(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_g = "Done";
    }
}
