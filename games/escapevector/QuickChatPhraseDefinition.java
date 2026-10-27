/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class QuickChatPhraseDefinition extends DualLinkNode {
    static String field_w;
    static int[] fullTileMask;
    private int[][] field_q;
    static String field_y;
    static IntrusiveDeque field_u;
    static int field_r;
    int[] field_z;
    private int[] field_x;
    private String[] field_s;
    static hh field_t;

    private final void a(int param0, PacketBuffer param1, int param2) {
        String stackIn_24_2 = null;
        int var4_int = 0;
        int var5 = 0;
        int var9 = EscapeVector.obfuscationControl;
        try {
          if (param0 != 10691) {
            return;
          }
          if (param2 == 1) {
            this.field_s = bb.a(-128, param1.c(false), '<');
          } else {
            if (param2 == 2) {
              var4_int = param1.readUnsignedByte(param0 ^ 10691);
              this.field_z = new int[var4_int];
              for (var5 = 0; var5 < var4_int; var5++) {
                this.field_z[var5] = param1.readUnsignedShort(1952);
              }
            } else if (param2 == 3) {
              var4_int = param1.readUnsignedByte(0);
              this.field_q = new int[var4_int][];
              this.field_x = new int[var4_int];
              for (var5 = 0; var4_int > var5; var5++) {
                int var6 = param1.readUnsignedShort(1952);
                om var7 = kf.a((byte) -57, var6);
                if (var7 != null) {
                  this.field_x[var5] = var6;
                  int[] array$0 = new int[var7.field_d];
                  this.field_q[var5] = array$0;
                  for (int var8 = 0; var7.field_d > var8; var8++) {
                    this.field_q[var5][var8] = param1.readUnsignedShort(PacketBuffer.a(param0, 11875));
                  }
                }
              }
            } else {
              if (param2 == 4) {
                return;
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var4 = decompiledCaughtException;
          RuntimeException stackIn_23_0 = var4;
          StringBuilder stackIn_23_1 = new StringBuilder().append("si.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param2).append(')').toString());
        }
    }

    final void a(PacketBuffer param0, int param1) {
        String stackIn_9_2 = null;
        int var4 = EscapeVector.obfuscationControl;
        try {
          if (param1 != 0) {
            this.d((byte) -118);
          }
          while (true) {
            int var3_int = param0.readUnsignedByte(0);
            if (var3_int == 0) {
              return;
            }
            this.a(10691, param0, var3_int);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3 = decompiledCaughtException;
          RuntimeException stackIn_8_0 = var3;
          StringBuilder stackIn_8_1 = new StringBuilder().append("si.C(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    final void d(byte param0) {
        int var4 = EscapeVector.obfuscationControl;
        int var2 = 46 / ((-16 - param0) / 44);
        if (this.field_z != null) {
          for (int var3 = 0; var3 < this.field_z.length; var3++) {
            this.field_z[var3] = lb.a(this.field_z[var3], 32768);
          }
        }
    }

    public static void f(int param0) {
        field_t = null;
        field_w = null;
        if (param0 < 74) {
          QuickChatPhraseDefinition.f(-4);
        }
        fullTileMask = null;
        field_y = null;
        field_u = null;
    }

    final static void a(float param0, String param1, boolean param2, byte param3) {
        try {
          if (param3 != 14) {
            field_t = (hh) null;
          }
          if (null == jb.field_r) {
            jb.field_r = new w(bo.field_F, dj.field_b);
            bo.field_F.b(jb.field_r, param3 + 102);
          }
          jb.field_r.a(-100, param1, param0, param2);
          SoftwareRasterizer.d();
          se.a(true, param3 ^ 17111);
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "si.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static void a(int param0, java.applet.Applet param1) {
        String stackIn_7_2 = null;
        try {
          int var2_int = 100 % ((param0 + 19) / 57);
          String var3 = param1.getParameter("username");
          if (var3 != null) {
            CharSequence var4 = (CharSequence) ((Object) var3);
            if (vn.a((byte) 91, var4) != 0L) {
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2 = decompiledCaughtException;
          RuntimeException stackIn_6_0 = var2;
          StringBuilder stackIn_6_1 = new StringBuilder().append("si.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final String g(int param0) {
        int var4 = EscapeVector.obfuscationControl;
        StringBuilder var5 = new StringBuilder(80);
        StringBuilder var2 = var5;
        if (this.field_s == null) {
          return "";
        }
        StringBuilder discarded$0 = var5.append(this.field_s[0]);
        for (int var3 = 1; var3 < this.field_s.length; var3++) {
          StringBuilder discarded$1 = var2.append("...");
          StringBuilder discarded$2 = var5.append(this.field_s[var3]);
        }
        if (param0 != -4) {
          QuickChatPhraseDefinition.f(100);
        }
        return var2.toString();
    }

    final static void a(int param0, dk param1) {
        try {
          if (param0 >= -60) {
            field_r = -70;
          }
          int[] var2 = new int[]{3170352, 3170352, 3170352};
          int[] var3 = new int[]{6340704, 16777215, 16777215};
          param1.a(var2, var3, -2);
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "si.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    QuickChatPhraseDefinition() {
    }

    static {
        fullTileMask = new int[]{};
        field_w = " - rotate ship right";
        field_r = 500;
        field_y = "Connection lost. <%0>";
    }
}
