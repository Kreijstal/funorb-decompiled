/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class bl extends DualLinkNode {
    static String field_u;
    int field_y;
    static Sprite field_x;
    static Sprite field_w;
    static int[] field_z;
    static ud[] field_v;

    final static void a(boolean param0) {
        try {
          int var1_int = 0;
          Throwable decompiledCaughtException = null;
          IOException var1 = null;
          RuntimeException var1_ref = null;
          IOException var2 = null;
          int var3 = 0;
          var3 = MinerDisturbance.field_ab;
          try {
            if (aj.field_c != null) {
              aj.field_c.b((byte) 35);
            }
            if (uf.field_r != null) {
              uf.field_r.shutdown((byte) -32);
            }
            if (null != UiWidget.field_z) {
              try {
                UiWidget.field_z.close(-30821);
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var1 = (IOException) (Object) decompiledCaughtException;
              }
            }
            if (aa.field_h != null) {
              for (var1_int = 0; aa.field_h.length > var1_int; var1_int++) {
                if (aa.field_h[var1_int] != null) {
                  try {
                    aa.field_h[var1_int].close(-30821);
                  } catch (java.io.IOException decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    var2 = (IOException) (Object) decompiledCaughtException;
                  }
                }
              }
            }
            if (!param0) {
              bl.clearStaticReferences((byte) 56);
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
            decompiledCaughtException = decompiledCaughtParameter2;
            var1_ref = (RuntimeException) (Object) decompiledCaughtException;
            throw lj.wrapClientException((Throwable) ((Object) var1_ref), "bl.J(" + param0 + ')');
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    abstract boolean h(int param0);

    abstract Object f(int param0);

    final static boolean g(int param0) {
        if (IsaacRandom.field_i < param0) {
          if (AccountRequestState.field_k < 0) {
            return false;
          }
          if (GuestPlayConfirmationForm.field_O[99]) {
            return false;
          }
          if (2 == rj.field_f) {
            return false;
          }
          if (!qe.field_b[4]) {
            return false;
          }
          if (sk.field_d < -30 &&
            mh.field_e[NanoFrameTimer.field_k - 1][hf.field_t].g()) {
            if (MidiPcmStream.field_K == -1) {
              return true;
            }
            if (sk.field_d <= 30) {
              return false;
            }
            if (!mh.field_e[NanoFrameTimer.field_k + 1][hf.field_t].g()) {
              return false;
            }
            if (MidiPcmStream.field_K == 1) {
              return true;
            }
            return false;
          }
          if (sk.field_d <= 30) {
            return false;
          }
          if (!mh.field_e[NanoFrameTimer.field_k + 1][hf.field_t].g()) {
            return false;
          }
          if (MidiPcmStream.field_K != 1) {
            return false;
          }
          return true;
        }
        if (AccountRequestState.field_k >= 0) {
          if (mh.field_e[NanoFrameTimer.field_k][hf.field_t + 1].g()) {
            return true;
          }
          if (-80 > sk.field_d &&
            mh.field_e[NanoFrameTimer.field_k - 1][hf.field_t + 1].g()) {
            return true;
          }
          if (sk.field_d > 80 &&
            mh.field_e[1 + NanoFrameTimer.field_k][1 + hf.field_t].g()) {
            return true;
          }
          if (AccountRequestState.field_k >= 0 &&
            !GuestPlayConfirmationForm.field_O[99] &&
            2 != rj.field_f &&
            qe.field_b[4]) {
            if (sk.field_d < -30 &&
              mh.field_e[NanoFrameTimer.field_k - 1][hf.field_t].g()) {
              if (MidiPcmStream.field_K == -1) {
                return true;
              }
              if (sk.field_d > 30 &&
                mh.field_e[NanoFrameTimer.field_k + 1][hf.field_t].g() &&
                MidiPcmStream.field_K == 1) {
                return true;
              }
              return false;
            }
            if (sk.field_d > 30 &&
              mh.field_e[NanoFrameTimer.field_k + 1][hf.field_t].g() &&
              MidiPcmStream.field_K == 1) {
              return true;
            }
          }
          return false;
        }
        if (AccountRequestState.field_k < 0) {
          return false;
        }
        if (GuestPlayConfirmationForm.field_O[99]) {
          return false;
        }
        if (2 == rj.field_f) {
          return false;
        }
        if (!qe.field_b[4]) {
          return false;
        }
        if (sk.field_d >= -30) {
          if (sk.field_d <= 30) {
            return false;
          }
          if (!mh.field_e[NanoFrameTimer.field_k + 1][hf.field_t].g()) {
            return false;
          }
          if (MidiPcmStream.field_K != 1) {
            return false;
          }
          return true;
        }
        if (!mh.field_e[NanoFrameTimer.field_k - 1][hf.field_t].g()) {
          if (sk.field_d <= 30) {
            return false;
          }
          if (!mh.field_e[NanoFrameTimer.field_k + 1][hf.field_t].g()) {
            return false;
          }
          if (MidiPcmStream.field_K != 1) {
            return false;
          }
          return true;
        }
        if (MidiPcmStream.field_K == -1) {
          return true;
        }
        if (sk.field_d <= 30) {
          return false;
        }
        if (!mh.field_e[NanoFrameTimer.field_k + 1][hf.field_t].g()) {
          return false;
        }
        if (MidiPcmStream.field_K == 1) {
          return true;
        }
        return false;
    }

    final static Sprite a(int param0, ResourceArchive param1, byte param2, int param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        Object stackIn_2_0 = null;
        Sprite stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = -121 / ((-15 - param2) / 55);
          if (Bzip2State.a(param0, 258, param3, param1)) {
            stackIn_4_0 = SecondaryNodeDeque.c(255);
            return stackIn_4_0;
          }
          stackIn_2_0 = null;
          return (Sprite) (stackIn_2_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_7_0 = var4;
          stackIn_7_1 = new StringBuilder().append("bl.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw lj.wrapClientException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public static void clearStaticReferences(byte param0) {
        int var1 = 35 % ((24 - param0) / 34);
        field_w = null;
        field_z = null;
        field_u = null;
        field_v = null;
        field_x = null;
    }

    bl(int param0) {
        this.field_y = param0;
    }

    static {
        field_u = "<%0> <times> 2,500 = <%1>";
        field_z = new int[8192];
    }
}
