/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qh {
    static PcmSample field_i;
    static String field_e;
    static int field_m;
    private boolean field_b;
    static int[] field_k;
    static Sprite field_l;
    static String[] field_j;
    private int field_f;
    private String field_h;
    private ResourceArchive field_d;
    private String field_a;
    private int[] field_g;
    private Sprite field_c;

    final Sprite b(int param0) {
        byte[] var3_array = null;
        byte[] var3_arrayLifetime2;
        if (this.field_c != null) {
          return this.field_c;
        }
        if (!this.field_b) {
          int var2 = 5 % ((-30 - param0) / 48);
          if (this.field_f == 0) {
            this.field_c = fe.a(this.field_a, this.field_d, this.field_h, true);
            return this.field_c;
          }
          if (this.field_f == 1) {
            Object var3 = null;
            if (this.field_g != null) {
              var3_array = this.field_d.a((byte) 78, this.field_a, this.field_h, this.field_g);
            } else {
              var3_array = this.field_d.a(-4, this.field_h, this.field_a);
            }
            this.field_c = new Sprite(var3_array, (java.awt.Component) ((Object) of.field_d));
            return this.field_c;
          }
          return this.field_c;
        }
        if (!this.field_d.a(0, this.field_a)) {
          return null;
        }
        int var2Lifetime1 = 5 % ((-30 - param0) / 48);
        if (this.field_f == 0) {
          this.field_c = fe.a(this.field_a, this.field_d, this.field_h, true);
          return this.field_c;
        }
        if (this.field_f != 1) {
          return this.field_c;
        }
        byte[] var3_arrayLifetime1 = null;
        if (this.field_g != null) {
          var3_arrayLifetime2 = this.field_d.a((byte) 78, this.field_a, this.field_h, this.field_g);
        } else {
          var3_arrayLifetime2 = this.field_d.a(-4, this.field_h, this.field_a);
        }
        this.field_c = new Sprite(var3_arrayLifetime2, (java.awt.Component) ((Object) of.field_d));
        return this.field_c;
    }

    final static void a(ResourceArchive param0, byte param1) {
        String stackIn_16_2 = null;
        int var6 = EscapeVector.obfuscationControl;
        try {
          hb.field_b = new Sprite[7][3];
          qi.field_M = new Sprite[7][3];
          if (param1 != -23) {
            qh.releaseStatics(-112);
          }
          for (int var2_int = 0; on.field_f.length > var2_int; var2_int++) {
            String var3 = on.field_f[var2_int];
            if (var3 != null &&
              var3.length() != 0) {
              String var4 = "";
              hb.field_b[var2_int] = kh.a(param0, (byte) -112, var4, var3);
              String var5 = NameAvailabilityResult.field_b[var2_int];
              if (var5 != null &&
                var5.length() != 0) {
                qi.field_M[var2_int] = kh.a(param0, (byte) -10, var4, var5);
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2 = decompiledCaughtException;
          RuntimeException stackIn_15_0 = var2;
          StringBuilder stackIn_15_1 = new StringBuilder().append("qh.B(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(rl param0, boolean param1, int param2) {
        try {
          CipherPacketBuffer var3 = om.field_c;
          var3.writeCipheredOpcode(param2, param1);
          var3.f(param0.field_i, -123);
          var3.f(param0.field_g, -123);
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "qh.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    public static void releaseStatics(int guard) {
        if (guard != 7) {
          return;
        }
        field_j = null;
        field_i = null;
        field_k = null;
        field_e = null;
        field_l = null;
    }

    qh(ResourceArchive param0, String param1, String param2, int param3, boolean param4, int[] param5) {
        try {
          this.field_b = param4 ? true : false;
          this.field_d = param0;
          this.field_f = param3;
          this.field_a = param2;
          this.field_h = param1;
          this.field_g = param5;
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "qh.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_j = new String[]{"Sit down, commander. Prepare for mission briefing.", "As you know, aliens broke into Earth's most advanced <photo>weapons and technology installation.<br>They used <photo>cloaking devices and would have made good their escape...", "...had our most powerful items not had tracking devices fitted,<br>allowing us to <photo>track the aliens to their home system.", "Your mission is to take your ship, the OSS Katsuro, into the caves where our equipment is being stored.<br><photo>You must overcome the aliens' defences and recover the equipment.", "Our emergency rescue teleporter has enough power for two transmissions.<br>The aliens will attempt to stop you and we can only save your life twice...", "...so we are relying on your skills as a pilot to win the <title>day for Earth."};
        field_e = "Shield recharged";
    }
}
