/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ju extends rt {
    private int field_l;
    static AircraftDefinition field_k;
    static int field_m;

    final static cd e(int param0) {
        String var1 = la.a(4);
        if (var1 != null &&
          var1.indexOf('@') >= 0) {
          var1 = "";
        }
        if (param0 > 120) {
          return new cd(la.a(4), FlightSession.d(-98));
        }
        field_k = (AircraftDefinition) null;
        return new cd(la.a(4), FlightSession.d(-98));
    }

    final void b(boolean param0, boolean param1) {
        this.field_j.a((rt) (this), 1);
        if (!param0) {
          jaggl.OpenGL.glTexParameteri(this.field_f, 10242, param1 ? 10497 : 33071);
          return;
        }
        PacketBuffer var4 = (PacketBuffer) null;
        ju.a(2, (PacketBuffer) null);
        jaggl.OpenGL.glTexParameteri(this.field_f, 10242, param1 ? 10497 : 33071);
    }

    final static String a(int param0, CharSequence param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        PacketBuffer var3 = null;
        String stackIn_5_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2 = vf.a(AceOfSkies.a(param1, -44), 28304);
          if (var2 == null) {
            var2 = "";
          }
          if (param0 != 0) {
            var3 = (PacketBuffer) null;
            ju.a(25, (PacketBuffer) null);
          }
          stackIn_5_0 = var2;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_8_0 = var2_ref;
          stackIn_8_1 = new StringBuilder().append("ju.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    public final void a(byte param0) {
        if (param0 != 11) {
          field_k = (AircraftDefinition) null;
        }
    }

    public static void d(int param0) {
        if (param0 <= 121) {
          field_k = (AircraftDefinition) null;
          field_k = null;
          return;
        }
        field_k = null;
    }

    ju(wl param0, int param1, int param2, byte[] param3, int param4) {
        super(param0, 3552, param1, param2, false);
        try {
          this.field_l = param2;
          this.field_j.a((rt) (this), 1);
          jaggl.OpenGL.glPixelStorei(3317, 1);
          jaggl.OpenGL.glTexImage1Dub(this.field_f, 0, this.field_b, this.field_l, 0, param4, 5121, param3, 0);
          jaggl.OpenGL.glPixelStorei(3317, 4);
          this.a(true, -128);
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "ju.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    final static void a(int param0, PacketBuffer param1) {
        int var2_int = 0;
        int var2_intLifetime1;
        int var2_intLifetime2;
        try {
          ld.field_a = param1.readUnsignedShort((byte) 0) << 5;
          var2_int = param1.readUnsignedByte(113);
          fs.field_c = 1835008 & var2_int << 18;
          if (param0 != 965924047) {
            PacketBuffer var3 = (PacketBuffer) null;
            ju.a(-45, (PacketBuffer) null);
          }
          ld.field_a = ld.field_a + (var2_int >> 3);
          fs.field_c = fs.field_c + (param1.readUnsignedShort((byte) 0) << 2);
          var2_intLifetime1 = param1.readUnsignedByte(57);
          tj.field_o = (63 & var2_intLifetime1) << 15;
          fs.field_c = fs.field_c + (var2_intLifetime1 >> 6);
          tj.field_o = tj.field_o + (param1.readUnsignedByte(-81) << 7);
          var2_intLifetime2 = param1.readUnsignedByte(-56);
          HighscoreNameEntry.field_b = 65536 & var2_intLifetime2 << 16;
          tj.field_o = tj.field_o + (var2_intLifetime2 >> 1);
          HighscoreNameEntry.field_b = HighscoreNameEntry.field_b + param1.readUnsignedShort((byte) 0);
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "ju.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_k = new AircraftDefinition(1.5, 2, 3, 100, 3, 5.0, 10.0, 16, 1);
    }
}
