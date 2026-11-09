/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class VertexStreamLayout {
    static int field_b;
    private long packedAttributes;
    static FontMetrics field_c;
    static String[] field_a;
    private int attributeCount;
    static int[] sqrtQ12;

    final static void a(String param0, float param1, boolean param2, int param3) {
        try {
          if (param3 < 75) {
            field_c = (FontMetrics) null;
          }
          if (null == HardwareGraphicsHeap.field_n) {
            HardwareGraphicsHeap.field_n = new ProgressDialog(RenderPresentationException.field_a, SocketJs5Client.field_s);
            RenderPresentationException.field_a.pushDialog((byte) 100, HardwareGraphicsHeap.field_n);
          }
          HardwareGraphicsHeap.field_n.a(false, param1, param0, param2);
          SoftwareRasterizer.clear();
          BurstParticle.renderDialogLayer(true, true);
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "hu.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static SocialContact findFriend(String name, byte guard) {
        String var2 = null;
        SocialContact var3 = null;
        String var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        Object stackIn_7_0 = null;
        SocialContact stackIn_19_0 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var5 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (null == CheckboxWidget.field_G) {
            return null;
          }
          if (name == null) {
            return null;
          }
          if (name.length() == 0) {
            stackIn_7_0 = null;
            return (SocialContact) (stackIn_7_0);
          }
          var6 = (CharSequence) ((Object) name);
          var2 = AccountCreationProgressDialog.normalizeAccountName(-1, var6);
          if (guard <= 8) {
            field_c = (FontMetrics) null;
          }
          if (var2 == null) {
            return null;
          }
          var3 = (SocialContact) (CheckboxWidget.field_G.get((long)var2.hashCode(), 121));
          while (var3 != null) {
            var7 = (CharSequence) ((Object) var3.displayName);
            var4 = AccountCreationProgressDialog.normalizeAccountName(-1, var7);
            if (var4.equals(var2)) {
              stackIn_19_0 = var3;
              return stackIn_19_0;
            }
            var3 = (SocialContact) (CheckboxWidget.field_G.nextMatch(-126));
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_24_0 = var2_ref;
          stackIn_24_1 = new StringBuilder().append("hu.A(");
          if (name == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(guard).append(')').toString());
        }
    }

    final VertexAttribute attribute(int guard, int index) {
        int discarded$0 = 0;
        if (guard >= -70) {
          discarded$0 = this.attributeId((byte) 58, -64);
          return VertexAttribute.fromId(this.attributeId((byte) -110, index), (byte) -98);
        }
        return VertexAttribute.fromId(this.attributeId((byte) -110, index), (byte) -98);
    }

    public static void releaseStatics(int param0) {
        field_a = null;
        sqrtQ12 = null;
        field_c = null;
        if (param0 != 61303) {
          sqrtQ12 = (int[]) null;
        }
    }

    VertexStreamLayout(VertexAttribute attribute) {
        try {
          this.attributeCount = 1;
          this.packedAttributes = (long)attribute.id;
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "hu.<init>(" + (attribute != null ? "{...}" : "null") + ')');
        }
    }

    private final int attributeId(byte guard, int index) {
        if (guard != -110) {
          return -20;
        }
        return 15 & (int)(this.packedAttributes >> index * VertexAttribute.BITS_PER_ATTRIBUTE);
    }

    final int attributeCount(int guard) {
        if (guard != 44115) {
          this.packedAttributes = 81L;
          return this.attributeCount;
        }
        return this.attributeCount;
    }

    VertexStreamLayout(VertexAttribute[] attributes) {
        int var2_int = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          for (var2_int = 0; var2_int < attributes.length; var2_int++) {
            this.appendAttribute(attributes[var2_int], (byte) 72);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("hu.<init>(");
          if (attributes == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    private final void appendAttribute(VertexAttribute attribute, byte guard) {
        int fieldTemp$0 = 0;
        if (guard != 72) {
          return;
        }
        try {
          fieldTemp$0 = this.attributeCount;
          this.attributeCount = this.attributeCount + 1;
          this.packedAttributes = this.packedAttributes | (long)(attribute.id << VertexAttribute.BITS_PER_ATTRIBUTE * fieldTemp$0);
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "hu.D(" + (attribute != null ? "{...}" : "null") + ',' + guard + ')');
        }
    }

    static {
        field_a = new String[100];
        sqrtQ12 = new int[]{0, 4096, 5793, 7094, 8192, 9159, 10033, 10837, 11585, 12288, 12953, 13585, 14189, 14768, 15326, 15864, 16384, 16888, 17378, 17854, 18318, 18770, 19212, 19644, 20066, 20480, 20886, 21283, 21674, 22058, 22435, 22806, 23170, 23530, 23884, 24232, 24576, 24915, 25249, 25580, 25905, 26227, 26545, 26859, 27170, 27477, 27780, 28081, 28378, 28672, 28963, 29251, 29537, 29819, 30099, 30377, 30652, 30924, 31194, 31462, 31727, 31991, 32252, 32511, 32768, 33023, 33276, 33527, 33776, 34024, 34270, 34514, 34756, 34996, 35235, 35472, 35708, 35942, 36175, 36406, 36636, 36864, 37091, 37316, 37540, 37763, 37985, 38205, 38424, 38642, 38858, 39073, 39287, 39500, 39712, 39923, 40132, 40341, 40548, 40755, 40960, 41164, 41368, 41570, 41771, 41972, 42171, 42369, 42567, 42763, 42959, 43154, 43348, 43541, 43733, 43925, 44115, 44305, 44494, 44682, 44869, 45056, 45242, 45427, 45611, 45795, 45977, 46160, 46341, 46522, 46702, 46881, 47059, 47237, 47415, 47591, 47767, 47942, 48117, 48291, 48465, 48637, 48809, 48981, 49152, 49322, 49492, 49661, 49830, 49998, 50166, 50332, 50499, 50665, 50830, 50995, 51159, 51323, 51486, 51649, 51811, 51972, 52134, 52294, 52454, 52614, 52773, 52932, 53090, 53248, 53405, 53562, 53719, 53874, 54030, 54185, 54340, 54494, 54647, 54801, 54954, 55106, 55258, 55410, 55561, 55712, 55862, 56012, 56162, 56311, 56459, 56608, 56756, 56903, 57051, 57198, 57344, 57490, 57636, 57781, 57926, 58071, 58215, 58359, 58503, 58646, 58789, 58931, 59073, 59215, 59357, 59498, 59639, 59779, 59919, 60059, 60199, 60338, 60477, 60615, 60753, 60891, 61029, 61166, 61303, 61440, 61576, 61712, 61848, 61984, 62119, 62254, 62388, 62523, 62657, 62790, 62924, 63057, 63190, 63323, 63455, 63587, 63719, 63850, 63982, 64113, 64243, 64374, 64504, 64634, 64763, 64893, 65022, 65151, 65279, 65408};
    }
}
