/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class EmailConfirmationValidator extends TextFieldValidator {
    private String field_k;
    private boolean field_j;
    static String field_i;
    static Sprite field_l;
    private MatchingTextValidator field_m;

    final static void b(boolean param0) {
        if (DiskCacheRequest.field_w == 10) {
          ka.a(-1);
          DiskCacheRequest.field_w = 11;
        } else {
          if (!ai.a(-91)) {
            ka.a(-1);
            DiskCacheRequest.field_w = 11;
          }
        }
        if (param0) {
          field_l = (Sprite) null;
        }
        DisplayNameForm.field_K = true;
    }

    EmailConfirmationValidator(EditableTextField param0, EditableTextField param1) {
        super(param0);
        this.field_k = "";
        this.field_j = false;
        try {
          this.field_m = new MatchingTextValidator(param0, param1);
        } catch (RuntimeException runtimeException) {
          throw EntitySound.wrapException((Throwable) ((Object) runtimeException), "kh.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static ResourceArchive createResourceArchive(int param0, boolean param1, boolean param2, boolean param3, int param4, int param5) {
        try {
          Object var6 = null;
          Object var7 = null;
          CachedArchiveProvider var8 = null;
          ResourceArchive stackIn_4_0 = null;
          ResourceArchive stackIn_16_0 = null;
          Throwable decompiledCaughtException = null;
          try {
            var6 = null;
            if (null != TextFieldRenderer.field_v.field_u) {
              StereoMusicSample.field_g = new BufferedRandomAccessFile(TextFieldRenderer.field_v.field_u, 5200, 0);
              TextFieldRenderer.field_v.field_u = null;
              var6 = new DiskCacheStore(255, StereoMusicSample.field_g, new BufferedRandomAccessFile(TextFieldRenderer.field_v.field_h, 12000, 0), 2097152);
            }
            var7 = null;
            if (param4 != 10600) {
              stackIn_4_0 = (ResourceArchive) null;
              return stackIn_4_0;
            }
            if (null != StereoMusicSample.field_g) {
              if (vb.field_a == null) {
                vb.field_a = new BufferedRandomAccessFile[TextFieldRenderer.field_v.field_g.length];
              }
              if (vb.field_a[param0] == null) {
                vb.field_a[param0] = new BufferedRandomAccessFile(TextFieldRenderer.field_v.field_g[param0], 12000, 0);
                TextFieldRenderer.field_v.field_g[param0] = null;
              }
              var7 = new DiskCacheStore(param0, StereoMusicSample.field_g, vb.field_a[param0], 2097152);
            }
            var8 = LoadProgressDialog.field_Z.getArchiveProvider(param0, param3, 113, (DiskCacheStore) (var6), (DiskCacheStore) (var7));
            if (param1) {
              var8.enablePrefetch((byte) -45);
            }
            stackIn_16_0 = new ResourceArchive(var8, param2, param5);
            return stackIn_16_0;
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

    public static void clearSharedReferences(int param0) {
        field_l = null;
        if (param0 != 0) {
          EmailConfirmationValidator.b(true);
          field_i = null;
          return;
        }
        field_i = null;
    }

    final String getTextValidationMessage(String param0, boolean param1) {
        RuntimeException var3 = null;
        String stackIn_3_0 = null;
        String stackIn_8_0 = null;
        String stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_m.validateText(param0, (byte) 84) == LinearPointPath.field_k) {
            stackIn_3_0 = this.field_m.getTextValidationMessage(param0, param1);
            return stackIn_3_0;
          }
          if (!param1) {
            field_i = (String) null;
          }
          if (this.validateText(param0, (byte) 54) != LinearPointPath.field_k) {
            stackIn_10_0 = LoginChoicePanel.field_J;
            return stackIn_10_0;
          }
          stackIn_8_0 = IntHashTable.field_c;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("kh.L(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void detectMaximumHeapSize(boolean param0) {
        try {
          Throwable decompiledCaughtException = null;
          java.lang.reflect.Method var1 = null;
          Exception var1_ref = null;
          Runtime var2 = null;
          Throwable var2_ref = null;
          Long var3 = null;
          Object[] var4 = null;
          try {
            if (param0) {
              return;
            }
            var1 = Runtime.class.getMethod("maxMemory", new Class[]{});
            if (var1 != null) {
              try {
                var2 = Runtime.getRuntime();
                var4 = (Object[]) null;
                var3 = (Long) (var1.invoke((Object) (var2), (Object[]) null));
                d.field_g = 1 + (int)(var3.longValue() / 1048576L);
                return;
              } catch (java.lang.Throwable decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var2_ref = decompiledCaughtException;
              }
            }
          } catch (java.lang.Exception decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var1_ref = (Exception) (Object) decompiledCaughtException;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final ValidationState validateText(String param0, byte param1) {
        EmailValidationResult var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        ValidationState stackIn_2_0 = null;
        ValidationState stackIn_9_0 = null;
        ValidationState stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_m.validateText(param0, (byte) 65) == LinearPointPath.field_k) {
            stackIn_2_0 = LinearPointPath.field_k;
            return stackIn_2_0;
          }
          if (param1 <= 52) {
            var4 = (String) null;
            this.validateText((String) null, (byte) -84);
          }
          if (!param0.equals(this.field_k)) {
            var3 = SavedRasterState.getEmailValidationResult((byte) -85, param0);
            if (!var3.isComplete(250)) {
              stackIn_9_0 = um.field_a;
              return stackIn_9_0;
            }
            this.field_k = param0;
            this.field_j = var3.isValid((byte) -34);
          }
          if (!this.field_j) {
            stackIn_14_0 = LinearPointPath.field_k;
          } else {
            stackIn_14_0 = PointPath.field_d;
          }
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_17_0 = var3_ref;
          stackIn_17_1 = new StringBuilder().append("kh.N(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
    }
}
