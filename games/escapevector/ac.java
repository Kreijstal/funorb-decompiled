/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ac {
    static String field_a;
    static String field_d;
    static ih field_c;
    static int field_b;

    final static void a(int param0, int param1) {
        dj.a(6445);
        if (param0 != 25972) {
          field_c = (ih) null;
        }
    }

    final static void b(int param0) {
        if (bk.field_r != null) {
          bk.field_r.a((byte) -124);
          if (param0 != 112) {
            ac.d(-21);
            return;
          }
          return;
        }
        if (param0 == 112) {
          return;
        }
        ac.d(-21);
    }

    final static void d(int param0) {
        try {
          Throwable decompiledCaughtException = null;
          int var3 = EscapeVector.obfuscationControl;
          try {
            if (SelfDestructEffects.field_j != null) {
              SelfDestructEffects.field_j.a(param0 ^ -16802);
            }
            if (ShipHullGeometry.field_b != null) {
              ShipHullGeometry.field_b.a(-24580);
            }
            if (param0 != -16802) {
              return;
            }
            if (uc.field_h != null) {
              try {
                uc.field_h.a((byte) -111);
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                IOException var1 = (IOException) (Object) decompiledCaughtException;
              }
            }
            if (bg.field_e == null) {
              return;
            }
            for (int var1_int = 0; bg.field_e.length > var1_int; var1_int++) {
              if (bg.field_e[var1_int] != null) {
                try {
                  bg.field_e[var1_int].a((byte) -111);
                } catch (java.io.IOException decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  IOException var2 = (IOException) (Object) decompiledCaughtException;
                }
              }
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
            decompiledCaughtException = decompiledCaughtParameter2;
            RuntimeException var1_ref = (RuntimeException) (Object) decompiledCaughtException;
            throw t.a((Throwable) ((Object) var1_ref), "ac.F(" + param0 + ')');
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0) {
        int var2 = 0;
        int var4 = EscapeVector.obfuscationControl;
        try {
          Object var1 = ck.field_v;
          synchronized (var1) {
            if (param0 != 28087) {
              field_b = -95;
            }
            ui.field_e = ui.field_e + 1;
            ve.field_l = ta.field_w;
            if (Js5Transport.field_b < 0) {
              int var5 = 0;
              var2 = var5;
              while (112 > var5) {
                ScoreSubmission.field_h[var5] = false;
                var5++;
              }
              Js5Transport.field_b = TetherHumStream.field_k;
            } else {
              while (TetherHumStream.field_k != Js5Transport.field_b) {
                var2 = TextButton.field_C[TetherHumStream.field_k];
                TetherHumStream.field_k = 127 & 1 + TetherHumStream.field_k;
                if (0 <= var2) {
                  ScoreSubmission.field_h[var2] = true;
                  continue;
                }
                ScoreSubmission.field_h[~var2] = false;
              }
            }
            ta.field_w = bn.field_b;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          Throwable decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var1_ref = (RuntimeException) (Object) decompiledCaughtException;
          throw t.a((Throwable) ((Object) var1_ref), "ac.B(" + param0 + ')');
        }
    }

    final static CoverageBitmapFont a(String param0, int param1, ResourceArchive param2, String param3, ResourceArchive param4) {
        String stackIn_5_2 = null;
        String stackIn_8_2 = null;
        String stackIn_11_2 = null;
        String stackIn_14_2 = null;
        try {
          int var5_int = 4 % ((50 - param1) / 60);
          int var6 = param2.findGroupId(-1, param3);
          int var7 = param2.findFileId(var6, param0, true);
          CoverageBitmapFont stackIn_1_0 = ha.a(var6, -198630768, param4, var7, param2);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5 = decompiledCaughtException;
          RuntimeException stackIn_4_0 = var5;
          StringBuilder stackIn_4_1 = new StringBuilder().append("ac.A(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          StringBuilder stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          StringBuilder stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param3 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          StringBuilder stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param4 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    public static void releaseStatics(int guard) {
        field_d = null;
        int var1 = 76 / ((guard + 3) / 33);
        field_a = null;
        field_c = null;
    }

    static {
        field_a = "Fullscreen play is an option available to subscribing members only. For more details see the website.";
    }
}
