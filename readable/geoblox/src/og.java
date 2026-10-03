/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class og extends DualLinkNode {
    static GameScreen[] screens;
    static float entityMotionSpeed;
    static int field_n;
    int[] field_m;
    private int[] field_o;
    private String[] field_p;
    private int[][] field_s;

    final static String e(int param0) {
        int var2 = 0;
        String var1;
        int var3;
        int var4;
        int var5;
        String var6;
        String var7;
        String var8;
        var5 = Geoblox.clientControlFlowFlag;
        var6 = "(" + ad.field_o + " " + dc.field_b + " " + kg.field_n + ") " + ScorePopup.field_l;
        var1 = var6;
        if (0 < p.field_k) {
          var1 = var6 + ":";
          for (var2 = 0; var2 < p.field_k; var2++) {
            var7 = var1 + ' ';
            var1 = var7;
            var3 = 255 & eh.field_d.bytes[var2];
            var4 = var3 >> 4;
            var3 = var3 & 15;
            if (var4 >= 10) {
              var4 += 55;
            } else {
              var4 += 48;
            }
            if (var3 < 10) {
              var3 += 48;
            } else {
              var3 += 55;
            }
            var8 = var7 + (char)var4;
            var1 = var8 + (char)var3;
          }
        }
        if (param0 == 55) {
          return var1;
        }
        return (String) null;
    }

    private final void a(int param0, ByteArrayBuffer param1, int param2) {
        int[] array$0 = null;
        int var8 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        ck var7 = null;
        int var9 = 0;
        ByteArrayBuffer var10 = null;
        var9 = Geoblox.clientControlFlowFlag;
        try {
          L0: {
            if (1 == param0) {
              this.field_p = uj.a('<', true, param1.readNullTerminatedText((byte) 116));
            } else {
              if (2 == param0) {
                var4_int = param1.readUnsignedByte((byte) 34);
                this.field_m = new int[var4_int];
                for (var5 = 0; var5 < var4_int; var5++) {
                  this.field_m[var5] = param1.readUnsignedShortBE(true);
                }
                break L0;
              }
              if (3 == param0) {
                var4_int = param1.readUnsignedByte((byte) 34);
                this.field_s = new int[var4_int][];
                this.field_o = new int[var4_int];
                for (var5 = 0; var4_int > var5; var5++) {
                  var6 = param1.readUnsignedShortBE(true);
                  var7 = b.a(false, var6);
                  if (var7 != null) {
                    this.field_o[var5] = var6;
                    array$0 = new int[var7.field_a];
                    this.field_s[var5] = array$0;
                    for (var8 = 0; var7.field_a > var8; var8++) {
                      this.field_s[var5][var8] = param1.readUnsignedShortBE(true);
                    }
                  }
                }
                break L0;
              }
              if (param0 != 4) {
              }
            }
          }
          if (param2 != -26093) {
            var10 = (ByteArrayBuffer) null;
            this.a(-112, (ByteArrayBuffer) null);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_23_0 = (RuntimeException) (var4);
          stackIn_23_1 = new StringBuilder().append("og.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param2).append(')').toString());
        }
    }

    final void f(byte param0) {
        int var2 = 0;
        int var3 = Geoblox.clientControlFlowFlag;
        if (param0 != 119) {
            entityMotionSpeed = 0.380857914686203f;
        }
        if (!(this.field_m == null)) {
            for (var2 = 0; this.field_m.length > var2; var2++) {
                this.field_m[var2] = lb.orInt(this.field_m[var2], 32768);
            }
        }
    }

    public static void f(int param0) {
        if (param0 < 71) {
            og.e(41);
        }
        screens = null;
    }

    final String e(byte param0) {
        int var3 = 0;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        int var4 = Geoblox.clientControlFlowFlag;
        StringBuilder var5 = new StringBuilder(80);
        StringBuilder var2 = var5;
        if (param0 > -7) {
            og.f(41);
        }
        if (null == this.field_p) {
            return "";
        }
        StringBuilder discarded$0 = var5.append(this.field_p[0]);
        for (var3 = 1; this.field_p.length > var3; var3++) {
            discarded$1 = var2.append("...");
            discarded$2 = var5.append(this.field_p[var3]);
        }
        return var2.toString();
    }

    og() {
    }

    final static void a(int param0, String param1, boolean param2, boolean param3) {
        fh.b(-6011);
        kd.field_e.f(10936);
        if (param0 != 2274) {
            return;
        }
        try {
            ml.field_t = new pf(b.field_a, (String) null, cf.field_i, param2, param3);
            hk.field_C = new ei(kd.field_e, ml.field_t);
            kd.field_e.a(false, hk.field_C);
        } catch (RuntimeException runtimeException) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) runtimeException), "og.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void a(int param0, ByteArrayBuffer param1) {
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = Geoblox.clientControlFlowFlag;
        try {
          if (param0 != 0) {
            return;
          }
          while (true) {
            var3_int = param1.readUnsignedByte((byte) 34);
            if (0 == var3_int) {
              return;
            }
            this.a(var3_int, param1, -26093);
            continue;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = (RuntimeException) (var3);
          stackIn_9_1 = new StringBuilder().append("og.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final static String a(String param0, String param1, boolean param2, String param3) {
        if (!param2) {
            String var5 = (String) null;
            og.a((String) null, (String) null, true, (String) null);
        }
        int var4 = param0.indexOf(param3);
        while (var4 != -1) {
            param0 = param0.substring(0, var4) + param1 + param0.substring(param3.length() + var4);
            var4 = param0.indexOf(param3, param1.length() + var4);
        }
        return param0;
    }

    static {
        screens = new GameScreen[9];
    }
}
