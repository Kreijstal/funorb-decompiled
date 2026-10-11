/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ej implements Runnable {
    private le field_f;
    private sj field_b;
    private java.net.URL field_i;
    private int field_e;
    static oq field_j;
    private le field_a;
    private ge field_d;
    static String field_c;
    private DataInputStream field_h;
    static int field_g;
    private le field_k;
    static boolean field_l;

    final synchronized boolean a(byte param0) {
        Throwable decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        java.net.Socket var3 = null;
        IOException var3_ref = null;
        OutputStream var4 = null;
        try {
          if (this.field_e >= 2) {
            return true;
          }
          if (this.field_e == 0) {
            if (this.field_a == null) {
              this.field_a = this.field_b.a(this.field_i, 1);
            }
            if (this.field_a.field_f == 0) {
              return false;
            }
            if (this.field_a.field_f != 1) {
              this.field_a = null;
              this.field_e = this.field_e + 1;
              return false;
            }
          }
          if (this.field_e == 1) {
            if (null == this.field_k) {
              this.field_k = this.field_b.a(this.field_i.getHost(), 443, 0);
            }
            if (this.field_k.field_f == 0) {
              return false;
            }
            if (this.field_k.field_f != 1) {
              this.field_e = this.field_e + 1;
              this.field_k = null;
              return false;
            }
          }
          var2_int = 25 % ((-61 - param0) / 46);
          if (null == this.field_h) {
            try {
              if (0 == this.field_e) {
                this.field_h = (DataInputStream) (this.field_a.field_e);
              }
              if (1 == this.field_e) {
                var3 = (java.net.Socket) (this.field_k.field_e);
                var3.setSoTimeout(10000);
                var4 = var3.getOutputStream();
                var4.write(17);
                var4.write(hi.a(-98, (CharSequence) ((Object) ("JAGGRAB " + this.field_i.getFile() + "\n\n"))));
                this.field_h = new DataInputStream(var3.getInputStream());
              }
              this.field_d.field_v = 0;
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var3_ref = (IOException) (Object) decompiledCaughtException;
              this.finalize();
              this.field_e = this.field_e + 1;
            }
          }
          if (null == this.field_f) {
            this.field_f = this.field_b.a(45, 5, (Runnable) (this));
          }
          if (0 == this.field_f.field_f) {
            return false;
          }
          if (this.field_f.field_f != 1) {
            this.finalize();
            this.field_e = this.field_e + 1;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var2 = (RuntimeException) (Object) decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var2), "ej.D(" + param0 + ')');
        }
    }

    final static void a(int param0, eg param1, int param2, boolean param3, int param4, int param5, int param6, int param7, eg param8, eg param9) {
        byte fieldTemp$0 = 0;
        RuntimeException stackIn_191_0 = null;
        StringBuilder stackIn_191_1 = null;
        String stackIn_192_2 = null;
        StringBuilder stackIn_195_1 = null;
        String stackIn_196_2 = null;
        StringBuilder stackIn_199_1 = null;
        String stackIn_200_2 = null;
        RuntimeException decompiledCaughtException = null;
        eg var10 = null;
        RuntimeException var10_ref = null;
        eg var11 = null;
        int var12 = 0;
        eg var12_ref_eg = null;
        int var13 = 0;
        var13 = Pool.field_O;
        try {
          boolean decompiledFrameCompleted4 = true;
          mj.field_a = param1.field_Y;
          hi.field_k = param8.field_N;
          vn.field_h = param8.field_v;
          kp.field_h = param1;
          nr.field_P = param8.field_X;
          ro.field_d = param8.field_q;
          sa.field_r = param8.field_Y;
          eh.field_w = param1.field_g;
          gn.field_e = param8;
          nk.field_b = param1.field_X;
          wn.field_d = param1.field_N;
          qp.field_Yb = param8.field_g;
          sa.field_w = param1.field_q;
          f.field_b = param1.field_v;
          u.a(param0, param4, param6, true, (int[]) null, (int[]) null, param9.field_g, param9.field_N, param5, (int[]) null, param9.field_q, param2, param9.field_K, param9.field_Y, param9.field_Q, param9.field_X, (int[]) null, param7, param9.field_v, param9.field_l, (int[]) null, param9, param9.field_B, (int[]) null);
          var10 = param8;
          param1.field_J = null;
          var10.field_J = null;
          var11 = param8;
          param1.field_Z = null;
          param8.field_X = nr.field_P;
          param8.field_g = qp.field_Yb;
          param8.field_B = nk.field_a;
          param8.field_Y = sa.field_r;
          param8.field_q = ro.field_d;
          param8.field_l = ld.field_g;
          param8.field_M = nj.field_d;
          param8.field_K = uf.field_W;
          var11.field_Z = null;
          param8.field_v = vn.field_h;
          param8.field_N = hi.field_k;
          param1.field_N = wn.field_d;
          param1.field_q = sa.field_w;
          param1.field_v = f.field_b;
          param1.field_Y = mj.field_a;
          param1.field_g = eh.field_w;
          param1.field_M = vk.field_bb;
          param1.field_B = de.field_a;
          param1.field_K = eq.field_R;
          param1.field_X = nk.field_b;
          param1.field_l = ja.field_a;
          if (param9.field_Q != null) {
            if (null == param8.field_Q ||
              !(param8.field_Q.length >= param8.field_K)) {
              param8.field_Q = new byte[param8.field_K + 100];
            }
            if (param1.field_Q == null ||
              !(param1.field_Q.length >= param1.field_K)) {
              param1.field_Q = new byte[100 + param1.field_K];
            }
            var12 = 0;
            while (true) {
              if (param8.field_K > var12) {
                param8.field_Q[var12] = param9.field_Q[hr.field_n[var12]];
                var12++;
                if (var13 == 0) {
                  continue;
                }
              } else {
                var12 = 0;
              }
              break;
            }
            while (var12 < param1.field_K) {
              param1.field_Q[var12] = param9.field_Q[gr.field_B[var12]];
              var12++;
              if (var13 != 0) {
                decompiledFrameCompleted4 = false;
                break;
              }
            }
            if ((decompiledFrameCompleted4) &&
              (var13 != 0)) {
              param1.field_Q = null;
              var12_ref_eg = param8;
              var12_ref_eg.field_Q = null;
            }
          } else {
            param1.field_Q = null;
            var12_ref_eg = param8;
            var12_ref_eg.field_Q = null;
          }
          if (param3) {
            field_j = (oq) null;
          }
          boolean decompiledFrameRemainder2 = true;
          boolean decompiledFrameCompleted1 = true;
          boolean decompiledFrameCompleted2 = true;
          boolean decompiledFrameRemainder1 = true;
          boolean decompiledFrameCompleted3 = true;
          boolean decompiledFrameRemainder0 = true;
          if (param9.field_P == null) {
            param1.field_P = null;
            var12_ref_eg = param8;
            fieldTemp$0 = param9.field_t;
            param1.field_t = param9.field_t;
            param8.field_t = fieldTemp$0;
            var12_ref_eg.field_P = null;
            decompiledFrameRemainder0 = (var13 != 0);
          }
          if (decompiledFrameRemainder0) {
            if (param8.field_P == null ||
              !(param8.field_P.length >= param8.field_K)) {
              param8.field_P = new byte[param8.field_K + 100];
            }
            if (null == param1.field_P ||
              !(param1.field_K <= param1.field_P.length)) {
              param1.field_P = new byte[100 + param1.field_K];
            }
            var12 = 0;
            do {
              if (!(var12 < param8.field_K)) {
                var12 = 0;
                break;
              }
              param8.field_P[var12] = param9.field_P[hr.field_n[var12]];
              var12++;
            } while (var13 == 0);
            while (!(param1.field_K <= var12)) {
              param1.field_P[var12] = param9.field_P[gr.field_B[var12]];
              var12++;
              if (var13 != 0) {
                decompiledFrameCompleted3 = false;
                break;
              }
            }
          }
          if ((decompiledFrameCompleted3) &&
            (null == param9.field_f)) {
            var12_ref_eg = param8;
            param1.field_f = null;
            var12_ref_eg.field_f = null;
            decompiledFrameRemainder1 = (var13 != 0);
          }
          if (decompiledFrameRemainder1) {
            if (null == param8.field_f ||
              !(param8.field_K <= param8.field_f.length)) {
              param8.field_f = new byte[param8.field_K + 100];
            }
            if (null == param1.field_f ||
              !(param1.field_f.length >= param1.field_K)) {
              param1.field_f = new byte[param1.field_K + 100];
            }
            var12 = 0;
            do {
              if (!(param8.field_K > var12)) {
                var12 = 0;
                break;
              }
              param8.field_f[var12] = param9.field_f[hr.field_n[var12]];
              var12++;
            } while (var13 == 0);
            while (!(var12 >= param1.field_K)) {
              param1.field_f[var12] = param9.field_f[gr.field_B[var12]];
              var12++;
              if (var13 != 0) {
                decompiledFrameCompleted2 = false;
                break;
              }
            }
          }
          if ((decompiledFrameCompleted2) &&
            (null != param9.field_k)) {
            if (null == param8.field_k ||
              !(param8.field_K <= param8.field_k.length)) {
              param8.field_k = new byte[100 + param8.field_K];
            }
            if (null == param1.field_k ||
              !(param1.field_k.length >= param1.field_K)) {
              param1.field_k = new byte[100 + param1.field_K];
            }
            var12 = 0;
            while (true) {
              if (param8.field_K > var12) {
                param8.field_k[var12] = param9.field_k[hr.field_n[var12]];
                var12++;
                if (var13 == 0) {
                  continue;
                }
              } else {
                var12 = 0;
              }
              break;
            }
            while (param1.field_K > var12) {
              param1.field_k[var12] = param9.field_k[gr.field_B[var12]];
              var12++;
              if (var13 != 0) {
                decompiledFrameCompleted1 = false;
                break;
              }
            }
            if (decompiledFrameCompleted1) {
              decompiledFrameRemainder2 = (var13 != 0);
            }
          }
          if ((decompiledFrameRemainder2) &&
            (decompiledFrameCompleted1)) {
            var12_ref_eg = param8;
            param1.field_k = null;
            var12_ref_eg.field_k = null;
          }
          boolean decompiledFrameCompleted0 = true;
          if (param9.field_n != null) {
            if (param8.field_n == null ||
              !(param8.field_K <= param8.field_n.length)) {
              param8.field_n = new short[100 + param8.field_K];
            }
            if (param1.field_n == null ||
              !(param1.field_K <= param1.field_n.length)) {
              param1.field_n = new short[param1.field_K + 100];
            }
            var12 = 0;
            while (true) {
              if (var12 < param8.field_K) {
                param8.field_n[var12] = param9.field_n[hr.field_n[var12]];
                var12++;
                if (var13 == 0) {
                  continue;
                }
              } else {
                var12 = 0;
              }
              break;
            }
            while (param1.field_K > var12) {
              param1.field_n[var12] = param9.field_n[gr.field_B[var12]];
              var12++;
              if (var13 != 0) {
                decompiledFrameCompleted0 = false;
                break;
              }
            }
            if ((decompiledFrameCompleted0) &&
              (var13 != 0)) {
              param1.field_n = null;
              var12_ref_eg = param8;
              var12_ref_eg.field_n = null;
            }
          } else {
            param1.field_n = null;
            var12_ref_eg = param8;
            var12_ref_eg.field_n = null;
          }
          if (param9.field_L == null) {
            var12_ref_eg = param8;
            param1.field_L = null;
            var12_ref_eg.field_L = null;
            if (var13 == 0) {
              return;
            }
          }
          if (param8.field_L == null ||
            !(param8.field_L.length >= param8.field_K)) {
            param8.field_L = new short[100 + param8.field_K];
          }
          if (null == param1.field_L ||
            !(param1.field_L.length >= param1.field_K)) {
            param1.field_L = new short[100 + param1.field_K];
          }
          var12 = 0;
          do {
            if (!(var12 < param8.field_K)) {
              var12 = 0;
              break;
            }
            param8.field_L[var12] = param9.field_L[hr.field_n[var12]];
            var12++;
          } while (var13 == 0);
          while (true) {
            if (param1.field_K <= var12) {
              return;
            }
            param1.field_L[var12] = param9.field_L[gr.field_B[var12]];
            var12++;
            if (var13 != 0) {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10_ref = decompiledCaughtException;
          stackIn_191_0 = var10_ref;
          stackIn_191_1 = new StringBuilder().append("ej.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_192_2 = "null";
          } else {
            stackIn_192_2 = "{...}";
          }
          stackIn_195_1 = ((StringBuilder) (Object) stackIn_191_1).append(stackIn_192_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',');
          if (param8 == null) {
            stackIn_196_2 = "null";
          } else {
            stackIn_196_2 = "{...}";
          }
          stackIn_199_1 = ((StringBuilder) (Object) stackIn_195_1).append(stackIn_196_2).append(',');
          if (param9 == null) {
            stackIn_200_2 = "null";
          } else {
            stackIn_200_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_191_0), ((StringBuilder) (Object) stackIn_199_1).append(stackIn_200_2).append(')').toString());
        }
    }

    final ge a(int param0) {
        RuntimeException var2 = null;
        ge stackIn_2_0 = null;
        ge stackIn_5_0 = null;
        Object stackIn_7_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -25955) {
            stackIn_2_0 = (ge) null;
            return stackIn_2_0;
          }
          if (this.field_e != 3) {
            stackIn_7_0 = null;
            return (ge) (stackIn_7_0);
          }
          stackIn_5_0 = this.field_d;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var2), "ej.E(" + param0 + ')');
        }
    }

    public final void run() {
        try {
          int stackIn_13_0 = 0;
          int stackIn_13_1 = 0;
          Throwable decompiledCaughtException = null;
          int var1_int = 0;
          Object var1 = null;
          Exception var1_ref = null;
          RuntimeException var1_ref2 = null;
          Object var2 = null;
          int var4 = 0;
          var4 = Pool.field_O;
          try {
            try {
              L2: while (true) {
                if (this.field_d.field_t.length > this.field_d.field_v) {
                  var1_int = this.field_h.read(this.field_d.field_t, this.field_d.field_v, this.field_d.field_t.length - this.field_d.field_v);
                  stackIn_13_0 = -1;
                  stackIn_13_1 = ~var1_int;
                  if (var4 != 0) {
                    break L2;
                  }
                  if (stackIn_13_0 >= stackIn_13_1 ||
                    var4 != 0) {
                    this.field_d.field_v = this.field_d.field_v + var1_int;
                    continue;
                  }
                }
                stackIn_13_0 = ~this.field_d.field_t.length;
                stackIn_13_1 = ~this.field_d.field_v;
                break;
              }
              if (stackIn_13_0 == stackIn_13_1) {
                throw ej.<RuntimeException>$cfr$sneakyThrow(new Exception("HG1: " + this.field_d.field_t.length + " " + this.field_i));
              }
              var1 = this;
              synchronized (var1) {
                this.finalize();
                this.field_e = 3;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var1_ref = (Exception) (Object) decompiledCaughtException;
              var2 = this;
              synchronized (var2) {
                this.finalize();
                this.field_e = this.field_e + 1;
              }
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var1_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            throw wm.a((Throwable) ((Object) var1_ref2), "ej.run()");
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(boolean param0, int param1, int param2, byte param3, oc param4) {
        byte dupTemp$0 = 0;
        int stackIn_25_0 = 0;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        String stackIn_56_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var9Lifetime1;
        int var10Lifetime1;
        int var11Lifetime1;
        int var13Lifetime1;
        int var14Lifetime1;
        try {
          var7 = 101 / ((-47 - param3) / 46);
          var5_int = gi.a(3 * (-param2 + param1), 0);
          var6 = param2 * 3;
          var8 = -10 + var5_int;
          ar.a((byte) 48);
          if (0 < param4.field_I &&
            param4.field_K != null) {
            ka.h(0);
          }
          eh.field_x = 0;
          for (var9 = 0; param4.field_d > var9; var9++) {
            boolean decompiledFrameCompleted0 = true;
            var10 = param4.field_y[var9];
            var11 = param4.field_r[var9];
            var12 = param4.field_u[var9];
            if (param0) {
              var13 = ch.field_M[var10];
              var14 = li.field_h[var10];
              var15 = ch.field_M[var11] - var13;
              var16 = -var13 + ch.field_M[var12];
              var17 = -var14 + li.field_h[var11];
              var18 = li.field_h[var12] - var14;
            }
            if (!param0 ||
              !(var15 * var18 - var16 * var17 >= 0)) {
              var13Lifetime1 = fe.field_L[var10];
              if (-2147483648 != var13Lifetime1) {
                var14Lifetime1 = fe.field_L[var11];
                if (var14Lifetime1 != -2147483648) {
                  var15 = fe.field_L[var12];
                  if (var15 != -2147483648) {
                    var16 = -var6 + (var14Lifetime1 + var13Lifetime1 + var15);
                    if (0 > var8) {
                      stackIn_25_0 = var16 << -var8;
                    } else {
                      stackIn_25_0 = var16 >> var8;
                    }
                    var17 = -stackIn_25_0 + (lq.field_T.length - 1);
                    var18 = lq.field_T[var17];
                    while (var18 >> 4 != 0) {
                      var17--;
                      if (var17 < 0) {
                        System.err.println("Out of range!");
                        decompiledFrameCompleted0 = false;
                        break;
                      }
                      var18 = lq.field_T[var17];
                    }
                    if (decompiledFrameCompleted0) {
                      var19 = var18 + (var17 << 4);
                      tl.field_I[var19] = var9;
                      lq.field_T[var17] = 1 + var18;
                      if (param4.field_I > 0 &&
                        null != param4.field_K) {
                        dupTemp$0 = param4.field_K[var9];
                        wa.field_ib[dupTemp$0] = wa.field_ib[dupTemp$0] + 1;
                      }
                      eh.field_x = eh.field_x + 1;
                    }
                  }
                }
              }
            }
          }
          if (0 < param4.field_I &&
            param4.field_K != null) {
            var9Lifetime1 = 0;
            for (var10Lifetime1 = 0; wa.field_ib.length > var10Lifetime1; var10Lifetime1++) {
              var11Lifetime1 = wa.field_ib[var10Lifetime1];
              wa.field_ib[var10Lifetime1] = var9Lifetime1;
              var9Lifetime1 = var9Lifetime1 + var11Lifetime1;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_55_0 = var5;
          stackIn_55_1 = new StringBuilder().append("ej.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_56_2 = "null";
          } else {
            stackIn_56_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_55_0), ((StringBuilder) (Object) stackIn_55_1).append(stackIn_56_2).append(')').toString());
        }
    }

    protected final void finalize() {
        Exception exception = null;
        Throwable decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          if (this.field_a != null) {
            if (this.field_a.field_e != null) {
              try {
                ((DataInputStream) (this.field_a.field_e)).close();
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                exception = (Exception) (Object) decompiledCaughtException;
              }
            }
            this.field_a = null;
          }
          if (null != this.field_k) {
            if (this.field_k.field_e != null) {
              try {
                ((java.net.Socket) (this.field_k.field_e)).close();
              } catch (java.lang.Exception decompiledCaughtParameter1) {
                decompiledCaughtException = decompiledCaughtParameter1;
                exception = (Exception) (Object) decompiledCaughtException;
              }
            }
            this.field_k = null;
          }
          if (null != this.field_h) {
            try {
              this.field_h.close();
            } catch (java.lang.Exception decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              exception = (Exception) (Object) decompiledCaughtException;
            }
            this.field_h = null;
          }
          this.field_f = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
          decompiledCaughtException = decompiledCaughtParameter3;
          var1 = (RuntimeException) (Object) decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var1), "ej.finalize()");
        }
    }

    ej(sj param0, java.net.URL param1, int param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_i = param1;
          this.field_b = param0;
          this.field_d = new ge(param2);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("ej.<init>(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(')').toString());
        }
    }

    public static void a(boolean param0) {
        try {
          field_c = null;
          field_j = null;
          if (!param0) {
            field_l = false;
          }
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "ej.B(" + param0 + ')');
        }
    }

    static {
        field_c = "Please enter a year between <%0> and <%1>";
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
