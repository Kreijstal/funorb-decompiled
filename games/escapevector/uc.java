/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uc {
    private int field_e;
    private int field_f;
    static String field_d;
    private int field_g;
    float field_a;
    String field_b;
    static BufferedRandomAccessFile field_h;
    private qk[] field_c;

    final static int a(int param0, BinaryBitmapFont param1) {
        String stackIn_7_2 = null;
        try {
          if (param0 != -1) {
            BinaryBitmapFont var3 = (BinaryBitmapFont) null;
            uc.a(88, (BinaryBitmapFont) null);
          }
          int stackIn_3_0 = param1.maxAscent;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2 = decompiledCaughtException;
          RuntimeException stackIn_6_0 = var2;
          StringBuilder stackIn_6_1 = new StringBuilder().append("uc.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final static int b(int param0) {
        if (param0 < 65) {
          return 2;
        }
        return 1;
    }

    private final void a(int param0, ResourceArchive param1, int param2, String param3, String param4, String param5) {
        try {
          if (this.field_c.length <= this.field_f) {
            qk[] var9 = new qk[2 * this.field_f];
            qk[] var7 = var9;
            qg.a(this.field_c, 0, var9, 0, this.field_f);
            this.field_c = var9;
          }
          qk var8 = new qk();
          qk var10 = var8;
          qk var7_ref = var10;
          if (param2 != 1) {
            this.a(20);
          }
          var10.field_i = param5;
          var10.field_d = param4;
          var10.field_h = param1;
          var10.field_c = param3;
          var10.field_b = param0;
          int fieldTemp$0 = this.field_f;
          this.field_f = this.field_f + 1;
          this.field_c[fieldTemp$0] = var8;
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "uc.G(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    public static void releaseStatics(byte guard) {
        if (guard != -59) {
          return;
        }
        field_h = null;
        field_d = null;
    }

    final static boolean a(ResourceArchive param0, int param1, int param2, int param3) {
        String stackIn_8_2 = null;
        try {
          byte[] var6 = param0.getFile(param2, (byte) -97, param3);
          byte[] var4 = var6;
          int var5 = -6 / ((param1 - 6) / 55);
          if (var6 == null) {
            return false;
          }
          DialWidget.decodeSpriteSheet(var6, true);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var4_ref = decompiledCaughtException;
          RuntimeException stackIn_7_0 = var4_ref;
          StringBuilder stackIn_7_1 = new StringBuilder().append("uc.A(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final boolean a(int param0) {
        int var3 = EscapeVector.obfuscationControl;
        if (param0 != 7020) {
          return true;
        }
        while (this.field_f > this.field_e) {
          qk var4 = this.field_c[this.field_e];
          if (!var4.field_h.ensureIndex(0)) {
            this.a(0, -33, var4);
            return false;
          }
          if (0 <= var4.field_b &&
            !var4.field_h.tryLoadGroup(118, var4.field_b)) {
            this.a(var4.field_h.groupProgress(param0 - 3810, var4.field_b), -102, var4);
            return false;
          }
          if (null != var4.field_i &&
            !var4.field_h.tryLoadNamedGroup(0, var4.field_i)) {
            this.a(var4.field_h.namedGroupProgress(var4.field_i, 0), param0 - 7114, var4);
            return false;
          }
          if (var4.field_b < 0 &&
            null == var4.field_i &&
            var4.field_d != null &&
            !var4.field_h.tryLoadAllGroups((byte) -119)) {
            this.a(var4.field_h.overallProgress(-98), -17, var4);
            return false;
          }
          this.field_e = this.field_e + 1;
        }
        return true;
    }

    final void a(ResourceArchive param0, String param1, String param2, String param3, int param4) {
        try {
          this.a(-1, param0, 1, param1, param2, param3);
          if (param4 != 14826) {
            field_h = (BufferedRandomAccessFile) null;
          }
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "uc.I(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    private final void a(int param0, int param1, qk param2) {
        try {
          float var4_float = (float)(this.field_e + 1) + (float)param0 / 100.0f;
          if (0 != param0) {
            this.field_b = param2.field_d + " - " + param0 + "%";
          } else {
            this.field_b = param2.field_c;
          }
          if (param1 >= -7) {
            this.a(-63);
          }
          this.field_a = (float)this.field_g * var4_float / (float)(this.field_f + 1);
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "uc.C(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(String param0, byte param1, String param2, ResourceArchive param3) {
        try {
          this.a(-1, param3, 1, param0, param2, (String) null);
          if (param1 > -114) {
            String var6 = (String) null;
            this.a(-32, (ResourceArchive) null, 21, (String) null, (String) null, (String) null);
          }
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "uc.F(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    uc(int param0) {
        this.field_c = new qk[16];
        this.field_g = param0;
    }

    static {
        field_d = "Loading music";
    }
}
