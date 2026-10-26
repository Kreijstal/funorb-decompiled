/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dk implements Runnable {
    static String field_a;
    private er field_f;
    static String field_k;
    static String field_b;
    static dq field_h;
    static String field_i;
    static IndexedSprite[] field_e;
    private boolean field_j;
    int field_d;
    static int[] field_g;
    private Thread field_c;

    final os a(byte[] param0, bl param1, boolean param2, int param3) {
        String stackIn_7_2 = null;
        String stackIn_10_2 = null;
        try {
          os var5 = new os();
          var5.secondaryKey = (long)param3;
          var5.field_u = param0;
          var5.field_v = 2;
          var5.field_x = param1;
          var5.field_q = false;
          if (!param2) {
            dk.a(-85);
          }
          this.a((byte) -88, var5);
          os stackIn_3_0 = var5;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5_ref = decompiledCaughtException;
          RuntimeException stackIn_6_0 = var5_ref;
          StringBuilder stackIn_6_1 = new StringBuilder().append("dk.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          StringBuilder stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final os a(bl param0, byte param1, int param2) {
        String stackIn_22_2 = null;
        int var8 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          if (param1 <= 53) {
            this.field_j = false;
          }
          os var4 = new os();
          var4.field_v = 1;
          Object var5 = this.field_f;
          synchronized (var5) {
            os var6 = (os) (this.field_f.b((byte) 52));
            while (var6 != null) {
              if (var6.secondaryKey == (long)param2 &&
                param0 == var6.field_x &&
                var6.field_v == 2) {
                var4.field_p = false;
                var4.field_u = var6.field_u;
                os stackIn_11_0 = var4;
                return stackIn_11_0;
              }
              var6 = (os) (this.field_f.e(31542));
            }
          }
          var4.field_u = param0.a(param2, 255);
          var4.field_q = true;
          var4.field_p = false;
          os stackIn_18_0 = var4;
          return stackIn_18_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          Throwable decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var4_ref = (RuntimeException) (Object) decompiledCaughtException;
          RuntimeException stackIn_21_0 = var4_ref;
          StringBuilder stackIn_21_1 = new StringBuilder().append("dk.C(");
          if (param0 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    public static void a(int param0) {
        if (param0 == -4) {
          field_h = null;
          field_e = null;
          field_a = null;
          field_k = null;
          field_i = null;
          field_g = null;
          field_b = null;
          return;
        }
        dk.a(-105, 77, (byte) -91);
        field_h = null;
        field_e = null;
        field_a = null;
        field_k = null;
        field_i = null;
        field_g = null;
        field_b = null;
    }

    public final void run() {
        try {
          os var7 = null;
          boolean decompiledRegionSelector0 = false;
          boolean decompiledRegionSelector1 = false;
          Throwable decompiledCaughtException = null;
          int var5 = AceOfSkies.obfuscationControl ? 1 : 0;
          while (!this.field_j) {
            Object var2 = this.field_f;
            synchronized (var2) {
              var7 = (os) (this.field_f.b(-18520));
              if (var7 == null) {
                try {
                  this.field_f.wait();
                } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  InterruptedException interruptedException = (InterruptedException) (Object) decompiledCaughtException;
                }
                decompiledRegionSelector0 = false;
              } else {
                this.field_d = this.field_d - 1;
                decompiledRegionSelector0 = true;
              }
            }
            if (!decompiledRegionSelector0) {
              continue;
            }
            try {
              boolean decompiledFrameRemainder0 = true;
              if (2 == var7.field_v) {
                var7.field_x.a(var7.field_u.length, 255, (int)var7.secondaryKey, var7.field_u);
                var7.field_p = false;
              } else if (var7.field_v == 3) {
                var7.field_u = var7.field_x.a((int)var7.secondaryKey, 255);
                decompiledRegionSelector1 = true;
                decompiledFrameRemainder0 = false;
              } else {
                var7.field_p = false;
              }
              if (decompiledFrameRemainder0) {
                decompiledRegionSelector1 = false;
              }
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              Exception var2_ref = (Exception) (Object) decompiledCaughtException;
              String var6 = (String) null;
              v.a((String) null, (byte) -52, (Throwable) ((Object) var2_ref));
              decompiledRegionSelector1 = true;
            }
            if (!decompiledRegionSelector1) {
              continue;
            }
            var7.field_p = false;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(byte param0) {
        try {
          this.field_j = true;
          synchronized (this.field_f) {
            this.field_f.notifyAll();
          }
          if (param0 != -85) {
            field_k = (String) null;
          }
          try {
            this.field_c.join();
          } catch (InterruptedException interruptedException) {
          }
          this.field_c = null;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static boolean a(int param0, int param1, byte param2) {
        if (param2 == -84) {
          return 0 != (param0 & 34) ? true : false;
        }
        field_a = (String) null;
        return 0 != (param0 & 34) ? true : false;
    }

    final os a(byte param0, bl param1, int param2) {
        String stackIn_7_2 = null;
        try {
          os var4 = new os();
          if (param0 != 95) {
            bl var5 = (bl) null;
            this.a((byte) -41, (bl) null, 82);
          }
          var4.field_v = 3;
          var4.field_q = false;
          var4.secondaryKey = (long)param2;
          var4.field_x = param1;
          this.a((byte) -76, var4);
          os stackIn_3_0 = var4;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var4_ref = decompiledCaughtException;
          RuntimeException stackIn_6_0 = var4_ref;
          StringBuilder stackIn_6_1 = new StringBuilder().append("dk.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param2).append(')').toString());
        }
    }

    dk(rk param0) {
        this.field_f = new er();
        this.field_j = false;
        this.field_d = 0;
        try {
          en var2 = param0.a(5, 1048576, (Runnable) (this));
          while (var2.field_a == 0) {
            IntrusiveNode.a(10L, false);
          }
          if (var2.field_a == 2) {
            throw new RuntimeException();
          }
          this.field_c = (Thread) (var2.field_f);
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "dk.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    private final void a(byte param0, os param1) {
        Object var3 = null;
        Throwable var4 = null;
        String stackIn_12_2 = null;
        try {
          var3 = this.field_f;
          synchronized (var3) {
            this.field_f.a(2, param1);
            this.field_d = this.field_d + 1;
            if (param0 > -55) {
              return;
            }
            this.field_f.notifyAll();
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          Throwable decompiledCaughtException = decompiledCaughtParameter0;
          var3 = (RuntimeException) (Object) decompiledCaughtException;
          Object stackIn_11_0 = var3;
          StringBuilder stackIn_11_1 = new StringBuilder().append("dk.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw pn.a((Throwable) (stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    static {
        field_b = "Fullscreen";
        field_a = "to keep fullscreen or";
        field_k = "Name is available";
        field_i = "Email address is unavailable";
        field_g = new int[8192];
        field_h = new dq();
    }
}
