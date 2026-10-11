/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ni implements Runnable {
    private km field_e;
    static int field_b;
    int field_c;
    private boolean field_d;
    private Thread field_a;

    final mf a(int param0, sp param1, byte[] param2, byte param3) {
        mf var5 = null;
        RuntimeException var5_ref = null;
        mf stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 != 116) {
            this.run();
          }
          var5 = new mf();
          var5.field_k = (long)param0;
          var5.field_v = 2;
          var5.field_t = param1;
          var5.field_s = param2;
          var5.field_q = false;
          this.a(19, var5);
          stackIn_3_0 = var5;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_6_0 = var5_ref;
          stackIn_6_1 = new StringBuilder().append("ni.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param3).append(')').toString());
        }
    }

    final static String a(int param0, long param1) {
        int var3 = 0;
        long var4 = 0L;
        StringBuilder var6 = null;
        long var7 = 0L;
        int var9 = 0;
        int var10 = 0;
        StringBuilder discarded$0 = null;
        int var11 = CrazyCrystals.field_B;
        if (param1 <= 0L) {
          return null;
        }
        if (6582952005840035281L <= param1) {
          return null;
        }
        if (param1 % (long)param0 != 0L) {
          var3 = 0;
          var4 = param1;
          while (var4 != 0L) {
            var3++;
            var4 = var4 / 37L;
          }
          var6 = new StringBuilder(var3);
          while (0L != param1) {
            var7 = param1;
            param1 = param1 / 37L;
            var9 = gl.field_a[(int)(-(param1 * 37L) + var7)];
            if (var9 == 95) {
              var10 = var6.length() - 1;
              var9 = 160;
              var6.setCharAt(var10, Character.toUpperCase(var6.charAt(var10)));
            }
            discarded$0 = var6.append((char) var9);
          }
          var6.reverse();
          var6.setCharAt(0, Character.toUpperCase(var6.charAt(0)));
          return var6.toString();
        }
        return null;
    }

    final mf a(int param0, int param1, sp param2) {
        mf var4 = null;
        RuntimeException var4_ref = null;
        mf stackIn_2_0 = null;
        mf stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = new mf();
          var4.field_t = param2;
          if (param0 != -4) {
            stackIn_2_0 = (mf) null;
            return stackIn_2_0;
          }
          var4.field_k = (long)param1;
          var4.field_q = false;
          var4.field_v = 3;
          this.a(param0 ^ -25, var4);
          stackIn_4_0 = var4;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_7_0 = var4_ref;
          stackIn_7_1 = new StringBuilder().append("ni.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    public final void run() {
        try {
          InterruptedException interruptedException = null;
          Object var2 = null;
          int var5 = 0;
          mf var7 = null;
          int decompiledRegionSelector0 = 0;
          int decompiledRegionSelector1 = 0;
          Throwable decompiledCaughtException = null;
          Exception var2_ref = null;
          String var6 = null;
          var5 = CrazyCrystals.field_B;
          while (!this.field_d) {
            var2 = this.field_e;
            synchronized (var2) {
              var7 = (mf) (this.field_e.d(-4425));
              if (var7 == null) {
                try {
                  this.field_e.wait();
                } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  interruptedException = (InterruptedException) (Object) decompiledCaughtException;
                }
                decompiledRegionSelector0 = 0;
              } else {
                this.field_c = this.field_c - 1;
                decompiledRegionSelector0 = 1;
              }
            }
            if (decompiledRegionSelector0 == 0) {
              continue;
            }
            try {
              boolean decompiledFrameRemainder0 = true;
              if (2 == var7.field_v) {
                var7.field_t.a(var7.field_s.length, var7.field_s, (byte) 101, (int)var7.field_k);
                var7.field_n = false;
              } else {
                if (var7.field_v != 3) {
                  decompiledRegionSelector1 = 0;
                  decompiledFrameRemainder0 = false;
                }
                else {
                  var7.field_s = var7.field_t.a(false, (int)var7.field_k);
                  var7.field_n = false;
                }
              }
              if (decompiledFrameRemainder0) {
                decompiledRegionSelector1 = 1;
              }
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var2_ref = (Exception) (Object) decompiledCaughtException;
              var6 = (String) null;
              wp.a((Throwable) ((Object) var2_ref), (String) null, 21862);
              decompiledRegionSelector1 = 0;
            }
            if (decompiledRegionSelector1 != 0) {
              continue;
            }
            var7.field_n = false;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void a(int param0, mf param1) {
        synchronized (this.field_e) {
          this.field_e.a((byte) 98, param1);
          this.field_c = this.field_c + 1;
          this.field_e.notifyAll();
          int var4 = -48 % ((-37 - param0) / 37);
        }
    }

    final mf a(boolean param0, int param1, sp param2) {
        mf var4 = null;
        RuntimeException var4_ref = null;
        Object var5 = null;
        mf var6 = null;
        int var8 = 0;
        mf stackIn_8_0 = null;
        mf stackIn_16_0 = null;
        sp stackIn_16_1 = null;
        boolean stackIn_17_2 = false;
        mf stackIn_19_0 = null;
        boolean stackIn_20_1 = false;
        mf stackIn_21_0 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        Throwable decompiledCaughtException = null;
        var8 = CrazyCrystals.field_B;
        try {
          var4 = new mf();
          var4.field_v = 1;
          var5 = this.field_e;
          synchronized (var5) {
            var6 = (mf) (this.field_e.b(126));
            while (var6 != null) {
              if (var6.field_k == (long)param1 &&
                var6.field_t == param2 &&
                var6.field_v == 2) {
                var4.field_s = var6.field_s;
                var4.field_n = false;
                stackIn_8_0 = var4;
                return stackIn_8_0;
              }
              var6 = (mf) (this.field_e.a(94));
            }
          }
          stackIn_16_0 = var4;
          stackIn_16_1 = (sp) (param2);
          stackIn_17_2 = !(param0);
          stackIn_16_0.field_s = ((sp) (Object) stackIn_16_1).a(stackIn_17_2, param1);
          var4.field_n = false;
          stackIn_19_0 = var4;
          stackIn_20_1 = (param0);
          stackIn_19_0.field_q = stackIn_20_1;
          stackIn_21_0 = var4;
          return stackIn_21_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_24_0 = var4_ref;
          stackIn_24_1 = new StringBuilder().append("ni.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(')').toString());
        }
    }

    final void a(int param0) {
        try {
          this.field_d = true;
          synchronized (this.field_e) {
            if (param0 != -3) {
              this.run();
            }
            this.field_e.notifyAll();
          }
          try {
            this.field_a.join();
          } catch (InterruptedException interruptedException) {
          }
          this.field_a = null;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    ni(un param0) {
        gb var2 = null;
        this.field_e = new km();
        this.field_d = false;
        this.field_c = 0;
        try {
          var2 = param0.a((Runnable) (this), 2, 5);
          while (var2.field_a == 0) {
            fh.a(true, 10L);
          }
          if (var2.field_a == 2) {
            throw new RuntimeException();
          }
          this.field_a = (Thread) (var2.field_b);
        } catch (RuntimeException runtimeException) {
          throw dn.a((Throwable) ((Object) runtimeException), "ni.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_b = -1;
    }
}
