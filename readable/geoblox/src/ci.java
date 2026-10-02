/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ci {
    private rh field_d;
    private fi field_a;
    private rh field_c;
    private fi field_b;

    final PcmSample c(int param0, String param1) {
        RuntimeException var3 = null;
        PcmSample stackIn_2_0 = null;
        PcmSample stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == -1879044097) {
            stackIn_4_0 = this.a(param1, (int[]) null, param0 ^ -1879044098);
            return stackIn_4_0;
          } else {
            stackIn_2_0 = (PcmSample) null;
            return stackIn_2_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = (RuntimeException) (var3);

          stackIn_7_1 = new StringBuilder().append("ci.B(").append(param0).append(',');

          if (param1 == null) {
            stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
            stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
            stackIn_8_2 = "null";
          } else {
            stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
            stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
            stackIn_8_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final PcmSample b(int param0, String param1) {
        RuntimeException var3 = null;
        PcmSample stackIn_2_0 = null;
        PcmSample stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == 1) {
            stackIn_4_0 = this.a((byte) -90, param1, (int[]) null);
            return stackIn_4_0;
          } else {
            stackIn_2_0 = (PcmSample) null;
            return stackIn_2_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = (RuntimeException) (var3);

          stackIn_7_1 = new StringBuilder().append("ci.A(").append(param0).append(',');

          if (param1 == null) {
            stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
            stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
            stackIn_8_2 = "null";
          } else {
            stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
            stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
            stackIn_8_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final PcmSample a(int param0, int param1, int[] param2) {
        RuntimeException var4 = null;
        PcmSample stackIn_3_0 = null;
        PcmSample stackIn_7_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (1 == this.field_d.a(false)) {
            stackIn_3_0 = this.a(param2, 0, param0, (byte) 14);
            return stackIn_3_0;
          } else {
            if (param1 == this.field_d.c(-9467, param0)) {
              stackIn_7_0 = this.a(param2, param0, 0, (byte) 14);
              return stackIn_7_0;
            } else {
              throw new RuntimeException();
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_11_0 = (RuntimeException) (var4);

          stackIn_11_1 = new StringBuilder().append("ci.J(").append(param0).append(',').append(param1).append(',');

          if (param2 == null) {
            stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
            stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
            stackIn_12_2 = "null";
          } else {
            stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
            stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
            stackIn_12_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(')').toString());
        }
    }

    final PcmSample a(int param0, int[] param1, boolean param2) {
        RuntimeException var4 = null;
        PcmSample stackIn_3_0 = null;
        PcmSample stackIn_7_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_c.a(param2) == 1) {
            stackIn_3_0 = this.a(param1, 97, 0, param0);
            return stackIn_3_0;
          } else {
            if (1 == this.field_c.c(-9467, param0)) {
              stackIn_7_0 = this.a(param1, 125, param0, 0);
              return stackIn_7_0;
            } else {
              throw new RuntimeException();
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_11_0 = (RuntimeException) (var4);

          stackIn_11_1 = new StringBuilder().append("ci.E(").append(param0).append(',');

          if (param1 == null) {
            stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
            stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
            stackIn_12_2 = "null";
          } else {
            stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
            stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
            stackIn_12_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',').append(param2).append(')').toString());
        }
    }

    private final PcmSample a(byte param0, String param1, int[] param2) {
        RuntimeException var4 = null;
        PcmSample stackIn_4_0 = null;
        PcmSample stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -90) {
            this.field_d = (rh) null;
          }
          if (!this.field_c.b((byte) -126, "")) {
            stackIn_6_0 = this.a(param2, "", param1, true);
            return stackIn_6_0;
          } else {
            stackIn_4_0 = this.a(param2, param1, "", true);
            return stackIn_4_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = (RuntimeException) (var4);

          stackIn_9_1 = new StringBuilder().append("ci.F(").append(param0).append(',');

          if (param1 == null) {
            stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
            stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
            stackIn_10_2 = "null";
          } else {
            stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
            stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
            stackIn_10_2 = "{...}";
          }


          stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

          if (param2 == null) {
            stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
            stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
            stackIn_13_2 = "null";
          } else {
            stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
            stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
            stackIn_13_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final static h a(int param0, String param1) {
        RuntimeException var2 = null;
        String var3 = null;
        h stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (ih.field_c.a(-87)) {
            if (!param1.equals(ih.field_c.b(19491))) {
              ih.field_c = bf.a((byte) 86, param1);
            }
          }
          if (param0 != -1) {
            var3 = (String) null;
            ci.a(-30, (String) null);
          }
          stackIn_7_0 = ih.field_c;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_10_0 = (RuntimeException) (var2);

          stackIn_10_1 = new StringBuilder().append("ci.K(").append(param0).append(',');

          if (param1 == null) {
            stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
            stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
            stackIn_11_2 = "null";
          } else {
            stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
            stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
            stackIn_11_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(')').toString());
        }
    }

    private final PcmSample a(int[] param0, String param1, String param2, boolean param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        Object stackIn_7_0 = null;
        PcmSample stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5_int = this.field_c.a((byte) 127, param2);
          if (var5_int >= 0) {
            if (!param3) {
              this.field_c = (rh) null;
            }
            var6 = this.field_c.a(param1, -98, var5_int);
            if (var6 >= 0) {
              stackIn_9_0 = this.a(param0, 98, var5_int, var6);
              return stackIn_9_0;
            } else {
              stackIn_7_0 = null;
              return (PcmSample) ((Object) stackIn_7_0);
            }
          } else {
            return null;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = (RuntimeException) (var5);

          stackIn_12_1 = new StringBuilder().append("ci.H(");

          if (param0 == null) {
            stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
            stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
            stackIn_13_2 = "null";
          } else {
            stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
            stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
            stackIn_13_2 = "{...}";
          }


          stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');

          if (param1 == null) {
            stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
            stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
            stackIn_16_2 = "null";
          } else {
            stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
            stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
            stackIn_16_2 = "{...}";
          }


          stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');

          if (param2 == null) {
            stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
            stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
            stackIn_19_2 = "null";
          } else {
            stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
            stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
            stackIn_19_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',').append(param3).append(')').toString());
        }
    }

    private final PcmSample a(int[] param0, int param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        long var6 = 0L;
        PcmSample var8 = null;
        fg var9 = null;
        PcmSample var10 = null;
        PcmSample stackIn_5_0 = null;
        PcmSample stackIn_16_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5_int = param3 ^ (65533 & param2 << 4 | param2 >>> 12);
          var5_int = var5_int | param2 << 16;
          var6 = (long)var5_int;
          var8 = (PcmSample) ((Object) this.field_b.a(var6, (byte) -74));
          if (param1 <= 19) {
            this.field_c = (rh) null;
          }
          if (var8 != null) {
            stackIn_5_0 = (PcmSample) (var8);
            return stackIn_5_0;
          } else {
            if (param0 != null) {
              if (param0[0] <= 0) {
                return null;
              }
            }
            var9 = fg.a(this.field_c, param2, param3);
            if (var9 != null) {
              var10 = var9.a();
              var8 = var10;
              this.field_b.a((byte) 102, var8, var6);
              if (param0 != null) {
                param0[0] = param0[0] - var10.samples.length;
              }
              stackIn_16_0 = (PcmSample) (var8);
              return stackIn_16_0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_19_0 = (RuntimeException) (var5);

          stackIn_19_1 = new StringBuilder().append("ci.C(");

          if (param0 == null) {
            stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
            stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
            stackIn_20_2 = "null";
          } else {
            stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
            stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
            stackIn_20_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private final PcmSample a(int[] param0, int param1, int param2, byte param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        long var6 = 0L;
        PcmSample var8 = null;
        MusicDecoder var9 = null;
        PcmSample stackIn_2_0 = null;
        PcmSample stackIn_6_0 = null;
        Object stackIn_10_0 = null;
        Object stackIn_14_0 = null;
        Object stackIn_18_0 = null;
        PcmSample stackIn_20_0 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5_int = ((param1 & -1879044097) << 4 | param1 >>> 12) ^ param2;
          var5_int = var5_int | param1 << 16;
          var6 = (long)var5_int ^ 4294967296L;
          var8 = (PcmSample) ((Object) this.field_b.a(var6, (byte) -115));
          if (param3 == 14) {
            if (var8 != null) {
              stackIn_6_0 = (PcmSample) (var8);
              return stackIn_6_0;
            } else {
              if (param0 != null) {
                if (param0[0] <= 0) {
                  stackIn_10_0 = null;
                  return (PcmSample) ((Object) stackIn_10_0);
                }
              }
              var9 = (MusicDecoder) ((Object) this.field_a.a(var6, (byte) -96));
              if (var9 == null) {
                var9 = MusicDecoder.a(this.field_d, param1, param2);
                if (var9 != null) {
                  this.field_a.a((byte) 102, var9, var6);
                } else {
                  stackIn_14_0 = null;
                  return (PcmSample) ((Object) stackIn_14_0);
                }
              }
              var8 = var9.decodePcmBudgeted(param0);
              if (var8 != null) {
                var9.unlinkNode(false);
                this.field_b.a((byte) 102, var8, var6);
                stackIn_20_0 = (PcmSample) (var8);
                return stackIn_20_0;
              } else {
                stackIn_18_0 = null;
                return (PcmSample) ((Object) stackIn_18_0);
              }
            }
          } else {
            stackIn_2_0 = (PcmSample) null;
            return stackIn_2_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_23_0 = (RuntimeException) (var5);

          stackIn_23_1 = new StringBuilder().append("ci.D(");

          if (param0 == null) {
            stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
            stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
            stackIn_24_2 = "null";
          } else {
            stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
            stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
            stackIn_24_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static void a(String[] args, int param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == 416577356) {
            if (gf.field_d != null) {
              gf.field_d.field_K.a((byte) 126, args);
            }
            if (null != vk.field_d) {
              vk.field_d.field_D.a((byte) 126, args);
              return;
            } else {
              return;
            }
          } else {
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_10_0 = (RuntimeException) (var2);

          stackIn_10_1 = new StringBuilder().append("ci.I(");

          if (args == null) {
            stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
            stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
            stackIn_11_2 = "null";
          } else {
            stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
            stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
            stackIn_11_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    private final PcmSample a(String param0, int[] param1, int param2) {
        RuntimeException var4 = null;
        PcmSample stackIn_3_0 = null;
        PcmSample stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_d.b((byte) -120, "")) {
            stackIn_3_0 = this.a(param0, param1, 12628, "");
            return stackIn_3_0;
          } else {
            if (param2 != 1) {
              this.field_a = (fi) null;
            }
            stackIn_7_0 = this.a("", param1, 12628, param0);
            return stackIn_7_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = (RuntimeException) (var4);

          stackIn_10_1 = new StringBuilder().append("ci.L(");

          if (param0 == null) {
            stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
            stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
            stackIn_11_2 = "null";
          } else {
            stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
            stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
            stackIn_11_2 = "{...}";
          }


          stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');

          if (param1 == null) {
            stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
            stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
            stackIn_14_2 = "null";
          } else {
            stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
            stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
            stackIn_14_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',').append(param2).append(')').toString());
        }
    }

    private final PcmSample a(String param0, int[] param1, int param2, String param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        Object stackIn_2_0 = null;
        PcmSample stackIn_5_0 = null;
        Object stackIn_8_0 = null;
        PcmSample stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5_int = this.field_d.a((byte) 127, param3);
          if (0 <= var5_int) {
            if (param2 == 12628) {
              var6 = this.field_d.a(param0, -89, var5_int);
              if (var6 >= 0) {
                stackIn_10_0 = this.a(param1, var5_int, var6, (byte) 14);
                return stackIn_10_0;
              } else {
                stackIn_8_0 = null;
                return (PcmSample) ((Object) stackIn_8_0);
              }
            } else {
              stackIn_5_0 = (PcmSample) null;
              return stackIn_5_0;
            }
          } else {
            stackIn_2_0 = null;
            return (PcmSample) ((Object) stackIn_2_0);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = (RuntimeException) (var5);

          stackIn_13_1 = new StringBuilder().append("ci.G(");

          if (param0 == null) {
            stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
            stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
            stackIn_14_2 = "null";
          } else {
            stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
            stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
            stackIn_14_2 = "{...}";
          }


          stackIn_16_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',');

          if (param1 == null) {
            stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
            stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
            stackIn_17_2 = "null";
          } else {
            stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
            stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
            stackIn_17_2 = "{...}";
          }


          stackIn_19_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',').append(param2).append(',');

          if (param3 == null) {
            stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
            stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
            stackIn_20_2 = "null";
          } else {
            stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
            stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
            stackIn_20_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(')').toString());
        }
    }

    ci(rh param0, rh param1) {
        this.field_a = new fi(256);
        this.field_b = new fi(256);
        try {
            this.field_c = param0;
            this.field_d = param1;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "ci.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
