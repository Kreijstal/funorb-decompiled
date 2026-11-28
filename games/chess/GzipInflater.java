/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class GzipInflater {
    static volatile long field_g;
    static int[] field_b;
    static int field_d;
    static RgbSprite[][] field_e;
    static int[] field_f;
    private java.util.zip.Inflater field_a;
    static pc field_h;
    static SoftwareModelMesh[] field_c;

    final static void b(int param0, int param1) {
        BitPacketBuffer var2 = EditableTextField.field_U;
        var2.writeCipheredByte(param1, param0 + 6324);
        var2.writeByte(2, (byte) 107);
        if (param0 == -6446) {
          var2.writeByte(4, (byte) -71);
          var2.writeByte(BirthDateChatEnableForm.m(73), (byte) -88);
          return;
        }
        GzipInflater.b(27, 37);
        var2.writeByte(4, (byte) -71);
        var2.writeByte(BirthDateChatEnableForm.m(73), (byte) -88);
    }

    final static int a(int param0, int param1) {
        if (param0 < 99) {
          return 32;
        }
        param1 = param1 & 8191;
        if (param1 >= 4096) {
          return param1 >= 6144 ? -ArchiveSourceManager.field_b[8192 - param1] : -ArchiveSourceManager.field_b[-4096 + param1];
        }
        return param1 >= 2048 ? ArchiveSourceManager.field_b[4096 - param1] : ArchiveSourceManager.field_b[param1];
    }

    final static void a(boolean param0, int param1, boolean param2, int param3, dm param4) {
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        String var7 = null;
        try {
          AccountRegistrationPanel.field_S[0] = ph.field_d.nextInt();
          AccountRegistrationPanel.field_S[1] = ph.field_d.nextInt();
          ProxySocketConnector.field_h.position = 0;
          AccountRegistrationPanel.field_S[2] = (int)(sj.field_h >> 32);
          AccountRegistrationPanel.field_S[3] = (int)sj.field_h;
          ProxySocketConnector.field_h.writeInt(AccountRegistrationPanel.field_S[0], (byte) -81);
          ProxySocketConnector.field_h.writeInt(AccountRegistrationPanel.field_S[1], (byte) -81);
          ProxySocketConnector.field_h.writeInt(AccountRegistrationPanel.field_S[2], (byte) -81);
          ProxySocketConnector.field_h.writeInt(AccountRegistrationPanel.field_S[3], (byte) -81);
          sa.a(ProxySocketConnector.field_h, 109);
          ProxySocketConnector.field_h.writeShort(param3, param1 + 27463);
          param4.a(ProxySocketConnector.field_h, (byte) 123);
          EditableTextField.field_U.position = 0;
          if (param2) {
            EditableTextField.field_U.writeByte(18, (byte) -81);
          } else {
            EditableTextField.field_U.writeByte(16, (byte) 110);
          }
          EditableTextField.field_U.position = EditableTextField.field_U.position + 2;
          var5_int = EditableTextField.field_U.position;
          EditableTextField.field_U.writeInt(NetworkGameClient.field_s, (byte) -81);
          EditableTextField.field_U.writeLong(-97, qc.field_a);
          var6 = 0;
          if (param1 != -27359) {
            return;
          }
          if (ln.field_Kb) {
            var6 = var6 | 1;
          }
          if (DiskCacheWorker.field_a) {
            var6 = var6 | 4;
          }
          if (param0) {
            var6 = var6 | 8;
          }
          if (AlphaWidgetContainer.field_N != null) {
            var6 = var6 | 16;
          }
          EditableTextField.field_U.writeByte(var6, (byte) 52);
          var7 = m.a(ArrayWidgetContainer.i(81), (byte) 87);
          if (var7 == null) {
            var7 = "";
          }
          EditableTextField.field_U.writeString(param1 ^ 27325, var7);
          if (null != AlphaWidgetContainer.field_N) {
            EditableTextField.field_U.writePrefixedString(true, AlphaWidgetContainer.field_N);
          }
          lk.a(SecondaryNodeHashTable.field_k, ProxySocketConnector.field_h, EditableTextField.field_U, 91, RichTextWidget.field_M);
          EditableTextField.field_U.backpatchShortLength(EditableTextField.field_U.position - var5_int, 111);
          vh.a(-1, (byte) -42);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_23_0 = var5;
          stackIn_23_1 = new StringBuilder().append("pj.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw SpriteGeometry.wrapClientException((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(')').toString());
        }
    }

    final void decompress(byte[] param0, byte param1, PacketBuffer param2) {
        try {
          Exception exception = null;
          RuntimeException runtimeException = null;
          RuntimeException stackIn_15_0 = null;
          StringBuilder stackIn_15_1 = null;
          String stackIn_16_2 = null;
          StringBuilder stackIn_18_1 = null;
          String stackIn_19_2 = null;
          Throwable decompiledCaughtException = null;
          try {
            if (31 == param2.data[param2.position] &&
              param2.data[param2.position + 1] == -117) {
              if (null == this.field_a) {
                this.field_a = new java.util.zip.Inflater(true);
              }
              try {
                if (param1 >= -19) {
                  GzipInflater.b(106, 101);
                }
                this.field_a.setInput(param2.data, param2.position + 10, -8 - (param2.position + 10 - param2.data.length));
                this.field_a.inflate(param0);
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                exception = (Exception) (Object) decompiledCaughtException;
                this.field_a.reset();
                throw new RuntimeException("");
              }
              this.field_a.reset();
              return;
            }
            throw new RuntimeException("");
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            runtimeException = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_15_0 = runtimeException;
            stackIn_15_1 = new StringBuilder().append("pj.E(");
            if (param0 == null) {
              stackIn_16_2 = "null";
            } else {
              stackIn_16_2 = "{...}";
            }
            stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',');
            if (param2 == null) {
              stackIn_19_2 = "null";
            } else {
              stackIn_19_2 = "{...}";
            }
            throw SpriteGeometry.wrapClientException((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public GzipInflater() {
        this(-1, 1000000, 1000000);
    }

    private GzipInflater(int param0, int param1, int param2) {
    }

    public static void clearStaticReferences(int param0) {
        field_e = (RgbSprite[][]) null;
        field_h = null;
        field_b = null;
        field_f = null;
        field_c = null;
        if (param0 != -6145) {
          field_f = (int[]) null;
        }
    }

    static {
        field_b = new int[]{4096, 0, 4096, 0, 4096, 0, 4096, 0, 0, 4096, 0, 4096, 0, 4096, 0, 4096, 4096, 0, 4096, 0, 4096, 0, 4096, 0, 0, 4096, 0, 4096, 0, 4096, 0, 4096, 4096, 0, 4096, 0, 4096, 0, 4096, 0, 0, 4096, 0, 4096, 0, 4096, 0, 4096, 4096, 0, 4096, 0, 4096, 0, 4096, 0, 0, 4096, 0, 4096, 0, 4096, 0, 4096};
        field_g = 0L;
        field_d = 3;
        field_c = new SoftwareModelMesh[7];
    }
}
