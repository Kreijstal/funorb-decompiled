/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jd extends gb {
    private int field_o;
    static volatile boolean field_p;
    private r field_n;

    final int l(int param0) {
        int fieldTemp$1 = 0;
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 27310) {
            stackIn_2_0 = -26;
            return stackIn_2_0;
          }
          fieldTemp$1 = this.field_m;
          this.field_m = this.field_m + 1;
          stackIn_4_0 = this.field_l[fieldTemp$1] - this.field_n.a((byte) 7) & 255;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fc.a((Throwable) ((Object) var2), "jd.F(" + param0 + ')');
        }
    }

    final static void a(int param0, boolean param1, boolean param2, uh param3, int param4) {
        byte dupTemp$0 = 0;
        boolean stackIn_10_0 = false;
        int stackIn_24_0 = 0;
        int stackIn_25_1 = 0;
        int stackIn_36_0 = 0;
        int stackIn_36_1 = 0;
        int stackIn_45_0 = 0;
        RuntimeException stackIn_62_0 = null;
        StringBuilder stackIn_62_1 = null;
        String stackIn_63_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_9_0;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int stackIn_36_0Lifetime1;
        int stackIn_36_1Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var12Lifetime1;
        int var13Lifetime1;
        var19 = SolKnight.field_L ? 1 : 0;
        try {
          var5_int = wi.b(84, 3 * (param0 - param4));
          var6 = param4 * 3;
          var7 = -10 + var5_int;
          we.a(100);
          if (0 < param3.field_j &&
            param3.field_k != null) {
            ja.a(0);
          }
          cf.field_c = 0;
          var8 = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (!(param3.field_F > var8)))) {
            var9 = param3.field_K[var8];
            var10 = param3.field_o[var8];
            var11 = param3.field_w[var8];
            stackOut_9_0 = param2;
            stackIn_45_0 = stackOut_9_0 ? 1 : 0;
            stackIn_10_0 = stackOut_9_0;
            if (var19 == 0) {
              if (stackIn_10_0) {
                var12 = qb.field_ab[var9];
                var13 = a.field_d[var9];
                var14 = -var12 + qb.field_ab[var10];
                var15 = -var12 + qb.field_ab[var11];
                var16 = a.field_d[var10] - var13;
                var17 = a.field_d[var11] - var13;
              }
              if (!stackIn_10_0 ||
                -(var15 * var16) + var17 * var14 < 0) {
                var12Lifetime1 = hl.field_a[var9];
                if (var12Lifetime1 != -2147483648) {
                  var13Lifetime1 = hl.field_a[var10];
                  if (-2147483648 != var13Lifetime1) {
                    var14 = hl.field_a[var11];
                    if (var14 != -2147483648) {
                      var15 = -var6 + (var13Lifetime1 + var12Lifetime1) + var14;
                      stackIn_24_0 = fb.field_b.length - 1;
                      if (var7 < 0) {
                        stackIn_25_1 = var15 << -var7;
                      } else {
                        stackIn_25_1 = var15 >> var7;
                      }
                      var16 = stackIn_24_0 - stackIn_25_1;
                      var17 = fb.field_b[var16];
                      while (true) {
                        if (var17 >> 4 != 0) {
                          var16--;
                          stackIn_36_0 = -1;
                          stackIn_36_1 = ~var16;
                          if (stackIn_36_0 < stackIn_36_1) {
                            System.err.println("Out of range!");
                            break;
                          }
                          var17 = fb.field_b[var16];
                          continue;
                        }
                        stackIn_36_0Lifetime1 = var16 << 4;
                        stackIn_36_1Lifetime1 = var17;
                        var18 = stackIn_36_0Lifetime1 + stackIn_36_1Lifetime1;
                        he.field_a[var18] = var8;
                        fb.field_b[var16] = 1 + var17;
                        if (param3.field_j > 0 &&
                          null != param3.field_k) {
                          dupTemp$0 = param3.field_k[var8];
                          md.field_t[dupTemp$0] = md.field_t[dupTemp$0] + 1;
                        }
                        cf.field_c = cf.field_c + 1;
                        break;
                      }
                    }
                  }
                }
              }
              var8++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_45_0 = param3.field_j;
          }
          if (stackIn_45_0 > 0 &&
            param3.field_k != null) {
            var8Lifetime1 = 0;
            var9Lifetime1 = 0;
            while (!(var9Lifetime1 >= md.field_t.length)) {
              var10Lifetime1 = md.field_t[var9Lifetime1];
              md.field_t[var9Lifetime1] = var8Lifetime1;
              var8Lifetime1 = var8Lifetime1 + var10Lifetime1;
              var9Lifetime1++;
              if (var19 != 0) {
                return;
              }
            }
          }
          if (param1) {
            jd.n(71);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_62_0 = var5;
          stackIn_62_1 = new StringBuilder().append("jd.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_63_2 = "null";
          } else {
            stackIn_63_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_62_0), ((StringBuilder) (Object) stackIn_62_1).append(stackIn_63_2).append(',').append(param4).append(')').toString());
        }
    }

    final static void a(String param0, long param1, java.applet.Applet param2, int param3, String param4) {
        try {
          RuntimeException stackIn_13_0 = null;
          StringBuilder stackIn_13_1 = null;
          String stackIn_14_2 = null;
          StringBuilder stackIn_17_1 = null;
          String stackIn_18_2 = null;
          StringBuilder stackIn_21_1 = null;
          String stackIn_22_2 = null;
          Throwable decompiledCaughtException = null;
          String var6 = null;
          Throwable var6_ref = null;
          RuntimeException var6_ref2 = null;
          String var7 = null;
          try {
            try {
              var6 = param2.getParameter("cookiehost");
              if (param3 != 1000) {
                field_p = false;
              }
              var7 = param0 + "=" + param4 + "; version=1; path=/; domain=" + var6;
              if (param1 >= 0L) {
                var7 = var7 + "; Expires=" + hc.a(1000L * param1 + je.a(1), -31289) + "; Max-Age=" + param1;
              }
              if (param1 < 0L ||
                SolKnight.field_L) {
                var7 = var7 + "; Discard;";
              }
              fd.a(param3 - 921, param2, "document.cookie=\"" + var7 + "\"");
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var6_ref = decompiledCaughtException;
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var6_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_13_0 = var6_ref2;
            stackIn_13_1 = new StringBuilder().append("jd.J(");
            if (param0 == null) {
              stackIn_14_2 = "null";
            } else {
              stackIn_14_2 = "{...}";
            }
            stackIn_17_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(',');
            if (param2 == null) {
              stackIn_18_2 = "null";
            } else {
              stackIn_18_2 = "{...}";
            }
            stackIn_21_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param3).append(',');
            if (param4 == null) {
              stackIn_22_2 = "null";
            } else {
              stackIn_22_2 = "{...}";
            }
            throw fc.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    jd(int param0) {
        super(param0);
    }

    final void a(int param0, int[] param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_n = new r(param1);
          if (param0 != -1) {
            this.m(0);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("jd.I(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final void b(int param0, int param1, int param2, byte[] param3) {
        int fieldTemp$0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        var6 = SolKnight.field_L ? 1 : 0;
        try {
          if (param0 <= 45) {
            this.field_n = (r) null;
          }
          var5_int = 0;
          while (param1 > var5_int) {
            fieldTemp$0 = this.field_m;
            this.field_m = this.field_m + 1;
            param3[var5_int + param2] = (byte)(this.field_l[fieldTemp$0] - this.field_n.a((byte) -78));
            var5_int++;
            if (var6 != 0) {
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_14_0 = var5;
          stackIn_14_1 = new StringBuilder().append("jd.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final void d(byte param0) {
        try {
          this.field_o = 8 * this.field_m;
          if (param0 >= -78) {
            this.m(55);
          }
        } catch (RuntimeException runtimeException) {
          throw fc.a((Throwable) ((Object) runtimeException), "jd.G(" + param0 + ')');
        }
    }

    final void m(int param0) {
        try {
          this.field_m = (this.field_o + 7) / 8;
          if (param0 != 0) {
            this.l(69);
          }
        } catch (RuntimeException runtimeException) {
          throw fc.a((Throwable) ((Object) runtimeException), "jd.D(" + param0 + ')');
        }
    }

    final int d(byte param0, int param1) {
        int incrementValue$1 = 0;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_14_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var6 = SolKnight.field_L ? 1 : 0;
        try {
          var3_int = this.field_o >> 3;
          var4 = 8 - (this.field_o & 7);
          if (param0 != 48) {
            this.d((byte) 5);
          }
          var5 = 0;
          this.field_o = this.field_o + param1;
          L2: while (true) {
            if (var4 < param1) {
              incrementValue$1 = var3_int;
              var3_int++;
              var5 = var5 + ((sd.field_j[var4] & this.field_l[incrementValue$1]) << param1 - var4);
              param1 = param1 - var4;
              var4 = 8;
              if (var6 == 0) {
                continue;
              }
            } else {
              if (var4 == param1) {
                var5 = var5 + (this.field_l[var3_int] & sd.field_j[var4]);
                if (var6 == 0) {
                  break L2;
                }
              }
            }
            var5 = var5 + (this.field_l[var3_int] >> var4 - param1 & sd.field_j[param1]);
            break;
          }
          stackIn_14_0 = var5;
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw fc.a((Throwable) ((Object) var3), "jd.A(" + param0 + ',' + param1 + ')');
        }
    }

    final static void n(int param0) {
        try {
          int var1_int = 32 % ((param0 - 41) / 53);
          k.a((byte) -35);
          k.field_b = true;
          ta.field_b = true;
          u.field_b.j(1);
          nf.a(false, kh.field_b, -96);
        } catch (RuntimeException runtimeException) {
          throw fc.a((Throwable) ((Object) runtimeException), "jd.E(" + param0 + ')');
        }
    }

    final void e(int param0, int param1) {
        int fieldTemp$1 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param1 != -2147483648) {
            jd.a((String) null, 29L, (java.applet.Applet) null, -35, (String) null);
          }
          fieldTemp$1 = this.field_m;
          this.field_m = this.field_m + 1;
          this.field_l[fieldTemp$1] = (byte)(this.field_n.a((byte) 103) + param0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw fc.a((Throwable) ((Object) var3), "jd.C(" + param0 + ',' + param1 + ')');
        }
    }

    jd(byte[] param0) {
        super(param0);
    }

    static {
        field_p = false;
    }
}
