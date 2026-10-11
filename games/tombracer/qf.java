/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qf extends uia {
    static da field_j;
    static String field_l;
    static nh[] field_k;
    static int field_i;

    final void a(byte param0, float param1) {
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        int var3 = jaclib.memory.Stream.floatToRawIntBits(param1);
        int fieldTemp$0 = this.field_h;
        this.field_h = this.field_h + 1;
        this.field_g[fieldTemp$0] = (byte)var3;
        int fieldTemp$1 = this.field_h;
        this.field_h = this.field_h + 1;
        this.field_g[fieldTemp$1] = (byte)(var3 >> 8);
        if (param0 == 114) {
          fieldTemp$2 = this.field_h;
          this.field_h = this.field_h + 1;
          this.field_g[fieldTemp$2] = (byte)(var3 >> 16);
          fieldTemp$3 = this.field_h;
          this.field_h = this.field_h + 1;
          this.field_g[fieldTemp$3] = (byte)(var3 >> 24);
          return;
        }
        field_k = (nh[]) null;
        int fieldTemp$4 = this.field_h;
        this.field_h = this.field_h + 1;
        this.field_g[fieldTemp$4] = (byte)(var3 >> 16);
        int fieldTemp$5 = this.field_h;
        this.field_h = this.field_h + 1;
        this.field_g[fieldTemp$5] = (byte)(var3 >> 24);
    }

    final static String a(int param0, String param1, String param2, String param3) {
        int var5 = TombRacer.field_G ? 1 : 0;
        int var4 = param3.indexOf(param2);
        while (var4 != -1) {
          param3 = param3.substring(0, var4) + param1 + param3.substring(var4 + param2.length());
          var4 = param3.indexOf(param2, param1.length() + var4);
        }
        if (param0 == 966747152) {
          return param3;
        }
        field_k = (nh[]) null;
        return param3;
    }

    public static void g(byte param0) {
        field_j = null;
        if (param0 != -93) {
          qf.g((byte) -23);
          field_k = null;
          field_l = null;
          return;
        }
        field_k = null;
        field_l = null;
    }

    qf(int param0) {
        super(param0);
    }

    final void a(int param0, float param1) {
        int fieldTemp$1 = 0;
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        int var3 = jaclib.memory.Stream.floatToRawIntBits(param1);
        int fieldTemp$0 = this.field_h;
        this.field_h = this.field_h + 1;
        this.field_g[fieldTemp$0] = (byte)(var3 >> 24);
        if (param0 == 17133) {
          fieldTemp$1 = this.field_h;
          this.field_h = this.field_h + 1;
          this.field_g[fieldTemp$1] = (byte)(var3 >> 16);
          fieldTemp$2 = this.field_h;
          this.field_h = this.field_h + 1;
          this.field_g[fieldTemp$2] = (byte)(var3 >> 8);
          fieldTemp$3 = this.field_h;
          this.field_h = this.field_h + 1;
          this.field_g[fieldTemp$3] = (byte)var3;
          return;
        }
        field_l = (String) null;
        int fieldTemp$4 = this.field_h;
        this.field_h = this.field_h + 1;
        this.field_g[fieldTemp$4] = (byte)(var3 >> 16);
        int fieldTemp$5 = this.field_h;
        this.field_h = this.field_h + 1;
        this.field_g[fieldTemp$5] = (byte)(var3 >> 8);
        int fieldTemp$6 = this.field_h;
        this.field_h = this.field_h + 1;
        this.field_g[fieldTemp$6] = (byte)var3;
    }

    static {
        field_l = "Sound: ";
    }
}
