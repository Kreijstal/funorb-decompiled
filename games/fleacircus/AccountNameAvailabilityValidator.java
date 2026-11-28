/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AccountNameAvailabilityValidator extends TextFieldValidator {
    static String field_n;
    static volatile int field_p;
    private boolean nameAvailable;
    private String checkedName;

    AccountNameAvailabilityValidator(EditableTextField param0) {
        super(param0);
        this.nameAvailable = false;
    }

    final String getValidationMessage(byte param0, String param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        AccountServiceResult var4_ref_mk = null;
        int var4 = 0;
        CharSequence var5 = null;
        String stackIn_3_0 = null;
        Object stackIn_10_0 = null;
        String stackIn_14_0 = null;
        String stackIn_16_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5 = (CharSequence) ((Object) param1);
          var3 = q.a(var5, true);
          if (var3 != null) {
            stackIn_3_0 = var3;
            return stackIn_3_0;
          }
          if (!param1.equals(this.checkedName)) {
            var4_ref_mk = jd.pollAccountNameCheck(param1, 8947848);
            if (var4_ref_mk == null) {
              return null;
            }
            if (null != var4_ref_mk.message) {
              stackIn_10_0 = null;
              return (String) (stackIn_10_0);
            }
            this.nameAvailable = var4_ref_mk.success;
            this.checkedName = param1;
          }
          var4 = 47 % ((24 - param0) / 46);
          if (this.nameAvailable) {
            stackIn_16_0 = lf.field_c;
            return stackIn_16_0;
          }
          stackIn_14_0 = de.field_o;
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_19_0 = var3_ref;
          stackIn_19_1 = new StringBuilder().append("vf.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw pf.wrapClientException((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    final static boolean c(byte param0) {
        boolean stackIn_6_0 = false;
        if (param0 != -5) {
          AccountNameAvailabilityValidator.c((byte) -24);
        }
        stackIn_6_0 = (null != GzipDecompressor.field_a) && (null != GzipDecompressor.field_a.getTopOpenDialog(-63));
        return stackIn_6_0;
    }

    final static int a(int param0, byte param1, CharSequence param2) {
        RuntimeException var3 = null;
        CharSequence var4 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 <= 38) {
            var4 = (CharSequence) null;
            AccountNameAvailabilityValidator.a(-32, (byte) -88, (CharSequence) null);
          }
          stackIn_3_0 = jc.a(param0, 119, true, param2);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("vf.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw pf.wrapClientException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final static void e(int param0) {
        int var1_int = 0;
        int var2 = 0;
        int var3 = fleas.field_A ? 1 : 0;
        try {
          ResourceArchive.field_c.field_z = new String[FrameTimer.field_c[fleas.field_E].length];
          ResourceArchive.field_c.field_t = new boolean[ResourceArchive.field_c.field_z.length];
          if (param0 != -6359) {
            AccountNameAvailabilityValidator.resetStaticState(true);
          }
          for (var1_int = 0; var1_int < ResourceArchive.field_c.field_t.length; var1_int++) {
            var2 = hj.field_a[fleas.field_E] >= var1_int ? 1 : 0;
            ResourceArchive.field_c.field_z[var1_int] = var2 == 0 ? ik.field_C : FrameTimer.field_c[fleas.field_E][var1_int];
            if (0 == fleas.field_E && var1_int >= 15 &&
              (DiskArchiveRequest.c((byte) 107) || 0 >= wc.field_q)) {
              ResourceArchive.field_c.field_z[var1_int] = nb.field_e;
              var2 = 0;
            }
            ResourceArchive.field_c.field_t[var1_int] = var2 != 0;
          }
          ResourceArchive.field_c.field_x = 0;
          ResourceArchive.field_c.field_S = 0;
          ll.d(336);
        } catch (RuntimeException runtimeException) {
          throw pf.wrapClientException((Throwable) ((Object) runtimeException), "vf.K(" + param0 + ')');
        }
    }

    public static void resetStaticState(boolean param0) {
        field_n = null;
        if (param0) {
          field_p = 114;
        }
    }

    final void invalidateCheckedName(boolean param0) {
        if (!param0) {
          AccountNameAvailabilityValidator.resetStaticState(false);
        }
        this.checkedName = null;
    }

    final wd getValidationStatus(int param0, String param1) {
        AccountServiceResult var3 = null;
        RuntimeException var3_ref = null;
        CharSequence var4 = null;
        wd stackIn_5_0 = null;
        wd stackIn_12_0 = null;
        wd stackIn_17_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 160) {
            this.nameAvailable = true;
          }
          var4 = (CharSequence) ((Object) param1);
          if (!ud.a(1560, var4)) {
            stackIn_5_0 = LabeledWidgetContainer.field_K;
            return stackIn_5_0;
          }
          if (!param1.equals(this.checkedName)) {
            var3 = jd.pollAccountNameCheck(param1, 8947848);
            if (var3 != null &&
              null == var3.message) {
              this.nameAvailable = var3.success;
              this.checkedName = param1;
            } else {
              stackIn_12_0 = w.field_e;
              return stackIn_12_0;
            }
          }
          if (this.nameAvailable) {
            stackIn_17_0 = hm.field_b;
          } else {
            stackIn_17_0 = LabeledWidgetContainer.field_K;
          }
          return stackIn_17_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_20_0 = var3_ref;
          stackIn_20_1 = new StringBuilder().append("vf.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw pf.wrapClientException((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    static {
        field_p = -1;
        field_n = "Loading sound effects";
    }
}
