/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sb extends aa {
    private int field_k;
    private int field_g;
    private String field_o;
    private boolean field_h;
    static le field_m;
    private int field_j;
    private int field_p;
    private int field_i;
    static int field_f;
    static vk field_r;
    static long field_e;
    static int[] field_l;
    static String field_q;
    private ta field_d;
    static char[] field_n;

    private final be a(ta param0, int param1, int param2, String param3) {
        be var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        be var7 = null;
        be stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var6 = -30 / ((62 - param2) / 35);
          var7 = new be(-param0.field_C + param1, param0.field_D + param1, param3.length());
          var5 = var7;
          this.field_c = new be[]{var7};
          stackIn_1_0 = var5;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_4_0 = var5_ref;
          stackIn_4_1 = new StringBuilder().append("sb.P(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final static int a(byte param0, int param1) {
        int stackIn_5_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_19_0 = 0;
        String var3;
        param1 = param1 & 8191;
        if (param0 == 79) {
          if (param1 >= 4096) {
            if (param1 < 6144) {
              stackIn_19_0 = -tj.field_b[param1 - 4096];
            } else {
              stackIn_19_0 = -tj.field_b[-param1 + 8192];
            }
            return stackIn_19_0;
          }
          if (2048 <= param1) {
            stackIn_15_0 = tj.field_b[-param1 + 4096];
          } else {
            stackIn_15_0 = tj.field_b[param1];
          }
          return stackIn_15_0;
        }
        var3 = (String) null;
        sb.a(-19, (String) null);
        if (param1 >= 4096) {
          if (param1 < 6144) {
            stackIn_9_0 = -tj.field_b[param1 - 4096];
          } else {
            stackIn_9_0 = -tj.field_b[-param1 + 8192];
          }
          return stackIn_9_0;
        }
        if (2048 <= param1) {
          stackIn_5_0 = tj.field_b[-param1 + 4096];
        } else {
          stackIn_5_0 = tj.field_b[param1];
        }
        return stackIn_5_0;
    }

    final void a(byte param0, ta param1, String param2, int param3, int param4) {
        be var8 = null;
        be var9 = null;
        if (param2 == null) {
          this.field_c = null;
          return;
        }
        if (param1 == this.field_d &&
          this.field_h &&
          2 == this.field_g &&
          this.field_o != null &&
          this.field_o.equals(param2)) {
          return;
        }
        try {
          this.field_o = param2;
          this.field_g = 2;
          this.field_h = true;
          if (param0 != -82) {
            field_e = 20L;
          }
          this.field_d = param1;
          var8 = this.a(param1, param3, 106, param2);
          var9 = var8;
          var9.field_c[0] = -param1.a(param2) + param4;
          var9.field_c[param2.length()] = param4;
          dk.a(param2, 0, -25006, var9, param1);
        } catch (RuntimeException runtimeException) {
          throw la.a((Throwable) ((Object) runtimeException), "sb.M(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void a(byte param0, boolean param1) {
        if (param1) {
          b.field_j[1] = new int[]{1, 11, 12, 4, 3, 6};
          if (param0 <= 24) {
            sb.a((byte) -119, -113);
            return;
          }
          return;
        }
        b.field_j[1] = new int[]{1, 11, 12, 3, 6};
        if (param0 <= 24) {
          sb.a((byte) -119, -113);
          return;
        }
    }

    final void a(int param0, int param1, String param2, int param3, ta param4, int param5, int param6, int param7) {
        be stackIn_38_0;
        be stackIn_38_1;
        int stackIn_38_2;
        int stackIn_38_3;
        be stackIn_39_0 = null;
        be stackIn_39_1 = null;
        int stackIn_39_4 = 0;
        String stackIn_42_0 = null;
        int stackIn_43_1 = 0;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        String stackIn_49_2 = null;
        StringBuilder stackIn_51_1 = null;
        String stackIn_52_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        String var13 = null;
        be var14 = null;
        int var15 = 0;
        ta var16 = null;
        String[] var17 = null;
        String[] var18 = null;
        int var12Lifetime1;
        var15 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          if (0 == param1) {
            param1 = param4.field_t;
          }
          if (param2 == null) {
            this.field_c = null;
            return;
          }
          if (param4 == this.field_d &&
            !this.field_h &&
            param7 == this.field_g &&
            this.field_p == param3 &&
            this.field_j == param1 &&
            param5 == this.field_k &&
            param0 == this.field_i &&
            this.field_o != null &&
            this.field_o.equals(param2)) {
            return;
          }
          this.field_d = param4;
          this.field_o = param2;
          this.field_g = param7;
          this.field_k = param5;
          this.field_i = param0;
          this.field_p = param3;
          this.field_j = param1;
          this.field_h = false;
          var17 = new String[param4.a(param2, param0) + 1];
          var18 = var17;
          if (param6 != 4476) {
            var16 = (ta) null;
            this.a((String) null, 49, 18, (ta) null, 83);
          }
          var10 = Math.max(1, param4.a(param2, new int[]{param0}, var18));
          if (this.field_p == 3 &&
            var10 == 1) {
            this.field_p = 1;
          }
          this.field_c = new be[var10];
          if (this.field_p != 0) {
            if (this.field_p != 1) {
              if (this.field_p == 2) {
                var11 = this.field_k - (param4.field_D + var10 * this.field_j);
              } else {
                var12 = (-(var10 * this.field_j) + this.field_k) / (var10 + 1);
                if (var12 < 0) {
                  var12 = 0;
                }
                this.field_j = this.field_j + var12;
                var11 = var12 + param4.field_C;
              }
            } else {
              var11 = param4.field_C + (-(var10 * this.field_j) + this.field_k >> 1);
            }
          } else {
            var11 = param4.field_C;
          }
          for (var12Lifetime1 = 0; var10 > var12Lifetime1; var12Lifetime1++) {
            var13 = var17[var12Lifetime1];
            stackIn_38_0 = null;
            stackIn_38_1 = null;
            stackIn_38_2 = var11 - param4.field_C;
            stackIn_38_3 = var11 + param4.field_D;
            if (var13 != null) {
              stackIn_39_0 = null;
              stackIn_39_1 = null;
              stackIn_39_4 = var13.length();
            } else {
              stackIn_39_0 = null;
              stackIn_39_1 = null;
              stackIn_39_4 = 0;
            }
            var14 = new be(stackIn_38_2, stackIn_38_3, stackIn_39_4);
            var14.field_c[0] = 0;
            if (var13 != null) {
              var14.field_c[var13.length()] = param4.a(var13);
              stackIn_42_0 = var13;
              if (3 != param7) {
                stackIn_43_1 = 0;
              } else {
                stackIn_43_1 = this.a(param0, var13, param4.a(var13), (byte) -79);
              }
              dk.a(stackIn_42_0, stackIn_43_1, -25006, var14, param4);
            }
            var11 = var11 + param1;
            this.field_c[var12Lifetime1] = var14;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_48_0 = var9;
          stackIn_48_1 = new StringBuilder().append("sb.S(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_49_2 = "null";
          } else {
            stackIn_49_2 = "{...}";
          }
          stackIn_51_1 = ((StringBuilder) (Object) stackIn_48_1).append(stackIn_49_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_52_2 = "null";
          } else {
            stackIn_52_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_48_0), ((StringBuilder) (Object) stackIn_51_1).append(stackIn_52_2).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(')').toString());
        }
    }

    final void a(String param0, int param1, int param2, ta param3, int param4) {
        be discarded$0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        int var7 = 0;
        String var8 = null;
        be var9 = null;
        try {
          if (param0 == null) {
            this.field_c = null;
            return;
          }
          if (this.field_d == param3 &&
            this.field_h &&
            this.field_g == 1 &&
            this.field_o != null &&
            this.field_o.equals(param0)) {
            return;
          }
          this.field_g = 1;
          this.field_h = true;
          if (param2 != -2713) {
            var8 = (String) null;
            discarded$0 = this.a((ta) null, 24, -22, (String) null);
          }
          this.field_d = param3;
          var9 = this.a(param3, param4, 124, param0);
          var7 = param3.a(param0);
          var9.field_c[0] = -(var7 >> 1) + param1;
          var9.field_c[param0.length()] = param1 + (var7 >> 1);
          dk.a(param0, 0, -25006, var9, param3);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_16_0 = var6;
          stackIn_16_1 = new StringBuilder().append("sb.Q(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param4).append(')').toString());
        }
    }

    final void a(String param0, int param1, int param2, ta param3, byte param4) {
        be var7 = null;
        be var8 = null;
        if (param0 == null) {
          this.field_c = null;
          return;
        }
        if (param3 == this.field_d &&
          this.field_h &&
          this.field_g == 0 &&
          this.field_o != null &&
          this.field_o.equals(param0)) {
          return;
        }
        try {
          this.field_g = 0;
          this.field_d = param3;
          this.field_o = param0;
          this.field_h = true;
          var7 = this.a(param3, param1, -45, param0);
          var8 = var7;
          var7.field_c[0] = param2;
          var8.field_c[param0.length()] = param3.a(param0) + param2;
          if (param4 <= 66) {
            this.field_h = false;
          }
          dk.a(param0, 0, -25006, var8, param3);
        } catch (RuntimeException runtimeException) {
          throw la.a((Throwable) ((Object) runtimeException), "sb.O(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    final static am a(int param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String var3 = null;
        String var4 = null;
        am var5 = null;
        am stackIn_4_0 = null;
        am stackIn_7_0 = null;
        am stackIn_10_0 = null;
        am stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != null &&
            0 != param1.length()) {
            var2_int = param1.indexOf('@');
            if (var2_int == -1) {
              stackIn_7_0 = si.field_s;
              return stackIn_7_0;
            }
            var3 = param1.substring(0, var2_int);
            var4 = param1.substring(1 + var2_int);
            var5 = dd.a(var3, false);
            if (var5 != null) {
              stackIn_10_0 = var5;
              return stackIn_10_0;
            }
            if (param0 != 28079) {
              field_f = 55;
            }
            stackIn_14_0 = ne.a(var4, (byte) -98);
            return stackIn_14_0;
          }
          stackIn_4_0 = qb.field_a;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_17_0 = var2;
          stackIn_17_1 = new StringBuilder().append("sb.N(").append(param0).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    public static void d(int param0) {
        if (param0 != 12817) {
          return;
        }
        field_q = null;
        field_r = null;
        field_l = null;
        field_m = null;
        field_n = null;
    }

    final static void b(int param0, int param1, int param2) {
        String var4;
        String var4Lifetime1;
        if (null == nc.field_b) {
          nc.field_b = new int[2 * param2];
        } else {
          if (param2 > nc.field_b.length) {
            nc.field_b = new int[2 * param2];
            if (gi.field_e == null) {
              gi.field_e = new int[param2 * 2];
              if (param0 != 2) {
                var4 = (String) null;
                sb.a(-117, (String) null);
              }
              if (jc.field_a == null ||
                !(jc.field_a.length >= param2)) {
                jc.field_a = new int[param2 * 2];
              }
              if (null == hf.field_c ||
                !(param2 <= hf.field_c.length)) {
                hf.field_c = new int[2 * param2];
              }
              if (null == rb.field_fb ||
                !(param2 <= rb.field_fb.length)) {
                rb.field_fb = new int[param2 * 2];
              }
              if (cj.field_c == null ||
                !(param2 <= cj.field_c.length)) {
                cj.field_c = new int[param2 * 2];
              }
              if (hl.field_f == null ||
                !(hl.field_f.length >= param1 + param2)) {
                hl.field_f = new int[(param2 + param1) * 2];
              }
              if (null == gb.field_h ||
                !(gb.field_h.length >= param2)) {
                gb.field_h = new boolean[param2 * 2];
              }
            } else {
              if (gi.field_e.length >= param2) {
                if (param0 != 2) {
                  var4 = (String) null;
                  sb.a(-117, (String) null);
                }
                if (jc.field_a == null ||
                  !(jc.field_a.length >= param2)) {
                  jc.field_a = new int[param2 * 2];
                }
                if (null == hf.field_c ||
                  !(param2 <= hf.field_c.length)) {
                  hf.field_c = new int[2 * param2];
                }
                if (null == rb.field_fb ||
                  !(param2 <= rb.field_fb.length)) {
                  rb.field_fb = new int[param2 * 2];
                }
                if (cj.field_c == null ||
                  !(param2 <= cj.field_c.length)) {
                  cj.field_c = new int[param2 * 2];
                }
                if (hl.field_f == null ||
                  !(hl.field_f.length >= param1 + param2)) {
                  hl.field_f = new int[(param2 + param1) * 2];
                }
                if (null == gb.field_h ||
                  !(gb.field_h.length >= param2)) {
                  gb.field_h = new boolean[param2 * 2];
                }
              } else {
                gi.field_e = new int[param2 * 2];
                if (param0 != 2) {
                  var4 = (String) null;
                  sb.a(-117, (String) null);
                }
                if (jc.field_a == null ||
                  !(jc.field_a.length >= param2)) {
                  jc.field_a = new int[param2 * 2];
                }
                if (null == hf.field_c ||
                  !(param2 <= hf.field_c.length)) {
                  hf.field_c = new int[2 * param2];
                }
                if (null == rb.field_fb ||
                  !(param2 <= rb.field_fb.length)) {
                  rb.field_fb = new int[param2 * 2];
                }
                if (cj.field_c == null ||
                  !(param2 <= cj.field_c.length)) {
                  cj.field_c = new int[param2 * 2];
                }
                if (hl.field_f == null ||
                  !(hl.field_f.length >= param1 + param2)) {
                  hl.field_f = new int[(param2 + param1) * 2];
                }
                if (null == gb.field_h ||
                  !(gb.field_h.length >= param2)) {
                  gb.field_h = new boolean[param2 * 2];
                }
              }
            }
            rh.field_C = 2147483647;
            kj.field_G = -2147483648;
            fe.field_g = -2147483648;
            ah.field_j = 2147483647;
            fd.field_n = 0;
            return;
          }
        }
        if (gi.field_e == null ||
          !(gi.field_e.length >= param2)) {
          gi.field_e = new int[param2 * 2];
        }
        if (param0 != 2) {
          var4Lifetime1 = (String) null;
          sb.a(-117, (String) null);
          if (jc.field_a == null ||
            !(jc.field_a.length >= param2)) {
            jc.field_a = new int[param2 * 2];
          }
          if (null == hf.field_c ||
            !(param2 <= hf.field_c.length)) {
            hf.field_c = new int[2 * param2];
          }
          if (null == rb.field_fb ||
            !(param2 <= rb.field_fb.length)) {
            rb.field_fb = new int[param2 * 2];
          }
          if (cj.field_c == null ||
            !(param2 <= cj.field_c.length)) {
            cj.field_c = new int[param2 * 2];
          }
          if (hl.field_f == null) {
            hl.field_f = new int[(param2 + param1) * 2];
            if (null == gb.field_h ||
              !(gb.field_h.length >= param2)) {
              gb.field_h = new boolean[param2 * 2];
            }
          } else {
            if (hl.field_f.length >= param1 + param2) {
              if (null == gb.field_h ||
                !(gb.field_h.length >= param2)) {
                gb.field_h = new boolean[param2 * 2];
              }
            } else {
              hl.field_f = new int[(param2 + param1) * 2];
              if (null == gb.field_h ||
                !(gb.field_h.length >= param2)) {
                gb.field_h = new boolean[param2 * 2];
              }
            }
          }
        } else {
          if (jc.field_a == null ||
            !(jc.field_a.length >= param2)) {
            jc.field_a = new int[param2 * 2];
          }
          if (null == hf.field_c ||
            !(param2 <= hf.field_c.length)) {
            hf.field_c = new int[2 * param2];
          }
          if (null == rb.field_fb ||
            !(param2 <= rb.field_fb.length)) {
            rb.field_fb = new int[param2 * 2];
          }
          if (cj.field_c == null) {
            cj.field_c = new int[param2 * 2];
            if (hl.field_f == null) {
              hl.field_f = new int[(param2 + param1) * 2];
              if (null == gb.field_h ||
                !(gb.field_h.length >= param2)) {
                gb.field_h = new boolean[param2 * 2];
              }
            } else {
              if (hl.field_f.length >= param1 + param2) {
                if (null == gb.field_h ||
                  !(gb.field_h.length >= param2)) {
                  gb.field_h = new boolean[param2 * 2];
                }
              } else {
                hl.field_f = new int[(param2 + param1) * 2];
                if (null == gb.field_h ||
                  !(gb.field_h.length >= param2)) {
                  gb.field_h = new boolean[param2 * 2];
                }
              }
            }
          } else {
            if (param2 <= cj.field_c.length) {
              if (hl.field_f == null) {
                hl.field_f = new int[(param2 + param1) * 2];
                if (null == gb.field_h ||
                  !(gb.field_h.length >= param2)) {
                  gb.field_h = new boolean[param2 * 2];
                }
              } else {
                if (hl.field_f.length >= param1 + param2) {
                  if (null == gb.field_h ||
                    !(gb.field_h.length >= param2)) {
                    gb.field_h = new boolean[param2 * 2];
                  }
                } else {
                  hl.field_f = new int[(param2 + param1) * 2];
                  if (null == gb.field_h ||
                    !(gb.field_h.length >= param2)) {
                    gb.field_h = new boolean[param2 * 2];
                  }
                }
              }
            } else {
              cj.field_c = new int[param2 * 2];
              if (hl.field_f == null) {
                hl.field_f = new int[(param2 + param1) * 2];
                if (null == gb.field_h ||
                  !(gb.field_h.length >= param2)) {
                  gb.field_h = new boolean[param2 * 2];
                }
              } else {
                if (hl.field_f.length >= param1 + param2) {
                  if (null == gb.field_h ||
                    !(gb.field_h.length >= param2)) {
                    gb.field_h = new boolean[param2 * 2];
                  }
                } else {
                  hl.field_f = new int[(param2 + param1) * 2];
                  if (null == gb.field_h ||
                    !(gb.field_h.length >= param2)) {
                    gb.field_h = new boolean[param2 * 2];
                  }
                }
              }
            }
          }
        }
        rh.field_C = 2147483647;
        kj.field_G = -2147483648;
        fe.field_g = -2147483648;
        ah.field_j = 2147483647;
        fd.field_n = 0;
    }

    public sb() {
    }

    static {
        field_m = new le(480, 480);
        field_f = -1;
        field_l = new int[8192];
        field_q = "Unfortunately we are unable to create an account for you at this time.";
        field_n = new char[]{(char)8364, (char)0, (char)8218, (char)402, (char)8222, (char)8230, (char)8224, (char)8225, (char)710, (char)8240, (char)352, (char)8249, (char)338, (char)0, (char)381, (char)0, (char)0, (char)8216, (char)8217, (char)8220, (char)8221, (char)8226, (char)8211, (char)8212, (char)732, (char)8482, (char)353, (char)8250, (char)339, (char)0, (char)382, (char)376};
    }

    /* Full JVM integer arguments; original narrow signature preserved. */
    final static void $cfr$intArgs$a$7ffe4b125357(int param0, boolean param1) {
        if (param1) {
          b.field_j[1] = new int[]{1, 11, 12, 4, 3, 6};
          if (param0 <= 24) {
            sb.a((byte) -119, -113);
            return;
          }
          return;
        }
        b.field_j[1] = new int[]{1, 11, 12, 3, 6};
        if (param0 <= 24) {
          sb.a((byte) -119, -113);
          return;
        }
    }
}
