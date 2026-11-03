/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class Quaternion {
    int x;
    int z;
    static nl field_k;
    static int field_e;
    private static int field_i;
    int w;
    static String gameoptTrychanging2;
    int y;
    static String createAlertEmailUnavailable;
    static int keycodeDefaultDown1;
    static Sprite[] field_l;
    static long field_a;

    final void write(PacketBuffer param0, byte param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.w < 16777216 &&
            this.w > -16777216) {
            if (param1 != 123) {
              return;
            }
            if (this.x < 16777216 &&
              this.x > -16777216) {
              if (this.y < 16777216 &&
                this.y > -16777216) {
                if (this.z < 16777216 &&
                  this.z > -16777216) {
                  param0.writeMedium(this.w, param1 - 2);
                  param0.writeMedium(this.x, 65);
                  param0.writeMedium(this.y, param1 - 44);
                  param0.writeMedium(this.z, 109);
                  return;
                }
                throw new IllegalStateException("fpquaternion out of range for state dump.");
              }
              throw new IllegalStateException("fpquaternion out of range for state dump.");
            }
            throw new IllegalStateException("fpquaternion out of range for state dump.");
          }
          throw new IllegalStateException("fpquaternion out of range for state dump.");
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_22_0 = runtimeException;
          stackIn_22_1 = new StringBuilder().append("hm.E(");
          if (param0 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param1).append(')').toString());
        }
    }

    final void normalise(boolean param0) {
        int var2 = NameEntryPopup.a(this.w, false, this.w) - (-NameEntryPopup.a(this.x, false, this.x) - (NameEntryPopup.a(this.y, false, this.y) + NameEntryPopup.a(this.z, false, this.z)));
        if (!param0) {
          createAlertEmailUnavailable = (String) null;
          if (var2 >= 65535) {
            if (65537 < var2) {
              var2 = rf.inverseSquareRoot(var2, -127);
              this.w = ArchiveProvider.divideFixed16(var2, (byte) -76, (long)this.w);
              this.x = ArchiveProvider.divideFixed16(var2, (byte) -62, (long)this.x);
              this.y = ArchiveProvider.divideFixed16(var2, (byte) -71, (long)this.y);
              this.z = ArchiveProvider.divideFixed16(var2, (byte) -69, (long)this.z);
            }
            return;
          }
          var2 = rf.inverseSquareRoot(var2, -127);
          this.w = ArchiveProvider.divideFixed16(var2, (byte) -76, (long)this.w);
          this.x = ArchiveProvider.divideFixed16(var2, (byte) -62, (long)this.x);
          this.y = ArchiveProvider.divideFixed16(var2, (byte) -71, (long)this.y);
          this.z = ArchiveProvider.divideFixed16(var2, (byte) -69, (long)this.z);
          return;
        }
        if (var2 < 65535) {
          var2 = rf.inverseSquareRoot(var2, -127);
          this.w = ArchiveProvider.divideFixed16(var2, (byte) -76, (long)this.w);
          this.x = ArchiveProvider.divideFixed16(var2, (byte) -62, (long)this.x);
          this.y = ArchiveProvider.divideFixed16(var2, (byte) -71, (long)this.y);
          this.z = ArchiveProvider.divideFixed16(var2, (byte) -69, (long)this.z);
          return;
        }
        if (65537 >= var2) {
          return;
        }
        var2 = rf.inverseSquareRoot(var2, -127);
        this.w = ArchiveProvider.divideFixed16(var2, (byte) -76, (long)this.w);
        this.x = ArchiveProvider.divideFixed16(var2, (byte) -62, (long)this.x);
        this.y = ArchiveProvider.divideFixed16(var2, (byte) -71, (long)this.y);
        this.z = ArchiveProvider.divideFixed16(var2, (byte) -69, (long)this.z);
    }

    final void multiplyBy(int param0, Quaternion param1) {
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        try {
          var3_int = NameEntryPopup.a(this.w, false, param1.w) + (-NameEntryPopup.a(this.x, false, param1.x) - NameEntryPopup.a(this.y, false, param1.y) - NameEntryPopup.a(this.z, false, param1.z));
          if (param0 != 3) {
            field_k = (nl) null;
          }
          var4 = NameEntryPopup.a(this.x, false, param1.w) + (NameEntryPopup.a(this.w, false, param1.x) + NameEntryPopup.a(this.z, false, param1.y)) - NameEntryPopup.a(this.y, false, param1.z);
          var5 = NameEntryPopup.a(this.y, false, param1.w) - NameEntryPopup.a(this.z, false, param1.x) + NameEntryPopup.a(this.w, false, param1.y) + NameEntryPopup.a(this.x, false, param1.z);
          this.z = NameEntryPopup.a(this.z, false, param1.w) + (NameEntryPopup.a(this.y, false, param1.x) - (NameEntryPopup.a(this.x, false, param1.y) - NameEntryPopup.a(this.w, false, param1.z)));
          this.w = var3_int;
          this.x = var4;
          this.y = var5;
          this.normalise(true);
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "hm.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void toRotationMatrix(int[] param0, int param1) {
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var3_int = NameEntryPopup.a(this.w, false, this.w);
        int var4 = NameEntryPopup.a(this.x, false, this.w);
        int var5 = NameEntryPopup.a(this.y, false, this.w);
        int var6 = NameEntryPopup.a(this.z, false, this.w);
        int var7 = NameEntryPopup.a(this.x, false, this.x);
        int var8 = NameEntryPopup.a(this.y, false, this.x);
        int var9 = NameEntryPopup.a(this.z, false, this.x);
        if (param1 > -36) {
          return;
        }
        try {
          var10 = NameEntryPopup.a(this.y, false, this.y);
          var11 = NameEntryPopup.a(this.z, false, this.y);
          var12 = NameEntryPopup.a(this.z, false, this.z);
          param0[3] = -var10 + (var3_int + var7 - var12);
          param0[5] = var9 + (-var5 + var9 - var5);
          param0[4] = var6 + (var8 + (var8 + var6));
          param0[9] = var9 + (var5 + var9 + var5);
          param0[7] = -var7 + var10 - (-var3_int + var12);
          param0[10] = var11 + (-var4 + var11) - var4;
          param0[6] = -var6 + (-var6 + var8 + var8);
          param0[8] = var4 + var11 + (var4 + var11);
          param0[11] = var3_int + var12 - (var10 + var7);
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "hm.K(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void copyFrom(int param0, Quaternion param1) {
        try {
          this.x = param1.x;
          this.y = param1.y;
          this.z = param1.z;
          if (param0 != 0) {
            this.setIdentity(true);
          }
          this.w = param1.w;
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "hm.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void print(int param0) {
        System.out.print("[");
        System.out.print(lo.a((long)this.w, 7697781));
        System.out.print(",");
        System.out.print(lo.a((long)this.x, 7697781));
        System.out.print(",");
        System.out.print(lo.a((long)this.y, 7697781));
        System.out.print(",");
        System.out.print(lo.a((long)this.z, 7697781));
        System.out.print("]");
        if (param0 >= -19) {
          field_i = -79;
        }
    }

    final void read(boolean param0, PacketBuffer param1) {
        try {
          this.w = param1.readMedium(0);
          this.x = param1.readMedium(0);
          if (param0) {
            this.print(96);
          }
          this.y = param1.readMedium(0);
          this.z = param1.readMedium(0);
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "hm.J(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    Quaternion(int param0, int param1, int param2, int param3) {
        this.z = param3;
        this.x = param1;
        this.w = param0;
        this.y = param2;
    }

    public static void releaseStatics(int param0) {
        int var1 = -69 / ((param0 - 2) / 61);
        field_k = null;
        createAlertEmailUnavailable = null;
        field_l = null;
        gameoptTrychanging2 = null;
    }

    final void setIdentity(boolean param0) {
        this.x = 0;
        this.z = 0;
        this.y = 0;
        this.w = 65536;
        if (param0) {
          this.x = 106;
        }
    }

    final void setFromAxisAngle(int param0, int param1, int param2, int param3, int param4) {
        param4 = param4 >> 1;
        int var6 = ScrollPaneWithFooter.a(param4, true);
        int var7 = hc.a(2047, param4);
        this.w = var7;
        this.x = NameEntryPopup.a(var6, false, param1);
        this.y = NameEntryPopup.a(var6, false, param2);
        if (param0 > 46) {
          this.z = NameEntryPopup.a(var6, false, param3);
          return;
        }
        this.setFromAxisAngle(32, -115, -18, -75, 3);
        this.z = NameEntryPopup.a(var6, false, param3);
    }

    final static void a(boolean param0, int param1) {
        if (oj.c(-26)) {
          param0 = false;
        }
        DraggableWidget.a(-114, param0);
        if (param1 == -19213) {
          AgeValidator.b((byte) -97);
          return;
        }
        keycodeDefaultDown1 = -59;
        AgeValidator.b((byte) -97);
    }

    public Quaternion() {
        this.w = 65536;
    }

    static {
        field_k = new nl();
        keycodeDefaultDown1 = 49;
        field_i = 8;
        createAlertEmailUnavailable = "Email address is unavailable";
        field_e = 1 << field_i;
        gameoptTrychanging2 = "Try changing the following settings:  ";
    }
}
