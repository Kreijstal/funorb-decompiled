/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class sg implements Runnable {
    static int field_e;
    static String field_b;
    private InputStream field_m;
    private boolean field_k;
    private byte[] field_p;
    private int field_n;
    static SceneWidget field_i;
    private int field_j;
    private java.net.Socket field_d;
    static String field_h;
    static int field_c;
    private OutputStream field_l;
    private int field_g;
    private wj field_o;
    private pn field_a;
    private boolean field_f;

    final void a(boolean param0) throws IOException {
        if (this.field_f) {
          return;
        }
        if (this.field_k) {
          this.field_k = false;
          throw new IOException();
        }
        if (!param0) {
          sg.a((byte) -109, '`');
          return;
        }
    }

    final static mg a(SceneWidget param0, mn param1, boolean param2, SceneWidget param3, SceneWidget param4) {
        int var14 = 0;
        Object stackIn_3_0 = null;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        mg stackIn_12_0 = null;
        mg stackIn_30_0 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_37_2 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_40_2 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_43_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        String[] var8 = null;
        char[] var9 = null;
        int[] var10 = null;
        mg[] var11 = null;
        int var12 = 0;
        mn var13_ref_mn = null;
        int var13 = 0;
        int var15 = 0;
        ao var16 = null;
        int var17 = 0;
        int[] var18 = null;
        char[] var19 = null;
        int[] var20 = null;
        char[] var21 = null;
        int var12Lifetime1;
        var17 = SteelSentinels.obfuscationControl;
        try {
          if (param1 == null) {
            stackIn_3_0 = null;
            return (mg) (stackIn_3_0);
          }
          if (null != param1.field_C) {
            stackIn_7_0 = param1.field_C.length;
          } else {
            stackIn_7_0 = 0;
          }
          var5_int = stackIn_7_0;
          if (param1.field_A != null) {
            stackIn_10_0 = param1.field_A.length;
          } else {
            stackIn_10_0 = 0;
          }
          var6 = stackIn_10_0;
          var7 = var6 + var5_int;
          var8 = new String[var7];
          var21 = new char[var7];
          var19 = var21;
          var9 = var19;
          var20 = new int[var7];
          var18 = var20;
          var10 = var18;
          if (param2) {
            stackIn_12_0 = (mg) null;
            return stackIn_12_0;
          }
          var11 = new mg[var7];
          if (param1.field_C != null) {
            for (var12 = 0; param1.field_C.length > var12; var12++) {
              var13_ref_mn = cd.field_e.a((byte) -13, param1.field_C[var12]);
              var8[var12] = var13_ref_mn.field_D;
              var9[var12] = param1.field_z[var12];
              var11[var12] = sg.a(param0, var13_ref_mn, false, param3, param4);
            }
          }
          if (null != param1.field_A) {
            var12Lifetime1 = var5_int;
            var13 = 49;
            for (var14 = 0; param1.field_A.length > var14; var14++) {
              var15 = param1.field_A[var14];
              if (var15 == -1) {
                var8[var14 + var12Lifetime1] = od.field_b;
                var9[var12Lifetime1 + var14] = param1.field_F[var14];
                var10[var12Lifetime1 + var14] = param1.field_A[var14];
              } else {
                var16 = jl.field_w.a(var15, -118);
                var8[var14 + var12Lifetime1] = var16.i(1);
                var9[var14 + var12Lifetime1] = param1.field_F[var14];
                if (var9[var14 + var12Lifetime1] <= 0) {
                  var13 = (char)(var13 + 1);
                  var9[var12Lifetime1 + var14] = (char)var13;
                }
                var10[var14 + var12Lifetime1] = param1.field_A[var14];
              }
            }
          }
          stackIn_30_0 = new mg(0L, param0, param4, param3, var11, var20, var8, var21);
          return stackIn_30_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_33_0 = var5;
          stackIn_33_1 = new StringBuilder().append("sg.J(");
          if (param0 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          stackIn_36_1 = ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(',');
          if (param1 == null) {
            stackIn_37_2 = "null";
          } else {
            stackIn_37_2 = "{...}";
          }
          stackIn_39_1 = ((StringBuilder) (Object) stackIn_36_1).append(stackIn_37_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_40_2 = "null";
          } else {
            stackIn_40_2 = "{...}";
          }
          stackIn_42_1 = ((StringBuilder) (Object) stackIn_39_1).append(stackIn_40_2).append(',');
          if (param4 == null) {
            stackIn_43_2 = "null";
          } else {
            stackIn_43_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_33_0), ((StringBuilder) (Object) stackIn_42_1).append(stackIn_43_2).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_b = null;
        field_h = null;
        field_i = null;
        if (param0 > -43) {
          SceneWidget var2 = (SceneWidget) null;
          sg.a(30, -23, (SceneWidget) null, -70, 104, (SceneWidget) null, (byte[]) null, (byte) 72, (SceneWidget) null, 102);
          return;
        }
    }

    final void b(int param0) {
        try {
          Throwable decompiledCaughtException = null;
          Object var2 = null;
          InterruptedException var2_ref = null;
          int var4 = 0;
          var4 = SteelSentinels.obfuscationControl;
          if (this.field_f) {
            return;
          }
          var2 = this;
          synchronized (var2) {
            this.field_f = true;
            this.notifyAll();
          }
          if (param0 != 12110) {
            this.field_p = (byte[]) null;
          }
          if (null != this.field_o) {
            while (this.field_o.field_a == 0) {
              a.a((byte) 120, 1L);
            }
            if (this.field_o.field_a == 1) {
              try {
                ((Thread) (this.field_o.field_c)).join();
              } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var2_ref = (InterruptedException) (Object) decompiledCaughtException;
                this.field_o = null;
                return;
              }
            }
          }
          this.field_o = null;
          return;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final void run() {
        try {
          int decompiledRegionSelector0 = 0;
          Throwable decompiledCaughtException = null;
          int var1_int = 0;
          IOException var1 = null;
          Exception var1_ref = null;
          int var2 = 0;
          Object var3 = null;
          IOException var3_ref = null;
          InterruptedException var4 = null;
          int var6 = 0;
          String var7 = null;
          var6 = SteelSentinels.obfuscationControl;
          try {
            while (true) {
              var3 = this;
              synchronized (var3) {
                boolean decompiledFrameRemainder0 = true;
                if (this.field_g == this.field_n) {
                  if (this.field_f) {
                    decompiledRegionSelector0 = 0;
                    decompiledFrameRemainder0 = false;
                  }
                  else {
                    try {
                      this.wait();
                    } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      var4 = (InterruptedException) (Object) decompiledCaughtException;
                    }
                  }
                }
                if (decompiledFrameRemainder0) {
                  var2 = this.field_n;
                  if (this.field_g < this.field_n) {
                    var1_int = -this.field_n + this.field_j;
                  } else {
                    var1_int = -this.field_n + this.field_g;
                  }
                  decompiledRegionSelector0 = 1;
                }
              }
              if (decompiledRegionSelector0 == 0) {
                try {
                  if (this.field_m != null) {
                    this.field_m.close();
                  }
                  if (this.field_l != null) {
                    this.field_l.close();
                  }
                  if (null != this.field_d) {
                    this.field_d.close();
                  }
                } catch (java.io.IOException decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  var1 = (IOException) (Object) decompiledCaughtException;
                }
                this.field_p = null;
                break;
              }
              if (var1_int <= 0) {
                continue;
              }
              try {
                this.field_l.write(this.field_p, var2, var1_int);
              } catch (java.io.IOException decompiledCaughtParameter2) {
                decompiledCaughtException = decompiledCaughtParameter2;
                var3_ref = (IOException) (Object) decompiledCaughtException;
                this.field_k = true;
              }
              this.field_n = (var1_int + this.field_n) % this.field_j;
              try {
                if (this.field_g == this.field_n) {
                  this.field_l.flush();
                }
              } catch (java.io.IOException decompiledCaughtParameter3) {
                decompiledCaughtException = decompiledCaughtParameter3;
                var3_ref = (IOException) (Object) decompiledCaughtException;
                this.field_k = true;
              }
            }
          } catch (java.lang.Exception decompiledCaughtParameter4) {
            decompiledCaughtException = decompiledCaughtParameter4;
            var1_ref = (Exception) (Object) decompiledCaughtException;
            var7 = (String) null;
            sj.a((String) null, -59, (Throwable) ((Object) var1_ref));
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(int param0, int param1, byte[] param2, int param3) throws IOException {
        int var5_int = 0;
        int var6 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var6 = SteelSentinels.obfuscationControl;
        try {
          if (this.field_f) {
            return;
          }
          while (param1 > 0) {
            var5_int = this.field_m.read(param2, param0, param1);
            if (0 >= var5_int) {
              throw new EOFException();
            }
            param0 = param0 + var5_int;
            param1 = param1 - var5_int;
          }
          if (param3 == -256) {
            return;
          }
          this.b(76);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_14_0 = var5;
          stackIn_14_1 = new StringBuilder().append("sg.E(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param3).append(')').toString());
        }
    }

    final static void a(int param0, int param1, SceneWidget param2, int param3, int param4, SceneWidget param5, byte[] param6, byte param7, SceneWidget param8, int param9) {
        int var11 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var10_int = 0;
        RuntimeException var10 = null;
        int var12 = 0;
        var12 = SteelSentinels.obfuscationControl;
        try {
          GameplayController.field_G = -1L;
          wb.field_j = param6;
          gl.field_v = param1;
          be.field_a = param6.length;
          ad.field_f = false;
          rb.field_i = new byte[(gl.field_v + 7) / 8];
          nf.field_b = null;
          ni.field_a = null;
          var10_int = 0;
          for (var11 = 0; wb.field_j.length > var11; var11++) {
            var10_int = var10_int + (255 & wb.field_j[var11]);
          }
          var10_int = (var10_int + 7) / 8;
          ti.field_s = new byte[var10_int];
          if (null == param5.field_M) {
            param5.field_M = new NodeDeque();
          }
          q.field_m = param5.field_M;
          q.field_m.clear(6);
          t.field_c = new dk(param0);
          if (param7 >= -10) {
            return;
          }
          ba.field_b = -1;
          ja.field_a = 0;
          bj.field_j = 0;
          ud.field_D = -1;
          if (null == param8.field_M) {
            param8.field_M = new NodeDeque();
          }
          ci.field_e = param8.field_M;
          ci.field_e.clear(6);
          fm.field_a = new dk(param3);
          if (param2.field_M == null) {
            param2.field_M = new NodeDeque();
          }
          o.field_d = param2.field_M;
          o.field_d.clear(6);
          me.field_b = new dk(param4);
          ka.field_R = 0L;
          ta.field_l = param9;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10 = decompiledCaughtException;
          stackIn_16_0 = var10;
          stackIn_16_1 = new StringBuilder().append("sg.D(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          stackIn_22_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',');
          if (param6 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          stackIn_25_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param7).append(',');
          if (param8 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param9).append(')').toString());
        }
    }

    sg(java.net.Socket param0, pn param1) throws IOException {
        this(param0, param1, 5000);
    }

    final int b(byte param0) throws IOException {
        if (param0 != -94) {
          field_c = 66;
          if (!this.field_f) {
            return this.field_m.read();
          }
          return 0;
        }
        if (!this.field_f) {
          return this.field_m.read();
        }
        return 0;
    }

    final int a(int param0) throws IOException {
        if (this.field_f) {
          return 0;
        }
        if (param0 > -112) {
          return 108;
        }
        return this.field_m.available();
    }

    protected final void finalize() {
        this.b(12110);
    }

    final static char a(byte param0, char param1) {
        int var2;
        int var3;
        var3 = SteelSentinels.obfuscationControl;
        if (param0 != 115) {
          return '\n';
        }
        var2 = param1;
        if (var2 == 32) {
          return '_';
        }
        if (160 == var2) {
          return '_';
        }
        if (95 == var2) {
          return '_';
        }
        if (var2 == 45) {
          return '_';
        }
        if (91 == var2) {
          return param1;
        }
        if (var2 == 93) {
          return param1;
        }
        if (var2 == 35) {
          return param1;
        }
        if (var2 == 224) {
          return 'a';
        }
        if (var2 == 225) {
          return 'a';
        }
        if (var2 == 226) {
          return 'a';
        }
        if (var2 == 228) {
          return 'a';
        }
        if (var2 == 227) {
          return 'a';
        }
        if (var2 == 192) {
          return 'a';
        }
        if (var2 == 193) {
          return 'a';
        }
        if (var2 == 194) {
          return 'a';
        }
        if (var2 == 196) {
          return 'a';
        }
        if (var2 == 195) {
          return 'a';
        }
        if (232 == var2) {
          return 'e';
        }
        if (233 == var2) {
          return 'e';
        }
        if (var2 == 234) {
          return 'e';
        }
        if (var2 == 235) {
          return 'e';
        }
        if (200 == var2) {
          return 'e';
        }
        if (var2 == 201) {
          return 'e';
        }
        if (var2 == 202) {
          return 'e';
        }
        if (203 == var2) {
          return 'e';
        }
        if (var2 == 237) {
          return 'i';
        }
        if (var2 == 238) {
          return 'i';
        }
        if (var2 == 239) {
          return 'i';
        }
        if (var2 == 205) {
          return 'i';
        }
        if (var2 == 206) {
          return 'i';
        }
        if (var2 == 207) {
          return 'i';
        }
        if (242 == var2) {
          return 'o';
        }
        if (var2 == 243) {
          return 'o';
        }
        if (var2 == 244) {
          return 'o';
        }
        if (var2 == 246) {
          return 'o';
        }
        if (var2 == 245) {
          return 'o';
        }
        if (var2 == 210) {
          return 'o';
        }
        if (var2 == 211) {
          return 'o';
        }
        if (var2 == 212) {
          return 'o';
        }
        if (var2 == 214) {
          return 'o';
        }
        if (var2 == 213) {
          return 'o';
        }
        if (var2 == 249) {
          return 'u';
        }
        if (var2 == 250) {
          return 'u';
        }
        if (var2 == 251) {
          return 'u';
        }
        if (var2 == 252) {
          return 'u';
        }
        if (var2 == 217) {
          return 'u';
        }
        if (var2 == 218) {
          return 'u';
        }
        if (var2 == 219) {
          return 'u';
        }
        if (var2 == 220) {
          return 'u';
        }
        if (var2 == 231) {
          return 'c';
        }
        if (var2 == 199) {
          return 'c';
        }
        if (var2 == 255) {
          return 'y';
        }
        if (var2 == 376) {
          return 'y';
        }
        if (var2 == 241) {
          return 'n';
        }
        if (var2 == 209) {
          return 'n';
        }
        if (var2 == 223) {
          return 'b';
        }
        return Character.toLowerCase(param1);
    }

    final void a(int param0, byte[] param1, int param2, int param3) throws IOException {
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        Throwable decompiledCaughtException = null;
        Object var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        int var8 = 0;
        var8 = SteelSentinels.obfuscationControl;
        try {
          if (this.field_f) {
            return;
          }
          if (this.field_k) {
            this.field_k = false;
            throw new IOException();
          }
          if (this.field_p == null) {
            this.field_p = new byte[this.field_j];
          }
          var5 = this;
          synchronized (var5) {
            var6 = 0;
            if (param2 != -100) {
              return;
            }
            while (param0 > var6) {
              this.field_p[this.field_g] = param1[var6 + param3];
              this.field_g = (1 + this.field_g) % this.field_j;
              if (this.field_g == (-100 + this.field_n + this.field_j) % this.field_j) {
                throw new IOException();
              }
              var6++;
            }
            if (null == this.field_o) {
              this.field_o = this.field_a.a(2, 3, (Runnable) (this));
            }
            this.notifyAll();
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_28_0 = var5_ref;
          stackIn_28_1 = new StringBuilder().append("sg.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private sg(java.net.Socket param0, pn param1, int param2) throws IOException {
        this.field_k = false;
        this.field_g = 0;
        this.field_n = 0;
        this.field_f = false;
        try {
          this.field_a = param1;
          this.field_d = param0;
          this.field_d.setSoTimeout(30000);
          this.field_d.setTcpNoDelay(true);
          this.field_m = this.field_d.getInputStream();
          this.field_l = this.field_d.getOutputStream();
          this.field_j = param2;
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "sg.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_h = "Press TAB to chat or F10 to open Quick Chat.";
        field_b = "Hide chat";
    }
}
