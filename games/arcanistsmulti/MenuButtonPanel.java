/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class MenuButtonPanel extends UiContainer implements ButtonListener {
    static IntrusiveDeque field_O;
    private String field_J;
    static String field_Q;
    private ed field_G;
    static String field_R;
    static String field_N;
    static String field_E;
    static boolean field_C;
    private BitmapFont field_D;
    private int field_K;
    static String[] field_L;
    static String field_P;
    static int[] field_H;
    private int[] field_S;
    private TextButton[] field_M;
    static int field_I;

    MenuButtonPanel(ed param0, BitmapFont param1, String param2) {
        super(0, 0, 288, 0, (WidgetPainter) null);
        int var4_int = 0;
        this.field_K = 0;
        try {
          this.field_D = param1;
          this.field_J = param2;
          this.field_G = param0;
          var4_int = this.field_J == null ? 0 : this.field_D.paragraphHeight(this.field_J, 260, this.field_D.field_C);
          this.setBounds(22 + var4_int, 0, 288, 0, -51);
        } catch (RuntimeException runtimeException) {
          throw aa.wrapException((Throwable) ((Object) runtimeException), "me.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void addMenuItem(String param0, byte param1, int param2) {
        int var4_int = 0;
        try {
          var4_int = this.field_K;
          this.ensureButtonCapacity(-84, 1 + var4_int);
          this.field_M[var4_int] = this.addButton(121, param0, (UiListener) (this));
          this.field_S[var4_int] = param2;
          int var5 = 64 / ((71 - param1) / 35);
        } catch (RuntimeException runtimeException) {
          throw aa.wrapException((Throwable) ((Object) runtimeException), "me.F(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final TextButton addButton(int param0, String param1, UiListener param2) {
        TextButton var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        TextButton stackIn_2_0 = null;
        TextButton stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = new TextButton(param1, param2);
          var4.field_r = (WidgetPainter) ((Object) new MenuButtonPainter());
          if (param0 < 71) {
            stackIn_2_0 = (TextButton) null;
            return stackIn_2_0;
          }
          var5 = this.field_k - 2;
          this.setBounds(this.field_k + 34, 0, this.field_v, 0, -57);
          var4.setBounds(30, var5, -14 + this.field_v, 7, -85);
          this.addChild(-104, var4);
          stackIn_4_0 = var4;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_7_0 = var4_ref;
          stackIn_7_1 = new StringBuilder().append("me.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw aa.wrapException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final void drawLayer(byte param0, int param1, int param2, int param3) {
        super.drawLayer((byte) -100, param1, param2, param3);
        if (param0 >= -52) {
          this.field_S = (int[]) null;
        }
        this.field_D.drawParagraph(this.field_J, this.field_n + param1 + 14, this.field_j + (param3 + 10), this.field_v - 28, this.field_k, 16777215, -1, 0, 0, this.field_D.field_C);
    }

    private final void ensureButtonCapacity(int param0, int param1) {
        int var6 = 0;
        int var7 = ArcanistsMulti.field_G ? 1 : 0;
        if (this.field_K >= param1) {
          return;
        }
        TextButton[] var8 = new TextButton[param1];
        TextButton[] var3 = var8;
        int[] var4 = new int[param1];
        int var5 = 114 % ((84 - param0) / 42);
        for (var6 = 0; var6 < this.field_K; var6++) {
          var8[var6] = this.field_M[var6];
          var4[var6] = this.field_S[var6];
        }
        this.field_M = var3;
        this.field_K = param1;
        this.field_S = var4;
    }

    public static void releaseStatics(byte param0) {
        field_O = null;
        if (param0 <= 88) {
          ResourceArchive var2 = (ResourceArchive) null;
          MenuButtonPanel.loadIndexedSprite((ResourceArchive) null, -67, 92, -61);
        }
        field_L = null;
        field_E = null;
        field_Q = null;
        field_N = null;
        field_H = null;
        field_P = null;
        field_R = null;
    }

    private final static IndexedSprite createDecodedIndexedSprite(int param0) {
        IndexedSprite var1 = new IndexedSprite(pb.field_g, QuickChatPhraseCache.field_a, hl.field_l[0], SectorCacheStore.field_d[0], jg.field_p[0], ho.field_i[0], AccountRegistrationPanel.field_I[param0], ph.field_c);
        CanvasRasterBuffer.releaseDecodeArrays(-18229);
        return var1;
    }

    final static ResourceArchive createResourceArchive(int param0, boolean param1, int param2, boolean param3, int param4, boolean param5) {
        try {
          Object var6 = null;
          Object var7 = null;
          CachedArchiveProvider var8 = null;
          ResourceArchive stackIn_2_0 = null;
          ResourceArchive stackIn_15_0 = null;
          Throwable decompiledCaughtException = null;
          try {
            if (param2 != 2097152) {
              stackIn_2_0 = (ResourceArchive) null;
              return stackIn_2_0;
            }
            var6 = null;
            var7 = null;
            if (null != ri.field_g.field_q) {
              bm.field_e = new BufferedRandomAccessFile(ri.field_g.field_q, 5200, 0);
              ri.field_g.field_q = null;
              var6 = new SectorCacheStore(255, bm.field_e, new BufferedRandomAccessFile(ri.field_g.field_e, 12000, 0), 2097152);
            }
            if (bm.field_e != null) {
              if (bb.field_b == null) {
                bb.field_b = new BufferedRandomAccessFile[ri.field_g.field_d.length];
              }
              if (bb.field_b[param0] == null) {
                bb.field_b[param0] = new BufferedRandomAccessFile(ri.field_g.field_d[param0], 12000, 0);
                ri.field_g.field_d[param0] = null;
              }
              var7 = new SectorCacheStore(param0, bm.field_e, bb.field_b[param0], 2097152);
            }
            var8 = ValidationStatusIcon.field_O.createProvider((SectorCacheStore) (var6), param5, -113, (SectorCacheStore) (var7), param0);
            if (param3) {
              var8.enablePrefetch((byte) 53);
            }
            stackIn_15_0 = new ResourceArchive(var8, param1, param4);
            return stackIn_15_0;
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var6 = (IOException) (Object) decompiledCaughtException;
            throw new RuntimeException(((IOException) (var6)).toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static IndexedSprite loadIndexedSprite(ResourceArchive param0, int param1, int param2, int param3) {
        RuntimeException var4 = null;
        Object stackIn_4_0 = null;
        IndexedSprite stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 31027) {
            MenuButtonPanel.createDecodedIndexedSprite(50);
          }
          if (fc.decodeSpriteSheet(-120, param0, param2, param3)) {
            stackIn_6_0 = MenuButtonPanel.createDecodedIndexedSprite(0);
            return stackIn_6_0;
          }
          stackIn_4_0 = null;
          return (IndexedSprite) (stackIn_4_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = var4;
          stackIn_9_1 = new StringBuilder().append("me.I(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw aa.wrapException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public final void onButtonActivated(boolean param0, int param1, int param2, int param3, TextButton param4) {
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var8 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          var6_int = 0;
          if (!param0) {
            field_H = (int[]) null;
          }
          while (var6_int < this.field_K) {
            if (this.field_M[var6_int] != param4) {
              var6_int++;
              continue;
            }
            var7 = this.field_S[var6_int];
            if (var7 != -1) {
              DebouncedValidator.setPendingMessageId(this.field_S[var6_int], (byte) 30);
            } else {
              this.field_G.dismiss(77);
            }
            break;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_12_0 = var6;
          stackIn_12_1 = new StringBuilder().append("me.U(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw aa.wrapException((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    static {
        field_R = "Hint: to start quickly, choose 'Don't mind' for as many options as you can!";
        field_Q = "Start";
        field_N = "Sorted by rating";
        field_L = new String[]{"Move back to the previous menu level.", "Return to the top level of the menu.", "Auto-respond to the last thing in your chat window.", "Open the Quick Chat menu.", "Repeat the last thing you said.", "Close the Quick Chat menu."};
        field_P = "Towers:";
        field_H = new int[]{25, 8, 26};
        field_O = new IntrusiveDeque();
        field_I = 0;
    }
}
