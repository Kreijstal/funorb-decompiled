/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class GrowableIntList {
    static int[] field_d;
    private int lastIndex;
    int[] values;
    private int growthFactor;
    private boolean multiplicativeGrowth;

    public static void releaseStatics(boolean param0) {
        field_d = null;
        if (param0) {
          field_d = (int[]) null;
        }
    }

    final int size(byte param0) {
        if (param0 <= 86) {
          this.ensureCapacity(-74, -82);
          return this.lastIndex + 1;
        }
        return this.lastIndex + 1;
    }

    private final void ensureCapacity(int param0, int param1) {
        int[] var4 = new int[this.capacityFor(param1, (byte) -41)];
        int[] var3 = var4;
        if (param0 == 28083) {
          ArrayOperations.copy(this.values, 0, var4, 0, this.values.length);
          this.values = var4;
          return;
        }
        this.growthFactor = -28;
        ArrayOperations.copy(this.values, 0, var4, 0, this.values.length);
        this.values = var4;
    }

    final void set(int param0, int param1, int param2) {
        if (param0 != 10499) {
          this.ensureCapacity(115, -65);
          if (this.lastIndex < param2) {
            this.lastIndex = param2;
          }
          if (param2 >= this.values.length) {
            this.ensureCapacity(28083, param2);
            this.values[param2] = param1;
            return;
          }
          this.values[param2] = param1;
          return;
        }
        if (this.lastIndex < param2) {
          this.lastIndex = param2;
        }
        if (param2 < this.values.length) {
          this.values[param2] = param1;
          return;
        }
        this.ensureCapacity(28083, param2);
        this.values[param2] = param1;
    }

    final void removeAt(int param0, int param1) {
        if (param0 < 0) {
          throw new ArrayIndexOutOfBoundsException(param0);
        }
        if (this.lastIndex < param0) {
          throw new ArrayIndexOutOfBoundsException(param0);
        }
        if (param0 != this.lastIndex) {
          ArrayOperations.copy(this.values, param0 + 1, this.values, param0, -param0 + this.lastIndex);
          if (param1 >= 16) {
            this.lastIndex = this.lastIndex - 1;
            return;
          }
          this.get(17, -11);
          this.lastIndex = this.lastIndex - 1;
          return;
        }
        if (param1 >= 16) {
          this.lastIndex = this.lastIndex - 1;
          return;
        }
        this.get(17, -11);
        this.lastIndex = this.lastIndex - 1;
    }

    final void add(byte param0, int param1) {
        this.set(10499, param1, this.lastIndex + 1);
        if (param0 != -2) {
          field_d = (int[]) null;
        }
    }

    private final int capacityFor(int param0, byte param1) {
        int var3;
        var3 = this.values.length;
        while (var3 <= param0) {
          if (!this.multiplicativeGrowth) {
            var3 = var3 + this.growthFactor;
            continue;
          }
          if (var3 != 0) {
            var3 = var3 * this.growthFactor;
            continue;
          }
          var3 = 1;
        }
        if (param1 <= -12) {
          return var3;
        }
        this.ensureCapacity(-26, -84);
        return var3;
    }

    final int get(int param0, int param1) {
        if (param1 != 2229) {
          this.multiplicativeGrowth = false;
          if (param0 > this.lastIndex) {
            throw new ArrayIndexOutOfBoundsException(param0);
          }
          return this.values[param0];
        }
        if (param0 > this.lastIndex) {
          throw new ArrayIndexOutOfBoundsException(param0);
        }
        return this.values[param0];
    }

    GrowableIntList(int param0, boolean param1) {
        this.lastIndex = -1;
        this.values = new int[]{};
        this.multiplicativeGrowth = false;
        this.growthFactor = param0;
        this.multiplicativeGrowth = param1 ? true : false;
    }

    final static void reportClientError(Throwable param0, String param1, int param2) {
        try {
          PlatformTaskDispatcher stackIn_14_0;
          java.net.URL stackIn_14_1;
          java.net.URL stackIn_14_2;
          java.net.URL stackIn_14_3;
          StringBuilder stackIn_14_4;
          java.net.URL stackIn_15_1;
          java.net.URL stackIn_15_2;
          String stackIn_15_5;
          Throwable decompiledCaughtException = null;
          String var3 = null;
          Exception var3_ref = null;
          AsyncRequest var4 = null;
          DataInputStream var5 = null;
          String var6 = null;
          String var7 = null;
          String var8 = null;
          String var9 = null;
          try {
            var3 = "";
            if (param0 != null) {
              var3 = QuickChatCategoryCache.formatThrowable(5, param0);
            }
            if (param1 != null) {
              if (param0 != null) {
                var3 = var3 + " | ";
              }
              var3 = var3 + param1;
            }
            ScrollPaneWithFooter.printClientError(55, var3);
            var6 = DiskArchiveRequest.replaceAll(14, "%3a", var3, ":");
            var7 = DiskArchiveRequest.replaceAll(124, "%40", var6, "@");
            var8 = DiskArchiveRequest.replaceAll(123, "%26", var7, "&");
            var9 = DiskArchiveRequest.replaceAll(-61, "%23", var8, "#");
            if (null == ProgressBarWidget.field_W) {
              return;
            }
            stackIn_14_0 = QuickChatPhraseRegistry.field_c;
            stackIn_14_1 = null;
            stackIn_14_2 = null;
            stackIn_14_3 = ProgressBarWidget.field_W.getCodeBase();
            stackIn_14_4 = new StringBuilder().append("clienterror.ws?c=").append(ContentTransitionDialog.field_rb).append("&u=");
            if (IntrusiveNode.field_j == null) {
              stackIn_15_1 = null;
              stackIn_15_2 = null;
              stackIn_15_5 = "" + ChatReplacementSupport.field_e;
            } else {
              stackIn_15_1 = null;
              stackIn_15_2 = null;
              stackIn_15_5 = IntrusiveNode.field_j;
            }
            var4 = ((PlatformTaskDispatcher) (Object) stackIn_14_0).a(new java.net.URL(stackIn_14_3, ((StringBuilder) (Object) stackIn_14_4).append(stackIn_15_5).append("&v1=").append(PlatformTaskDispatcher.field_o).append("&v2=").append(PlatformTaskDispatcher.field_t).append("&e=").append(var9).toString()), 1);
            while (var4.field_f == 0) {
              SoundCache.a(-100, 1L);
            }
            if (param2 != -8555) {
              field_d = (int[]) null;
            }
            if (1 == var4.field_f) {
              var5 = (DataInputStream) (var4.field_e);
              var5.read();
              var5.close();
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3_ref = (Exception) (Object) decompiledCaughtException;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
    }
}
