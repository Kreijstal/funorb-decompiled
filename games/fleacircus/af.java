/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class af implements Runnable {
    private bf field_e;
    static ce field_f;
    static String field_a;
    static int field_b;
    private boolean field_c;
    static int field_g;
    private Thread field_h;
    int field_d;

    final static mk a(byte param0, int param1, String param2) {
        mk var3 = null;
        RuntimeException var3_ref = null;
        mk stackIn_2_0 = null;
        mk stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = new mk(false);
          var3.field_f = param1;
          var3.field_b = param2;
          if (param0 == 36) {
            stackIn_4_0 = var3;
            return stackIn_4_0;
          }
          stackIn_2_0 = (mk) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_7_0 = var3_ref;
          stackIn_7_1 = new StringBuilder().append("af.J(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final static void a(java.awt.Canvas param0, boolean param1, boolean param2) {
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = fleas.field_A ? 1 : 0;
        try {
          if (!param2) {
            return;
          }
          if (ib.field_k >= 10) {
            if (wh.b(27415)) {
              if (bh.field_t != 0) {
                bg.a((byte) -66, param0);
              } else {
                pd.a(param1, false, 0);
                be.a(0, param0, (byte) -61, 0);
              }
            } else {
              gb.c();
              hd.a(320, 240, -27794);
              be.a(0, param0, (byte) -29, 0);
            }
          } else {
            var3_int = 0;
            if (j.field_e) {
              var3_int = 1;
              j.field_e = false;
            }
            se.a(hl.d((byte) -85), ga.field_p, gk.a(-1917), var3_int != 0, (byte) -81);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_16_0 = var3;
          stackIn_16_1 = new StringBuilder().append("af.G(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    public final void run() {
        try {
          InterruptedException interruptedException = null;
          int var5 = 0;
          qh var7 = null;
          int decompiledRegionSelector0 = 0;
          int decompiledRegionSelector1 = 0;
          Throwable decompiledCaughtException = null;
          Object var2 = null;
          Exception var2_ref = null;
          String var6 = null;
          var5 = fleas.field_A ? 1 : 0;
          while (!this.field_c) {
            var2 = this.field_e;
            synchronized (var2) {
              var7 = (qh) (this.field_e.a(-123));
              if (var7 != null) {
                this.field_d = this.field_d - 1;
                decompiledRegionSelector0 = 1;
              } else {
                try {
                  this.field_e.wait();
                } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  interruptedException = (InterruptedException) (Object) decompiledCaughtException;
                }
                decompiledRegionSelector0 = 0;
              }
            }
            if (decompiledRegionSelector0 == 0) {
              continue;
            }
            try {
              boolean decompiledFrameRemainder0 = true;
              if (var7.field_B == 2) {
                var7.field_A.a(var7.field_x, var7.field_x.length, (int)var7.field_j, (byte) 93);
                var7.field_q = false;
              } else {
                if (var7.field_B != 3) {
                  decompiledRegionSelector1 = 0;
                  decompiledFrameRemainder0 = false;
                }
                else {
                  var7.field_x = var7.field_A.a((byte) -90, (int)var7.field_j);
                  var7.field_q = false;
                }
              }
              if (decompiledFrameRemainder0) {
                decompiledRegionSelector1 = 1;
              }
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var2_ref = (Exception) (Object) decompiledCaughtException;
              var6 = (String) null;
              ud.a((String) null, (Throwable) ((Object) var2_ref), 0);
              decompiledRegionSelector1 = 0;
            }
            if (decompiledRegionSelector1 != 0) {
              continue;
            }
            var7.field_q = false;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final qh a(int param0, ah param1, boolean param2) {
        qh var4 = null;
        RuntimeException var4_ref = null;
        Object var5 = null;
        qh var6 = null;
        int var8 = 0;
        qh stackIn_8_0 = null;
        qh stackIn_16_0 = null;
        boolean stackIn_17_1 = false;
        qh stackIn_18_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        Throwable decompiledCaughtException = null;
        var8 = fleas.field_A ? 1 : 0;
        try {
          var4 = new qh();
          var4.field_B = 1;
          var5 = this.field_e;
          synchronized (var5) {
            var6 = (qh) (this.field_e.b((byte) 105));
            while (var6 != null) {
              if (var6.field_j == (long)param0 &&
                param1 == var6.field_A &&
                var6.field_B == 2) {
                var4.field_q = false;
                var4.field_x = var6.field_x;
                stackIn_8_0 = var4;
                return stackIn_8_0;
              }
              var6 = (qh) (this.field_e.c((byte) 88));
            }
          }
          var4.field_x = param1.a((byte) -90, param0);
          stackIn_16_0 = var4;
          stackIn_17_1 = (param2);
          stackIn_16_0.field_v = stackIn_17_1;
          var4.field_q = false;
          stackIn_18_0 = var4;
          return stackIn_18_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_21_0 = var4_ref;
          stackIn_21_1 = new StringBuilder().append("af.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param2).append(')').toString());
        }
    }

    private final void a(byte param0, qh param1) {
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        Throwable decompiledCaughtException = null;
        Object var3 = null;
        RuntimeException var3_ref = null;
        try {
          var3 = this.field_e;
          synchronized (var3) {
            this.field_e.a(param1, param0 ^ -1089421913);
            if (param0 != 101) {
              field_g = -128;
            }
            this.field_d = this.field_d + 1;
            this.field_e.notifyAll();
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_10_0 = var3_ref;
          stackIn_10_1 = new StringBuilder().append("af.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 < 89) {
          CharSequence var2 = (CharSequence) null;
          af.a(-4, (byte[]) null, 19, (CharSequence) null, 98, 103);
        }
        field_f = null;
    }

    final static int a(int param0, byte[] param1, int param2, CharSequence param3, int param4, int param5) {
        int var7 = 0;
        int stackIn_69_0 = 0;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        String stackIn_73_2 = null;
        StringBuilder stackIn_75_1 = null;
        String stackIn_76_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var8 = 0;
        int var9 = 0;
        var9 = fleas.field_A ? 1 : 0;
        try {
          var6_int = -param0 + param2;
          for (var7 = 0; var7 < var6_int; var7++) {
            {
              var8 = param3.charAt(param0 + var7);
              if ((var8 <= 0 ||
                128 <= var8) && (var8 < 160 ||
                var8 > 255)) {
                switch (var8) {
                  case 8364:
                    param1[param5 + var7] = (byte)-128;
                    break;
                  case 8218:
                    param1[var7 + param5] = (byte)-126;
                    break;
                  case 402:
                    param1[var7 + param5] = (byte)-125;
                    break;
                  case 8222:
                    param1[param5 + var7] = (byte)-124;
                    break;
                  case 8230:
                    param1[var7 + param5] = (byte)-123;
                    break;
                  case 8224:
                    param1[param5 + var7] = (byte)-122;
                    break;
                  case 8225:
                    param1[var7 + param5] = (byte)-121;
                    break;
                  case 710:
                    param1[param5 + var7] = (byte)-120;
                    break;
                  case 8240:
                    param1[param5 + var7] = (byte)-119;
                    break;
                  case 352:
                    param1[param5 + var7] = (byte)-118;
                    break;
                  case 8249:
                    param1[var7 + param5] = (byte)-117;
                    break;
                  case 338:
                    param1[var7 + param5] = (byte)-116;
                    break;
                  case 381:
                    param1[param5 + var7] = (byte)-114;
                    break;
                  case 8216:
                    param1[var7 + param5] = (byte)-111;
                    break;
                  case 8217:
                    param1[param5 + var7] = (byte)-110;
                    break;
                  case 8220:
                    param1[var7 + param5] = (byte)-109;
                    break;
                  case 8221:
                    param1[var7 + param5] = (byte)-108;
                    break;
                  case 8226:
                    param1[var7 + param5] = (byte)-107;
                    break;
                  case 8211:
                    param1[param5 + var7] = (byte)-106;
                    break;
                  case 8212:
                    param1[param5 + var7] = (byte)-105;
                    break;
                  case 732:
                    param1[param5 + var7] = (byte)-104;
                    break;
                  case 8482:
                    param1[var7 + param5] = (byte)-103;
                    break;
                  case 353:
                    param1[var7 + param5] = (byte)-102;
                    break;
                  case 8250:
                    param1[var7 + param5] = (byte)-101;
                    break;
                  case 339:
                    param1[var7 + param5] = (byte)-100;
                    break;
                  case 382:
                    param1[param5 + var7] = (byte)-98;
                    break;
                  default:
                    param1[param5 + var7] = (byte)63;
                    break;
                  case 376:
                    param1[param5 + var7] = (byte)-97;
                    break;
                }
              } else {
                param1[var7 + param5] = (byte)var8;
              }
            }
          }
          if (param4 >= -56) {
            field_f = (ce) null;
          }
          stackIn_69_0 = var6_int;
          return stackIn_69_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_72_0 = var6;
          stackIn_72_1 = new StringBuilder().append("af.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_73_2 = "null";
          } else {
            stackIn_73_2 = "{...}";
          }
          stackIn_75_1 = ((StringBuilder) (Object) stackIn_72_1).append(stackIn_73_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_76_2 = "null";
          } else {
            stackIn_76_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_72_0), ((StringBuilder) (Object) stackIn_75_1).append(stackIn_76_2).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final qh a(int param0, int param1, ah param2, byte[] param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        qh var6 = null;
        qh stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5_int = 116 % ((26 - param0) / 42);
          var6 = new qh();
          var6.field_x = param3;
          var6.field_j = (long)param1;
          var6.field_v = false;
          var6.field_A = param2;
          var6.field_B = 2;
          this.a((byte) 101, var6);
          stackIn_1_0 = var6;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_4_0 = var5;
          stackIn_4_1 = new StringBuilder().append("af.F(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',');
          if (param3 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final qh a(int param0, int param1, ah param2) {
        qh var4 = null;
        RuntimeException var4_ref = null;
        String var5 = null;
        qh stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = new qh();
          var4.field_v = false;
          var4.field_A = param2;
          if (param0 < 111) {
            var5 = (String) null;
            af.a((byte) 74, 43, (String) null);
          }
          var4.field_j = (long)param1;
          var4.field_B = 3;
          this.a((byte) 101, var4);
          stackIn_3_0 = var4;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_6_0 = var4_ref;
          stackIn_6_1 = new StringBuilder().append("af.E(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final static void a(String param0, boolean param1, String param2, byte param3) {
        try {
          if (param3 <= 26) {
            field_b = 37;
          }
          aa.field_s = param2;
          jk.field_j = param0;
          wf.a(ll.field_o, false, param1);
        } catch (RuntimeException runtimeException) {
          throw pf.a((Throwable) ((Object) runtimeException), "af.I(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final void a(boolean param0) {
        try {
          this.field_c = param0 ? true : false;
          synchronized (this.field_e) {
            this.field_e.notifyAll();
          }
          try {
            this.field_h.join();
          } catch (InterruptedException interruptedException) {
          }
          this.field_h = null;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    af(ce param0) {
        od var2 = null;
        this.field_e = new bf();
        this.field_c = false;
        this.field_d = 0;
        try {
          var2 = param0.a(4532, (Runnable) (this), 5);
          while (var2.field_b == 0) {
            vh.a(10L, -101);
          }
          if (var2.field_b == 2) {
            throw new RuntimeException();
          }
          this.field_h = (Thread) (var2.field_e);
        } catch (RuntimeException runtimeException) {
          throw pf.a((Throwable) ((Object) runtimeException), "af.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_a = "<%0>Slopes:<%1> fleas can climb up and down ramps to reach different levels (these are the other type of tile you can place).";
    }
}
