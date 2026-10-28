/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SpriteLoadTask {
    static PcmSample field_i;
    static String field_e;
    static int field_m;
    private boolean waitForGroup;
    static int[] spriteWidths;
    static Sprite field_l;
    static String[] field_j;
    private int format;
    private String fileName;
    private ResourceArchive archive;
    private String groupName;
    private int[] xteaKey;
    private Sprite sprite;

    final Sprite loadSprite(int guard) {
        byte[] var3_array = null;
        byte[] var3_arrayLifetime2;
        if (this.sprite != null) {
          return this.sprite;
        }
        if (!this.waitForGroup) {
          int var2 = 5 % ((-30 - guard) / 48);
          if (this.format == 0) {
            this.sprite = MembershipPromotionScreen.loadNamedSprite(this.groupName, this.archive, this.fileName, true);
            return this.sprite;
          }
          if (this.format == 1) {
            Object var3 = null;
            if (this.xteaKey != null) {
              var3_array = this.archive.getNamedFileWithKey((byte) 78, this.groupName, this.fileName, this.xteaKey);
            } else {
              var3_array = this.archive.getNamedFile(-4, this.fileName, this.groupName);
            }
            this.sprite = new Sprite(var3_array, (java.awt.Component) ((Object) SpriteDecodeSupport.field_d));
            return this.sprite;
          }
          return this.sprite;
        }
        if (!this.archive.tryLoadNamedGroup(0, this.groupName)) {
          return null;
        }
        int var2Lifetime1 = 5 % ((-30 - guard) / 48);
        if (this.format == 0) {
          this.sprite = MembershipPromotionScreen.loadNamedSprite(this.groupName, this.archive, this.fileName, true);
          return this.sprite;
        }
        if (this.format != 1) {
          return this.sprite;
        }
        byte[] var3_arrayLifetime1 = null;
        if (this.xteaKey != null) {
          var3_arrayLifetime2 = this.archive.getNamedFileWithKey((byte) 78, this.groupName, this.fileName, this.xteaKey);
        } else {
          var3_arrayLifetime2 = this.archive.getNamedFile(-4, this.fileName, this.groupName);
        }
        this.sprite = new Sprite(var3_arrayLifetime2, (java.awt.Component) ((Object) SpriteDecodeSupport.field_d));
        return this.sprite;
    }

    final static void loadInfrastructureSprites(ResourceArchive archive, byte guard) {
        String stackIn_16_2 = null;
        int var6 = EscapeVector.obfuscationControl;
        try {
          NodeHashTableIterator.field_b = new Sprite[7][3];
          AccountMessagePanel.field_M = new Sprite[7][3];
          if (guard != -23) {
            SpriteLoadTask.releaseStatics(-112);
          }
          for (int var2_int = 0; IntroAudioSupport.field_f.length > var2_int; var2_int++) {
            String var3 = IntroAudioSupport.field_f[var2_int];
            if (var3 != null &&
              var3.length() != 0) {
              String var4 = "";
              NodeHashTableIterator.field_b[var2_int] = SpriteArchiveSupport.loadNamedSprites(archive, (byte) -112, var4, var3);
              String var5 = NameAvailabilityResult.field_b[var2_int];
              if (var5 != null &&
                var5.length() != 0) {
                AccountMessagePanel.field_M[var2_int] = SpriteArchiveSupport.loadNamedSprites(archive, (byte) -10, var4, var5);
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2 = decompiledCaughtException;
          RuntimeException stackIn_15_0 = var2;
          StringBuilder stackIn_15_1 = new StringBuilder().append("qh.B(");
          if (archive == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(guard).append(')').toString());
        }
    }

    final static void writeRatingQuery(RatingQuery query, boolean guard, int opcode) {
        try {
          CipherPacketBuffer var3 = QuickChatDynamicCommand.outgoingPackets;
          var3.writeCipheredOpcode(opcode, guard);
          var3.writeByte(query.requestId, -123);
          var3.writeByte(query.rowCount, -123);
        } catch (RuntimeException runtimeException) {
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) runtimeException), "qh.D(" + (query != null ? "{...}" : "null") + ',' + guard + ',' + opcode + ')');
        }
    }

    public static void releaseStatics(int guard) {
        if (guard != 7) {
          return;
        }
        field_j = null;
        field_i = null;
        spriteWidths = null;
        field_e = null;
        field_l = null;
    }

    SpriteLoadTask(ResourceArchive archive, String fileName, String groupName, int format, boolean waitForGroup, int[] xteaKey) {
        try {
          this.waitForGroup = waitForGroup ? true : false;
          this.archive = archive;
          this.format = format;
          this.groupName = groupName;
          this.fileName = fileName;
          this.xteaKey = xteaKey;
        } catch (RuntimeException runtimeException) {
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) runtimeException), "qh.<init>(" + (archive != null ? "{...}" : "null") + ',' + (fileName != null ? "{...}" : "null") + ',' + (groupName != null ? "{...}" : "null") + ',' + format + ',' + waitForGroup + ',' + (xteaKey != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_j = new String[]{"Sit down, commander. Prepare for mission briefing.", "As you know, aliens broke into Earth's most advanced <photo>weapons and technology installation.<br>They used <photo>cloaking devices and would have made good their escape...", "...had our most powerful items not had tracking devices fitted,<br>allowing us to <photo>track the aliens to their home system.", "Your mission is to take your ship, the OSS Katsuro, into the caves where our equipment is being stored.<br><photo>You must overcome the aliens' defences and recover the equipment.", "Our emergency rescue teleporter has enough power for two transmissions.<br>The aliens will attempt to stop you and we can only save your life twice...", "...so we are relying on your skills as a pilot to win the <title>day for Earth."};
        field_e = "Shield recharged";
    }
}
